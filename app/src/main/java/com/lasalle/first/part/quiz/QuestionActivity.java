package com.lasalle.first.part.quiz;

import android.support.v4.util.ArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.lasalle.first.part.quiz.R.id.questionTextView;

public class QuestionActivity extends AppCompatActivity {

    private String PROGRESS_QUESTION_TEXT = "Question ?/5";
    Question [] questions = new Question[5];
    Integer currentQuestion;
    QuizResult result;

    Button submitButton;
    RadioGroup radioGroup;
    TextView questionTextView;
    TextView progressTextView;
    RadioButton firstAnswer;
    RadioButton secondAnswer;
    RadioButton thirdAnswer;
    RadioButton fourthAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        init();
        initQuestions();
        showQuestion();
    }

    private void init(){
        result = new QuizResult(questions.length);
        currentQuestion = 0;

        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setEnabled(false);

        questionTextView = (TextView) findViewById(R.id.questionTextView);
        progressTextView = (TextView) findViewById(R.id.progressTextView);

        radioGroup = (RadioGroup) findViewById(R.id.answersRadioGroup);
        radioGroup.getCheckedRadioButtonId();

        firstAnswer = (RadioButton) findViewById(R.id.firstAnswerRadioButton);
        secondAnswer = (RadioButton) findViewById(R.id.secondAnswerRadioButton);
        thirdAnswer = (RadioButton) findViewById(R.id.thirdAnswerRadioButton);
        fourthAnswer = (RadioButton) findViewById(R.id.fourthAnswerRadioButton);
    }

    private void initQuestions(){
        String question1 = "Who won the 15/16 NBA championship?";
        String [] answers1List = new String[4];
        answers1List[0] = "Cleveland cavaliers";
        answers1List[1] = "Golden State Warriors";
        answers1List[2] = "San Antonio Spurs";
        answers1List[3] = "Toronto Raptors";
        questions[0] = new Question(question1, answers1List, 0);

        String question2 = "Who won the 14/15 Euroleague Basketball?";
        String [] answers2List = new String[4];
        answers2List[0] = "FCB Barcelona";
        answers2List[1] = "Olympiacos";
        answers2List[2] = "Real Madrid";
        answers2List[3] = "CSKA Moscú";
        questions[1] = new Question(question2, answers2List, 2);

        String question3 = "Who won the 2013 MotoGP world title?";
        String [] answers3List = new String[4];
        answers3List[0]="Jorge Lorenzo";
        answers3List[0]="Marc Márquez";
        answers3List[0]="Valentino Rossi";
        answers3List[0]="Dani Pedrosa";
        questions[2] = new Question(question3, answers3List, 2);

        String question4 = "Who won the 2014 World Cup?";
        String [] answers4List = new String[4];
        answers4List[0]="Argentina";
        answers4List[1]="Brazil";
        answers4List[2]="Spain";
        answers4List[3]="Germany";
        questions[3] = new Question(question4, answers4List, 4);

        String question5 = "Who won the 2010 Roland Garros?";
        String [] answers5List = new String[4];
        answers5List[0]="Novak Djokovic";
        answers5List[1]="Roger Federer";
        answers5List[2]="Rafa Nadal";
        answers5List[3]="Juan Carlos Ferrero";
        questions[4] = new Question(question5, answers5List, 3);
    }

    public void showQuestion(){
        questionTextView.setText(questions[currentQuestion].getQuestion());

        firstAnswer.setText(questions[currentQuestion].getQuestionList()[0]);
        secondAnswer.setText(questions[currentQuestion].getQuestionList()[1]);
        thirdAnswer.setText(questions[currentQuestion].getQuestionList()[2]);
        fourthAnswer.setText(questions[currentQuestion].getQuestionList()[3]);

        progressTextView.setText(PROGRESS_QUESTION_TEXT.replace("?", (currentQuestion + 1) + ""));

        //String radiovalue = ((RadioButton)findViewById(rg.getCheckedRadioButtonId())).getText().toString();
    }


}
