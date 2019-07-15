window.onload = function () {
	var input = document.getElementById("txtRespuesta");

	// Execute a function when the user releases a key on the keyboard
	input.addEventListener("keyup", function (event) {
		// Number 13 is the "Enter" key on the keyboard
		if (event.keyCode === 13) {
			// Cancel the default action, if needed
			event.preventDefault();
			// Trigger the button element with a click
			document.getElementById("btnSend").click();
		}
	});

	document.getElementById("btnSend").addEventListener("click", sendAnswer);
	document.getElementById("btnStart").addEventListener("click", restart);

	$('button.start').click(start);
	$('.play_again button').click(restart);
}


// 1
var questions = [
	[
		'Cocina con lo que tienes',
		1602179196
	],
	[
		'Responde y gana',
		242832258
	],
	[
		'Encuentra lo que necesites',
		99610
	],
	[
		'Y tú, ¿Estás invitado?',
		-1526690491
	]
];

// 2




var currentQuestion;
var questionTimer;
var timeForQuestion = 10;
var timeLeftForQuestion;


function sendAnswer() {
	var answer = document.getElementById('txtRespuesta').value;

	if (questions[currentQuestion][1] == hash(answer.toLowerCase())) {
		document.getElementById('txtRespuesta').value='';
		if (currentQuestion == questions.length-1) {
			finish();
		} else {
			moveToNextQuestion();
		}
	}
	else {
		restart();
	}

}

function hide() {
	$('.countdown').hide();
}

function show() {
	$('.countdown').show();
}

function restart() {
	currentQuestion = -1;
	timeLeftForQuestion = timeForQuestion;
	hide();
	$('.finish.card').hide();
	$('div.start').show();
	$('.times_up').hide();
	document.getElementById('txtRespuesta').value='';
	hideQuestions();
	generateCards();
	updateTime();
	clearTimeout(questionTimer);
}

function start() {
	document.getElementById('seconds').removeAttribute('hidden');
	show();
	$('div.start').fadeOut(200, function () {
		moveToNextQuestion();
		showQuestions();
	});
}

function moveToNextQuestion() {
	currentQuestion += 1;
	document.getElementById('pPregunta').innerHTML = questions[currentQuestion][0];
	setupQuestionTimer();
	updateTime();

}



function setupQuestionTimer() {
	clearTimeout(questionTimer);
	timeLeftForQuestion = timeForQuestion;
	questionTimer = setTimeout(countdownTick, 1000);
}


function showQuestions() {
	document.getElementById('divPreguntas').removeAttribute('hidden');
}

function hideQuestions() {
	document.getElementById('divPreguntas').setAttribute('hidden', true);
}


function countdownTick() {
	timeLeftForQuestion -= 1;
	updateTime();
	if (timeLeftForQuestion == 0) {
		restart();
	} else {
		questionTimer = setTimeout(countdownTick, 1000);
	}
}

function updateTime() {
	$('.countdown .time_left').html(timeLeftForQuestion);
}

function finish() {
	clearTimeout(questionTimer);
	document.getElementById("divPreguntas").setAttribute('hidden', true);
	$('.finish.card').show();
	hide();
}

function hash(string) {
	var hash = 0;
	if (string.length == 0) {
		return hash;
	}
	for (var i = 0; i < string.length; i++) {
		var char = string.charCodeAt(i);
		hash = ((hash << 5) - hash) + char;
		hash = hash & hash;
	}
	return hash;
}