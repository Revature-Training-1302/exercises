/*
* Abderrahim bahia
* API Exercise Part II
* Sending requests using Fetch
 */

document.getElementById('btn').addEventListener('click', getData);

function getData() {
    let name = document.getElementById('name').value;
    const base_url = `https://api.itbook.store/1.0/search/${name}`;
    
    fetch(`${base_url}`)

    .then(response => response.json())

    .then(data => {

        let htmlText = '';
        for (var i = 0; i < data.books.length; i++) {
            htmlText += `</br><li> <span>Title:</span> ${data.books[i]['title']}</li>`;
            htmlText += `<li> <span>Subtile:</span> ${data.books[i]['subtitle']}</li>`;
            htmlText += `<li> <span>ISBN:</span> ${data.books[i]['isbn13']}</li>`;
            htmlText += `<li> <span>Price:</span> ${data.books[i]['price']}</li>`;
            htmlText += `<li> <span>URL:</span> <a href="${data.books[i]['url']}>${data.books[i]['title']}</a></li>`;
            }

            document.getElementById('result').innerHTML = htmlText;
    })
    
    .catch(error => {
        // display an error message in red:
        document.getElementById('result').innerHTML = `<h1 style = "color: red;">Something went wrong with the request</h1>`;
        var p = document.createElement('p');
        p.innerText = `${error}</p>`
        document.getElementById('result').appendChild(p);
    });
}