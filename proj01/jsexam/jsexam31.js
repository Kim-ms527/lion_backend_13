function sleep(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}

async function makeError() {
  await sleep(1000);
  // const error = new Error();
  // throw error;
  console.log("1초 기다렸다가 해야할 일을 여기에 구현함!!");
}

async function process() {
  try {
    await makeError();
  } catch (e) {
    console.error(e);
  }
}

console.log("proceess 호출 전!!");
process();

console.log("process 호출 후!!");
