var timeleft = 3;
var downloadTimer = setInterval(function(){
    document.getElementById("timer").innerText = (3 - --timeleft).toString();
    if(timeleft <= 0)
        clearInterval(downloadTimer);

    if (timeleft === 0) {
        document.getElementById("webcam").hidden = true;

        const canvas = document.createElement('canvas'); // create a canvas

        canvas.width = document.getElementById("webcam").videoWidth; // set its size to the one of the video
        canvas.height = document.getElementById("webcam").videoHeight;
        canvas.getContext('2d')
            .drawImage(video, 0, 0, canvas.width, canvas.height);

        var img = document.createElement("img");
        img.src = canvas.toDataURL();
        document.getElementById("output").prepend(img);


        // Sending and receiving data in JSON format using POST method

        // Make the REST API call.
        $.ajax({
            url: "https://southcentralus.api.cognitive.microsoft.com/customvision/v2.0/Prediction/1b2c0a21-2177-4299-aa3f-fe218235cdc4/url",

            // Request headers.
            beforeSend: function(xhrObj){
                xhrObj.setRequestHeader("Content-Type","application/json");
                xhrObj.setRequestHeader(
                    "Prediction-Key", "e468e9927724421ea6995c7293a13788");
            },

            type: "POST",

            // Request body.
            data: '{"url": ' + '"' + "https://www.medicalnewstoday.com/content/images/hero/079/79115/79115_256.jpg" + '"}',
        })

            .done(function(data) {
                // Show formatted JSON on webpage.
                alert(JSON.stringify(data));
            })
    }

},1000);

