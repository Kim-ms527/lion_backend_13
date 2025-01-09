const array = [1, 2, 3, 4, 5];
console.log(array.join(":"));

const sum = array.reduce((acc, curr) => acc + curr, 0);
console.log(sum);

const sum2 = array.reduce((acc, curr) => {
  console.log(`누적값: ${acc} , 현재값 : ${curr}`);
  return acc + curr;
}, 0);

let value = 0;
