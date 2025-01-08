// map  새로운 배열을 만들어서 리턴해줘요.

const array = [1, 3, 5, 7, 4, 7, 6, 9];
const resultArr = [];

for (let i = 0; i < array.length; i++) {
  resultArr.push(array[i] * array[i]);
}

console.log(resultArr);

const resultArr2 = array.map((n) => n * n);

console.log(resultArr2);

const index = array.indexOf(5);
console.log(index);

const todos = [
  {
    id: 1,
    text: "자바스크립트 입문",
    done: false,
  },
  {
    id: 2,
    text: "함수 배우기",
    done: true,
  },
  {
    id: 3,
    text: "객체와 배열 배우기",
    done: true,
  },
  {
    id: 4,
    text: "배열 내장함수 배우기",
    done: false,
  },
];

const todoIndex = todos.findIndex((todo) => todo.id === 2);
console.log(todoIndex);

// for(let i = 0; i < todos.length; i++){
//     let todo = todos[i];
//     if(todo.id === 2){

//     }
// }

const todo = todos.find((todo) => todo.id === 2);
console.log(todo);

const falseTodo = todos.filter((todo) => todo.done === false);
console.log(falseTodo);

console.log(todos);
console.log("=============================");
const newTodos = todos.splice(1, 2);
console.log(newTodos);

console.log("=============================");
console.log(todos);
