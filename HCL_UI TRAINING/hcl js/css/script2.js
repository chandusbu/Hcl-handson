const eventname = new Array();


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
        document.getElementById("EventName").value = "";
    }



}

function removeEvent() {
    document.getElementById("Result_list").innerHTML = ""
    var input_box = document.getElementById("EventName").value;
    console.log(input_box);

    let c = eventname.pop(input_box);
    document.getElementById("Success_Message").innerHTML = "Removed Successfully"
    console.log(c);

    if (eventname.length == 0) {
        document.getElementById("Success_Message").innerHTML = "The List is Empty"
    }

}


function displayEvent() {

    let s = document.getElementById("Result_list");
    s.style.fontSize = "25px";
    s.style.color = "red";
    s.style.fontWeight = "bolder";
    s.innerHTML = "The Sorted List is"
    for (k = 0; k < eventname.length; k++) {

        document.getElementById("Result_list").innerHTML += " <li > " + eventname[k] + " </li>"
        console.log(eventname[k]);
    }
}