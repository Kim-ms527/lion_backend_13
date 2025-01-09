const person = {
  name: "carami",
  job: {
    title: "student",
    manager: {
      name: "kang",
    },
  },
};

function printmanagerName(person) {
  console.log(person.job.manager.name);
  //이렇게 작성되면 job이나 manager가 없는 객체는 오류발생!!
  //오류가 발생되지 않도록 구현해 보세요.
}

function printmanagerName(person) {
  console.log(
    person && person.job && person.job.manager && person.job.manager.name
  );
}

//?.
function printmanagerName(person) {
  console.log(person?.job?.manager?.name);
}
printmanagerName(person);
printmanagerName({ name: "kim" });
printmanagerName({});

const kang = {
  name: "kang",
  admin() {
    console.log("관리자입니다.");
  },
};
const kim = {
  name: "kim",
};

//?.()
kang.admin?.();
kim.admin?.();

//?.[]

console.log(kang?.["age"]);
const hong = {};
console.log(hong?.["name"]);
