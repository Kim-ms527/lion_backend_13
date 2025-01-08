const dog = {
  name: "멍멍이",
  sound: "멍멍!!",
  say: function () {
    console.log(this.sound);
    console.log("dog 객체안에서의 ::  " + this);
  },
  say2: () => {
    console.log("화살표 함수:::" + this);
    console.log(this.sound);
  },
};

dog.say();
dog.say2();

function test() {
  console.log(this);
}

test();
