window.onload = initialize;

var timeinterval;
var timeRemaining;

function initialize() {
  initializeClock();
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
  var deadline = new Date(Date.parse(new Date()) + (30 * 60 * 1000));
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

