/* esLint-disable*/
import './App.css';
import React, {useState} from 'react'

function App() {

  let [글제목, 글제목변경] = useState(['JPX', "state", 'event']);
  let [따봉, 따봉변경] = useState([0, 0, 0]);
  function 제목바꾸기(){
    var newArray = [...글제목];
    newArray[2] = 'button';
    글제목변경(newArray);
  }

  function 따봉바꾸기1(){
    var newArray = [...따봉];
    newArray[0] = newArray[0] + 1;
    따봉변경(newArray);
  }
  function 따봉바꾸기2(){
    var newArray = [...따봉];
    newArray[1] = newArray[1] + 1;
    따봉변경(newArray);
  }
  function 따봉바꾸기3(){
    var newArray = [...따봉];
    newArray[2] = newArray[2] + 1;
    따봉변경(newArray);
  }

  return (
    <div className="App">
      <div className="black-nav">
        <div >React 기초</div>
      </div>
      <button onClick={제목바꾸기}>버튼</button>
        <div className="list">
          <h3>{글제목[0]} <span onClick={ 따봉바꾸기1 }>👍</span>{따봉[0]}</h3>
          <p>재생목록 2</p>
          <hr/>
        </div>
        <div className="list">
          <h3>{글제목[1]}<span onClick={ 따봉바꾸기2 }>👍</span>{따봉[1]}</h3>
          <p>재생목록 3</p>
          <hr></hr>
        </div>
        <div className="list">
          <h3>{글제목[2]}<span onClick={ 따봉바꾸기3 }>👍</span>{따봉[2]}</h3>
          <p>재생목록 4</p>
          <hr></hr>
        </div>
        <Modal></Modal>
    </div>
  );
}

function Modal(){
  return (
    <div>
      <div className="modal">
        <h2>제목</h2>
        <p>날짜</p>
        <p>상세 내용</p>
      </div>
    </div>
  )
}

export default App;
