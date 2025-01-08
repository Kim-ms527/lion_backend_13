const numbers = {
  _a: 1,
  _b: 2,
  get a() {
    console.log("get a() 함수실행");
    return this._a;
  },
  get sum() {
    return this._a + this._b;
  },
  set a(value) {
    console.log("set a() 함수실행");
    this._a = value;
  },
};

numbers.a = 5;
console.log(numbers);

console.log(numbers.sum);

console.log(numbers.a);

numbers.a = 20;
console.log(numbers.a);
