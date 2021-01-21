const COORDS = 'coords';

function saveCoords(coordsObj){
    localStorage.setItem(COORDS, JSON.stringify(coordsObj));
}

function handleGeoSucess(position){
    const latitude = position.coords.latitude;
    const longitude = position.coords.longitude;
    const coordsObj = {
        latitude,
        longitude //object 객체에서 키와 벨류의 값을 같게 하는 경우
    };
    saveCoords(coordsObj);
}

function handleGeoError(){
    console.log("can't access geo location");
}

function askForCoords(){
    navigator.geolocation.getCurrentPosition(handleGeoSucess, handleGeoError);
}

function loadCoords(){
    const loadedCords = localStorage.getItem(COORDS);
    if(loadedCords === null){
        askForCoords();
    }else{
        
    }
}

function init(){
    loadCoords();
}

init();