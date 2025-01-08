//자바스크립트의 함수는 오버로딩이 되지 않아요.
function add(a) {
  console.log("a+a");
  return a + a;
}

function add(a, b) {
  console.log("a+b");
  return a + b;
}

// console.log(add(3));
add(2, 3);
add(2, 3, 4);
add(2, 3, 4, 5, 6, 7, 96, 9);
add(2, 4, 6, 7, 4, 7, 5, 44, 4, 44, 3222, 2);

function add(a, b, c) {
  console.log(arguments.length);
  console.log("1번째 매개변수 값::: " + arguments[0]);
}
