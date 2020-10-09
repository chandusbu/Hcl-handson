const eventname = new Array();
const sortedname = new Array();

function addEvent() {
    var input_box = document.getElementById("EventName").value;
    console.log(input_box);

    let j = 0;
    for (i = 0; i < eventname.length; i++) {

        if (eventname[i] === input_box) {
            console.log(eventname);
            document.getElementById("Success_Message").innerHTML = "Name already Exists"
            j++;

        } else
            break;
    }

    if (j == 0) {
        let c = eventname.push(input_box);
        console.log(c);
        console.log(eventname);
        document.getElementById("Success_Message").innerHTML = "Successfully Added"
    }



}


function displayEvent() {
    eventname.sort();
    for (k = 0; k < eventname.length; k++) {
        document.getElementById("Result_list").innerHTML += " <li > " + eventname[k] + " </li>"
        console.log(eventname[k]);
    }}