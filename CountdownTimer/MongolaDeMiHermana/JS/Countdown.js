window.onload = initialize;

var timeinterval;
var timeRemaining;
var btnStop;
var btnPlay;
var btnPause;
var btnResume;
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

function initializeClock() {
  var deadline = new Date(Date.parse(new Date()) + timeRemaining);
  var clock = document.getElementById("clockdiv");
  var minutesSpan = clock.querySelector('.minutes');
  var secondsSpan = clock.querySelector('.seconds');

  function updateClock() {
    var t = getTimeRemaining(deadline);

    minutesSpan.innerHTML = ('0' + t.minutes).slice(-2);
    secondsSpan.innerHTML = ('0' + t.seconds).slice(-2);
    timeRemaining -= 1000;
    if (t.total <= 0) {
      clearInterval(timeinterval);

    }
  }
  updateClock();
  timeinterval = setInterval(updateClock, 1000)
}

function restartClock() {
  clearInterval(timeinterval);
  timeRemaining = 1800000;
  initializeClock();
  stopClock();
}

function stopClock() {
  clearInterval(timeinterval);

}

function resumeClock() {
  initializeClock();

}

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

