function add(x,y){
    console.log(x+y)
}

function print(){
    console.log("xyz")
}

function fn(f){
    console.log(f);
    f();
    f();
}


fn(function(){
    var city = "Delhi";
    console.log(city);
});

console.log("-----------------------------------------------");

fn(print);

console.log("------------------------------------")

fn(add(10,20))