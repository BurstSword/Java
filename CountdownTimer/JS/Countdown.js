window.onload = initialize;

var timeinterval;
var timeRemaining;


function initialize() {
  document.getElementById("btnRestart").addEventListener("click", restartClock, false);
  document.getElementById("btnStop").addEventListener("click", stopClock, false);
  document.getElementById("btnResume").addEventListener("click", resumeClock, false);
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
      disableStopButton();
      disableResumeButton();
    }
  }
  updateClock();
  timeinterval = setInterval(updateClock, 1000)
}

function restartClock() {
  clearInterval(timeinterval);
  timeRemaining = 1800000;
  initializeClock();
  enableStopButton();
  disableResumeButton();
  stopClock();
}

function stopClock() {
  clearInterval(timeinterval);
  disableStopButton();
  enableResumeButton();
}

function resumeClock() {
  initializeClock();
  disableResumeButton();
  enableStopButton();
}

function disableStopButton() {
  document.getElementById('btnStop').disabled = true;
}

function enableStopButton() {
  document.getElementById('btnStop').disabled = false;
}

function disableResumeButton() {
  document.getElementById('btnResume').disabled = true;
}

function enableResumeButton() {
  document.getElementById('btnResume').disabled = false;
}

