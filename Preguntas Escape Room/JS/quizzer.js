
// 1
var questions = [
	[
		"¿Que se utiliza para estilizar un sitio web?",
		"Javascript",
		"CSS",
		"PHP",
		"AngularJS",
		1
	],
	[
		"¿Qué tipo de lenguaje es PHP?",
		"Interpretado",
		"Compilado",
		"Los 2 anteriores",
		"Ninguno de los anteriores",
		0
	],
	[
		"¿jQuery es una biblioteca para qué lenguaje?",
		"Python",
		"PHP",
		"Java",
		"Ninguno de los anteriores",
		3
	],
	[
		"¿Cómo se marca el inicio de código PHP?",
		"&lt;?php",
		"&lt;?",
		"Los 2 anteriores",
		"Ninguno de los anteriores",
		2
	],
	[
		"¿Quién diseño Javascript?",
		"Mark Zuckerberg",
		"Bill Gates",
		"Brendan Eich",
		"Rasmus Lerdorf",
		1
	],
];

// 2
var questionTemplate = _.template(" \
	<div class='card question'><span class='question'><%= question %></span> \
      <ul class='options'> \
        <li> \
          <input type='radio' name='question[<%= index %>]' value='0' id='q<%= index %>o1'> \
          <label for='q<%= index %>o1'><%= a %></label> \
        </li> \
        <li> \
          <input type='radio' name='question[<%= index %>]' value='1' id='q<%= index %>o2'> \
          <label for='q<%= index %>o2'><%= b %></label> \
        </li> \
        <li> \
          <input type='radio' name='question[<%= index %>]' value='2' id='q<%= index %>o3'> \
          <label for='q<%= index %>o3'><%= c %></label> \
        </li> \
        <li> \
          <input type='radio' name='question[<%= index %>]' value='3' id='q<%= index %>o4'> \
          <label for='q<%= index %>o4'><%= d %></label> \
        </li> \
      </ul> \
    </div> \
    ");



var currentQuestion
var questionTimer
var timeForQuestion = 10 
var timeLeftForQuestion


$(function () {

	
	$('button.start').click(start);
	
	$('.play_again button').click(restart);

	function hide(){
		$('.countdown').hide();
		$('.dot').hide();
	}

	function show(){
		$('.countdown').show();
		$('.dot').show();
	}

	

	function restart() {
		currentQuestion = 0;
		timeLeftForQuestion = timeForQuestion;
		hide();
		$('.finish.card').hide();
		$('div.start').show();
		$('.times_up').hide();
		generateCards();
		updateTime();
		clearTimeout(questionTimer);
	}
	hide();
	
	function start() {
		show();
		$('div.start').fadeOut(200, function () {
			moveToNextQuestion();
		});
	}

	
	function generateCards() {
		$('.questions').html('');
		for (var i = 0; i < questions.length; i++) {
			var q = questions[i];
			var html = questionTemplate({
				question: q[0],
				index: i,
				a: q[1],
				b: q[2],
				c: q[3],
				d: q[4]
			});
			$('.questions').append(html);
		};
		$('.question.card input').change(optionSelected);
	}

	
	function moveToNextQuestion() {
		currentQuestion += 1;
		if (currentQuestion > 1) {
			$('.question.card:nth-child(' + (currentQuestion - 1) + ')').hide();
		}
		showQuestionCardAtIndex(currentQuestion);
		setupQuestionTimer();
		updateTime();
	}

	
	function setupQuestionTimer() {
		if (currentQuestion > 1) {
			clearTimeout(questionTimer);
		}
		timeLeftForQuestion = timeForQuestion;
		questionTimer = setTimeout(countdownTick, 1000);
	}

	
	function showQuestionCardAtIndex(index) { 
		$('.question.card:nth-child(' + index + ')').show();
	}

	
	function countdownTick() {
		timeLeftForQuestion -= 1;
		updateTime();
		if (timeLeftForQuestion == 0) {
			restart();
		}else{
			questionTimer = setTimeout(countdownTick, 1000);
		}
	}

	

	function updateTime() {
		$('.countdown .time_left').html(timeLeftForQuestion);
	}

	 
	function optionSelected() {
		var selected = parseInt(this.value);
		var correct = questions[currentQuestion - 1][5];

		if (selected == correct) {
			moveToNextQuestion();
			correctAnimation();
		} else {
			wrongAnimation();
			restart();
		}

		if (currentQuestion == questions.length+1) {
			clearTimeout(questionTimer);
			finish();
		}
	}

	function correctAnimation() {
		animatePoints('right');
	}

	function wrongAnimation() {
		animatePoints('wrong');
	}

	function animatePoints(cls) {
		$('header .dot').addClass('animate ' + cls);
		setTimeout(function() {
			$('header .dot').removeClass('animate ' + cls);
		}, 600);
	}

	function finish() {
		$('.question.card:visible').hide();
		$('.finish.card').show();
		hide();
	}

	restart();

});