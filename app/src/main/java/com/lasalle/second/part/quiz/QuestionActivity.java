package com.lasalle.second.part.quiz;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.lasalle.second.part.quiz.manager.QuestionManager;
import com.lasalle.second.part.quiz.models.Answer;
import com.lasalle.second.part.quiz.models.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private QuestionManager questionManager;
    private int currentQuestionIndex = 0;
    private List<RadioButton> radioButtonList;
    private RadioGroup radioGroup;
    private Button submitButton;
    private int totalQuestions = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        radioButtonList = new ArrayList<>();
        radioButtonList.add((RadioButton) findViewById(R.id.answer1));
        radioButtonList.add((RadioButton) findViewById(R.id.answer2));
        radioButtonList.add((RadioButton) findViewById(R.id.answer3));
        radioButtonList.add((RadioButton) findViewById(R.id.answer4));

        questionManager = new QuestionManager();
        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(this);

        totalQuestions  = questionManager.countQuestions();
        formatTitle();
        formatQuestion();
    }

    @Override
    public void onClick(View view) {
        currentQuestionIndex++;
        if (currentQuestionIndex < totalQuestions){
            formatTitle();
            formatQuestion();
            radioGroup.clearCheck();
        } else {
            Intent intent = new Intent(this, ResultActivity.class);
            startActivity(intent);
            finish();
        }
    }

    private void formatTitle() {
        Resources res = getResources();
        String text = String.format(
                res.getString(R.string.current_question),
                currentQuestionIndex + 1,
                totalQuestions);
        TextView textView = (TextView) findViewById(R.id.questionBreadcrumb);
        textView.setText(text);
    }

    private void formatQuestion() {
        Question question = questionManager.getNextQuestion(currentQuestionIndex);

        TextView textView = (TextView) findViewById(R.id.questionTitle);
        textView.setText(question.getText());

        int answerIndex = 0;
        for(Answer answer : question.getAnswerList())
        {
            radioButtonList.get(answerIndex).setText(answer.getText());
            ++answerIndex;
        }
    }
}
