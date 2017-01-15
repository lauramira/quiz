package com.lasalle.second.part.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lasalle.second.part.quiz.manager.ResultManager;
import com.lasalle.second.part.quiz.models.Answer;
import com.lasalle.second.part.quiz.models.Question;
import com.lasalle.second.part.quiz.models.Result;

public class ResultActivity extends AppCompatActivity {
    ResultManager resultManager;
    Button playAgainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultManager = new ResultManager();
        formatResult();

        playAgainButton = (Button) findViewById(R.id.playAgainButton);
        playAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void formatResult() {
        Result currentResult = resultManager.getCurrentResult(0);

        TextView totalTextView = (TextView) findViewById(R.id.textTotalQuestions);
        totalTextView.setText(currentResult.getTotalQuestions().toString());

        TextView incorrectAnswerTextView = (TextView) findViewById(R.id.textIncorrect);
        incorrectAnswerTextView.setText(currentResult.getIncorrectAnswers().toString());

        TextView correctTextView = (TextView) findViewById(R.id.textCorrect);
        correctTextView.setText(currentResult.getCorrectAnswers().toString());
    }
}
