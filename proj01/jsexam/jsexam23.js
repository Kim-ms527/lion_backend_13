function work() {
  setTimeout(() => {
    console.log("work 작업 완료!!");
  }, 0);
}

console.log("start!!");
work();
console.log("next work!!");

console.log("end!!");
