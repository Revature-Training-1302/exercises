/*
* Abderrahim bahia
* API Exercise Part I
* Sending requests using Fetch
 */

let button = document.getElementById('btnSubmit');

try{
    button.addEventListener('click', sendRequest);

    function sendRequest(){
        const baseUrl = "https://api.thecatapi.com/v1/images/search";

        let request = new XMLHttpRequest();
        request.open('GET', baseUrl, true);

        request.onreadystatechange = function(){
            if(this.readyState == 4 && this.status == 200)
            {
                var parsedResponse = JSON.parse(this.responseText);
                var characters = parsedResponse.results;

                console.log(parsedResponse);
                var htmlText = '';
                for(const character of parsedResponse)
                {
                    htmlText +=`<img src="${character.url}">`;
                    console.log(htmlText);
                }

                document.getElementById('result').innerHTML = htmlText;
            }
        }

        request.send();
    }
}
catch{
    console.error("Something went worng!");
}
