const superheroes = ["아이언맨", "캡틴 아메리카", "토르", "닥터 스트레인지"];

for (let i = 0; i < superheroes.length; i++) {
  console.log(superheroes[i]);
}

//배열의 내장함수 forEach   ( 내가 해야할일을을 구현한 함수 )
const hi = function (name) {
  console.log("hi " + name);
};
superheroes.forEach(hi);

console.log("=========================");
superheroes.forEach(function (name) {
  console.log("hi " + name);
});

console.log("=========================");
superheroes.forEach((name) => console.log("hi " + name));
