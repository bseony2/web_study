const clockContainer = document.querySelector(".js-clock"),
    clockTitle = clockContainer.querySelector("h1");

function getTime() {
    const date = new Date();
    const minutes = date.getMinutes();
    const hours = date.getHours();
    const seconds = date.getSeconds();
    clockTitle.innerText = `${hours}:${minutes}:${seconds<10?  `0${seconds}` : seconds}`; 
                                //10초 아래일 경우 0이 하나 붙어서
}

function init() {
    getTime();
    setInterval(getTime, 1000); // 첫 인자는 실행할 함수, 두번째 인자는 실행할 함수의 간격
}

init();