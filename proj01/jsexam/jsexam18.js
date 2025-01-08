// 단축평가
// 논리 연산자를 사용.

const food = { foodName: "피자" };

function getFoodName(food) {
  if (!food) return;
  return food.foodName;
}

console.log(getFoodName(food));
// const food2 = null;
// console.log(getFoodName());

//단축평가를 이용해서 getFoodName 함수를 수정
function getFoodName(food) {
  return food && food.foodName;
}

console.log(true && "hello");
console.log(false && "hello");

console.log(true || "hello");
console.log(false || "hello");

//자바스크립트에서 false라고 판단하는 경우
console.log("============================");
console.log("" || "hello");
console.log(0 || "hello");
console.log(null || "hello");
console.log(undefined || "hello");

console.log("a" || "hello");
console.log(1 || "hello");

let a;
let b = null;
let c = undefined;
let d = 4;
let e = "test";

let f = a || b || c || d || e;

console.log(f);

const name = null;

const userName = name || "guest";

console.log(userName);
