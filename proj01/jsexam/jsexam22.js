let name = "kang";

function hi() {
  console.log(name + "hello!!!");
}

console.log("start!!");
setTimeout(hi, 0);
console.log("hi end!!");

setTimeout(function () {
  console.log("test");
}, 0);

setTimeout(() => {
  console.log("test22");
}, 0);
console.log("!!");
console.log("end!!");
