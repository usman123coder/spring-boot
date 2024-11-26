function myfn(x, y) {
    var result = x + y;
  
    return function () {
      console.log(x + y);
    };
  }
  
  var output = myfn(1, 5);
  console.log(output);
  output();

  function fnReturn() {
    return "I am Returning Something";
    var x = 100;
    console.log(x);
    console.log("ckdsbjcdjksbvjdksb");
  }
  
  var result = fnReturn();
  console.log(result);