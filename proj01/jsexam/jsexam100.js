// 1. 재료 준비 시작...
// 2. 재료 준비 완료!

// 3. 요리 만들기 시작...
// 4. 요리 만들기 완료!

// 5. 접시에 담기 시작...
// 6. 접시에 담기 완료!

// 🎉 요리가 완성되었습니다!

// 이렇게 구현한다면??

// 비동기 동작을 시뮬레이션하는 delay 함수
function delay(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}

// 각 요리 단계 구현
async function prepareIngredients() {
  console.log("1. 재료 준비 시작...");
  await delay(2000); // 2초 대기
  console.log("2. 재료 준비 완료!");
}

async function cookDish() {
  console.log("3. 요리 만들기 시작...");
  await delay(3000); // 3초 대기
  console.log("4. 요리 만들기 완료!");
}

async function plateDish() {
  console.log("5. 접시에 담기 시작...");
  await delay(1000); // 1초 대기
  console.log("6. 접시에 담기 완료!");
}

// 전체 요리 과정 실행
async function makeDish() {
  console.log("🍳 요리를 시작합니다...");
  await prepareIngredients();
  await cookDish();
  await plateDish();
  console.log("🎉 요리가 완성되었습니다!");
}

// 실행
makeDish();
