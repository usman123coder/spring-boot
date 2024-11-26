function createTable(){
    var table = document.createElement("table"); //<table></table>
    var tr1 = document.createElement("tr");      //<table><tr></tr></table>
    var tr2 = document.createElement("tr");
    var tr3 = document.createElement("tr");

    var th1 = document.createElement("th");
    var th2 = document.createElement("th");
    var th3 = document.createElement("th");
    
    th1.innerText = "ID";
    th2.innerText = "Name";
    th3.innerText = "Fee";

    tr1.appendChild(th1);
    tr1.appendChild(th2);
    tr1.appendChild(th3);

    var td1 = document.createElement("th");
    var td2 = document.createElement("th");
    var td3 = document.createElement("th");

    td1.innerText = 101;
    td2.innerText = "Rahul";
    td3.innerText = 7500.00;

    tr2.appendChild(td1);
    tr2.appendChild(td2);
    tr2.appendChild(td3);

    var td4 = document.createElement("th");
    var td5 = document.createElement("th");
    var td6 = document.createElement("th");

    td4.innerText = 102;
    td5.innerText = "Usman";
    td6.innerText = 6500.00;

    tr3.appendChild(td4);
    tr3.appendChild(td5);
    tr3.appendChild(td6);

    table.appendChild(tr1);
    table.appendChild(tr2);
    table.appendChild(tr3);

    table.width = "800px";
    table.frame = "box";
    table.rules = "all";
    table.style.margin = "10px auto";
    table.cellPadding = "10px";
    tr1.style.backgroundColor = "red";
    tr1.style.color = "white";

    var div = document.querySelector("div");
    div.appendChild(table);
}