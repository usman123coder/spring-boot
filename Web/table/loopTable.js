var data = [
    {
        ID : "101",
        Name : "Salman",
        Fee : "2500.00",
    },
    {
        ID : "102",
        Name : "Usman",
        Fee : "2500.00",
    },
    {
        ID : "103",
        Name : "Haziq",
        Fee : "4400.00",
    },
    {
        ID : "103",
        Name : "Haziq",
        Fee : "4400.00",
    },
    {
        ID : "103",
        Name : "Haziq",
        Fee : "4400.00",
    },
    {
        ID : "103",
        Name : "Haziq",
        Fee : "4400.00",
    },
    {
        ID : "103",
        Name : "Haziq",
        Fee : "4400.00",
    },
    {
        ID : "103",
        Name : "Haziq",
        Fee : "4400.00",
    },
    {
        ID : "103",
        Name : "Haziq",
        Fee : "4400.00",
    },
    {
        ID : "103",
        Name : "Haziq",
        Fee : "4400.00",
    },
    {
        ID : "103",
        Name : "Haziq",
        Fee : "4400.00",
    },
    {
        ID : "103",
        Name : "Haziq",
        Fee : "4400.00",
    },
    {
        ID : "103",
        Name : "Haziq",
        Fee : "4400.00",
    },
    {
        ID : "103",
        Name : "Haziq",
        Fee : "4400.00",
    },
    {
        ID : "103",
        Name : "Haziq",
        Fee : "4400.00",
    },
];

function createTable(){
    var table = document.createElement("table"); //<table></table>
    var tr1 = document.createElement("tr");      //<table><tr></tr></table>
    
    var th1 = document.createElement("th");
    var th2 = document.createElement("th");
    var th3 = document.createElement("th");
    
    th1.innerText = "ID";
    th2.innerText = "Name";
    th3.innerText = "Fee";

    tr1.appendChild(th1);
    tr1.appendChild(th2);
    tr1.appendChild(th3);

    table.width = "800px";
    table.frame = "box";
    table.rules = "all";
    table.style.margin = "10px auto";
    table.cellPadding = "10px";
    tr1.style.backgroundColor = "red";
    tr1.style.color = "white";

    table.appendChild(tr1);

    for (var i = 0; i < data.length; i++) {
        var tr = document.createElement("tr");
        
        var td1 = document.createElement("td");
        var td2 = document.createElement("td");
        var td3 = document.createElement("td");

        td1.innerText = data[i].ID;
        td2.innerText = data[i].Name;
        td3.innerText = data[i].Fee;

        tr.appendChild(td1);
        tr.appendChild(td2);
        tr.appendChild(td3);

        table.appendChild(tr);
    }

    // Append the table to the div
    var div = document.querySelector("div");
    div.appendChild(table);
}