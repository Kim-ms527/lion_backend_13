const kang = {
  name: "kang",
  phone: "011-1111-1111",
  say: function () {
    console.log("말을하다");
  },
};

const kim = {
  name: "kim",
  phone: "011-222-2222",
  say: function () {
    console.log("말을하다");
  },
};

function Animal(type, name, sound) {
  this.type = type;
  this.name = name;
  this.sound = sound;
  this.say = function () {
    console.log(this.sound);
  };
}

const dog = new Animal("개", "멍멍이", "멍멍");
const cat = new Animal("고양이", "야옹이", "야옹");

dog.say();
cat.say();

dog.say = function () {
  console.log("몰라몰라.");
};

dog.say();
cat.say();
