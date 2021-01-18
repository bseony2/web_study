const form = document.querySelector(".js-form"),
    input = form.querySelector("input"),
    greeting = document.querySelector(".js-greetings");

const USER_LS = "currentUser",
    SHOWING_CN = "showing";

function saveName(text){
    localStorage.setItem(USER_LS, text); //
}

function handleSubmit(event){
    event.preventDefault(); //event의 기본 동작을 막음
    const currentValue = input.value; //입력한 값을 저장
    paintGreeting(currentValue); //글자 띄우고
    saveName(currentValue);// local storage에 해당 값 저장
}

function askForName(){
    form.classList.add(SHOWING_CN);
    form.addEventListener("submit", handleSubmit); //텍스트 박스에 넣고 입력했을때 이벤트
}

function paintGreeting(text) {
    form.classList.remove(SHOWING_CN);
    greeting.classList.add(SHOWING_CN);
    greeting.innerText = `Hello ${text}`;
}

function loadName() {
    const currentUser = localStorage.getItem(USER_LS);
    if (currentUser === null) {
        askForName(); //local storage에 값이 없을 때 입력 받기 위한
    } else {
        paintGreeting(currentUser);//local storage에 값이 있을 때 텍스트로
    }
}

function init() {
    loadName();
}

init();