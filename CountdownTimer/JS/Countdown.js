window.onload = initialize;

<<<<<<< Updated upstream
var timeinterval; //El intervalo de tiempo que se recorre
var timeRemaining; //El tiempo restante que queda por recorrer
var btnStop; //Botón que reiniciar el reloj y lo pone en 30 minutos
var btnPlay;//Botón que comienza la cuenta atrás
var btnPause//Botón que pausa la cuenta atrás en el punto en el que está
var btnResum//Botón que que la reanuda

//Método que inicializa todos los botones y los eventos de cada uno de ellos
=======
var timeinterval;
var timeRemaining;
var btnStop;
var btnPlay;
var btnPause;
var btnResume;


>>>>>>> Stashed changes
function initialize() {
  btnStop = document.getElementById("btnStop");
  btnPlay = document.getElementById("btnPlay");
  btnPause = document.getElementById("btnPause");
  btnResume = document.getElementById("btnResume");
  document.getElementById("btnStop").addEventListener("click", restartClock, false);
  document.getElementById("btnPause").addEventListener("click", stopClock, false);
  document.getElementById("btnResume").addEventListener("click", resumeClock, false);
  document.getElementById("btnPlay").addEventListener("click", resumeClock, false);
  document.getElementById("btnStop").addEventListener("click", changeStop, false);
  document.getElementById("btnPause").addEventListener("click", changePause, false);
  document.getElementById("btnResume").addEventListener("click", changeResume, false);
  document.getElementById("btnPlay").addEventListener("click", changePlay, false);
  restartClock();
  stopClock();
}

//Método que se encarga de comprobar el tiempo restante que queda y lo devuelve
function getTimeRemaining(endtime) {
  var t = Date.parse(endtime) - Date.parse(new Date());
  var seconds = Math.floor((t / 1000) % 60);
  var minutes = Math.floor((t / 1000 / 60) % 60);

  return {
    'total': t,
    'minutes': minutes,
    'seconds': seconds
  };
}

//Método que inicializa el reloj con el tiempo que le damos en la variable timeRemaining
function initializeClock() {
  var deadline = new Date(Date.parse(new Date()) + timeRemaining);
  var clock = document.getElementById("clockdiv");
  var minutesSpan = clock.querySelector('.minutes');
  var secondsSpan = clock.querySelector('.seconds');

  //Método que actualiza el reloj segundo a segundo
  function updateClock() {
    var t = getTimeRemaining(deadline);

    minutesSpan.innerHTML = ('0' + t.minutes).slice(-2);
    secondsSpan.innerHTML = ('0' + t.seconds).slice(-2);
    //Le vamos restando 1000 milisegundos que son un segundo
    timeRemaining -= 1000;
    if (t.total <= 0) {
      clearInterval(timeinterval);

    }
  }
  updateClock();
  timeinterval = setInterval(updateClock, 1000)
}

//Reinicia el reloj a 30
function restartClock() {
  clearInterval(timeinterval);
  timeRemaining = 1800000;
  initializeClock();
  stopClock();
}

//Pausa el reloj
function stopClock() {
  clearInterval(timeinterval);
}

//Reanuda el reloj
function resumeClock() {
  initializeClock();
}

//Métodos que cambian los botones unos por otros

function changeStop() {
  btnStop.style.display = 'none';
  btnPlay.style.display = 'block';
}

function changePlay() {
  btnStop.style.display = 'block';
  btnPlay.style.display = 'none';
}

function changePause() {
  btnPause.style.display = 'none';
  btnResume.style.display = 'block';
}

function changeResume() {
  btnPause.style.display = 'block';
  btnResume.style.display = 'none';
}

