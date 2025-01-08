const ironMan = {
  name: "토니 스타크",
  actor: "로버트 다우니 주니어",
  alias: "아이언맨",
};

const captainAmerica = {
  name: "스티븐 로저스",
  actor: "크리스 에반스",
  alias: "캡틴 아메리카",
};

console.log(ironMan);

console.log(ironMan.actor);

function print(hero) {
  console.log(
    `${hero.alias}(${hero.name}) 역할을 맡은 배우는 ${hero.actor}입니다.`
  );
}

print(captainAmerica);
print(ironMan);

console.log(ironMan["name"]);

//객체 비구조화 할당
function print(hero) {
  const { name, alias, actor } = hero;
  console.log(`${alias}(${name}) 역할을 맡은 배우는 ${actor}입니다.`);
}

function print({ alias, name, actor }) {
  console.log(`${alias}(${name}) 역할을 맡은 배우는 ${actor}입니다.`);
}

const dog = {
  name: "멍멍이",
  age: 3,
};

const { name, age } = dog;
