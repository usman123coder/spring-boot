var Salary = [12000, 11000, 22000, 14000];

var filteredArray1 = Salary.filter(function (element, index) {
    return element < 15000;
})

if (filteredArray1.length > 0) {  // Check if there are any elements that match the condition
    Salary = Salary.map(function (element) {
        if (element < 10000) {
            return element + 2000;  // Increment by 2000 or any desired amount
        }
        return element;  // Return the element unchanged if it's not less than 15000
    });
    console.log("Updated Salary:", Salary);
} else {
    console.log("Salary not incremented");
}

var arr = [8, 8, 100];

var filteredArray = arr.filter(function (element, index) {
    // console.log(element+100);
    if (element < 10)
        console.log(element + 100);
})

arr.forEach(function (element, index) {
    console.log(element + 100);
});