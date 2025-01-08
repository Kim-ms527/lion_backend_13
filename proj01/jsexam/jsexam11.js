for (let i = 0; i < 10; i++) {
  console.log(i);
}

const names = ["a", "b", "c"];
for (let i = 0; i < names.length; i++) {
  console.log(names[i]);
}

const dog = {
  name: "멍멍이",
  age: 2,
  sound: "멍멍!!",
};

for (let key in dog) {
  console.log(dog[key]);
}

let i = 0;
while (i < 10) {
  console.log(i);
  i++;
}

for (let name of names) {
  console.log(name);
}

console.log(Object.entries(dog));
console.log(Object.keys(dog));
console.log(Object.values(dog));
