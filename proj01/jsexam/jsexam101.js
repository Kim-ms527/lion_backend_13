//jsexam100번을 async await 없이 구현한다면..

// 비동기 동작을 시뮬레이션하는 delay 함수
function delay(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}

// 각 요리 단계 구현
function prepareIngredients() {
  console.log("1. 재료 준비 시작...");
  return delay(2000).then(() => {
    console.log("2. 재료 준비 완료!");
  });
}

function cookDish() {
  console.log("3. 요리 만들기 시작...");
  return delay(3000).then(() => {
    console.log("4. 요리 만들기 완료!");
  });
}

function plateDish() {
  console.log("5. 접시에 담기 시작...");
  return delay(1000).then(() => {
    console.log("6. 접시에 담기 완료!");
  });
}

// 전체 요리 과정 실행
function makeDish() {
  console.log("🍳 요리를 시작합니다...");
  prepareIngredients()
    .then(() => cookDish())
    .then(() => plateDish())
    .then(() => {
      console.log("🎉 요리가 완성되었습니다!");
    })
    .catch((error) => {
      console.error("❌ 요리 중 문제가 발생했습니다:", error);
    });
}

// 실행
makeDish();
