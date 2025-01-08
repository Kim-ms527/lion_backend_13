//자바스크립트는 함수를 일급객체로 취급한다.
//함수도 타입이 될 수 있다.
console.log(value);

function test() {
  console.log("test");
  return 10;
}

let a = test(); //a = 10;

let b = test; //b 에는 test함수가 들어감.

console.log(a);

console.log(b);

b();

console.log("sum함수 호출 전!!!");
sum(b);
console.log("sum함수 호출 후!!!");
function sum(i) {
  //함수의 매개변수로 함수를 받을 수 있다.
  i();
}

var value = 10;
