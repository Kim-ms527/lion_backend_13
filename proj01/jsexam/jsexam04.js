hello();

//이코드가 실행될때 무슨일이 일어날까요?
//호이스팅 안됨.  오류발생
// func1();

//함수 호이스팅
function hello() {
  console.log("hello");
}

//중복가능
//중복정의 되었을 때는 가장 마지막에 정의된 함수가 실행된다.
function hello() {
  console.log("hi");
}

//함수는 일급객체이므로 상수에 대입이 가능하다.
const func1 = function () {
  console.log("function hello!!");
};

func1();

//값 두개 받아서 더해서 결과값을 리턴하는 함수를 정의해봅시다.
function sum(a, b) {
  return a + b;
}

console.log(sum(1, 2));

const sum2 = function (a, b) {
  return a + b;
};

console.log(sum2(1, 2));

//화살표 함수 (매개변수들,,) => 구현부
const func2 = () => console.log("function hello!!");

const sum3 = (a, b) => a + b;

func2();
let value = sum3(1, 2);
console.log(value);

const hi = (name) => console.log(`haha   ${name}   안녕^^`);

hi("carami");
