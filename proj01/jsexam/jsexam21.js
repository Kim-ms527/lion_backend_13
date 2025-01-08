function work() {
  console.log("work start!!");
  const start = Date.now();
  for (let i = 0; i < 100000000; i++) {}
  const end = Date.now();
  console.log(end - start + "ms");
  console.log("work end!!");
}

console.log("start!!");
work();
console.log("end");
