function Animal(type, name, sound) {
  this.type = type;
  this.name = name;
  this.sound = sound;
}

Animal.prototype.say = function () {
  console.log(this.sound);
};
Animal.prototype.sharedValue = 1;

const dog = new Animal("개", "멍멍이", "멍멍");
const cat = new Animal("고양이", "야옹이", "야옹");

dog.say();
cat.say();

Animal.prototype.say = function () {
  console.log("몰라몰라");
};

dog.say();
cat.say();

console.log(dog.sharedValue);

cat.say = function () {
  console.log("야옹야옹");
};

dog.say();
cat.say();

function Dog(name, sound) {
  Animal.call(this, "개", name, sound);
}
Dog.prototype = Animal.prototype;

function Cat(name, sound) {
  Animal.call(this, "고양이", name, sound);
}
Cat.prototype = Animal.prototype;

const dog2 = new Dog("멍멍이", "멍멍");
const cat2 = new Cat("야옹이", "야옹");

dog2.say();
cat2.say();
