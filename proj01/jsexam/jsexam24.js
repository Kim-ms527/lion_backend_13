function work(callback) {
  console.log("work start!!!");
  setTimeout(() => {
    console.log("work 작업 완료!!");

    callback();
  }, 0);
}

console.log("start!!");
work(() => {
  console.log("work end!!");
});
console.log("next work!!");

console.log("end!!");

setInterval(() => {
  console.log("hi");
}, 1000);
