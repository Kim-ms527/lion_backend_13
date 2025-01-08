// 배열  []
let array1 = [1, 2, 3];

array1 = [4, 5, 6];

const array2 = [];
console.log(typeof array2);

console.log(array1[0]);

array1[2] = 20;

console.log(array1);

const array3 = new Array(10); //값이 1개만들어오면, 값의 크기 배열을 생성.
console.log(array3);

const array4 = new Array(10, 2);
console.log(array4);

array1[0] = { name: "kang" };
console.log(array1);

array1.push(10);
console.log(array1);

array1.push(() => console.log("hello array!!"));
console.log(array1);

// 저기 마지막 요소에 들어있는 함수를 실행하려면??
// 저 마지막에 들어간 함수를 꺼내려면???
console.log(array1[4]);

array1[4]();

console.log(array1);
// 배열 비구조할당   --  변수명은 중요하지 않으나,  순서가 중요!!
const [a, b, c, d, e] = array1;

console.log(a);
console.log(b);
console.log(c);
console.log(d);
console.log(e);
e();

const func = array1[4];
console.log(array1);

console.log("====================");
console.log(array1.pop());
console.log(array1);
