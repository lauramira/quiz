package com.lasalle.first.part.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    Integer total;
    Integer correct;
    Integer incorrect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        total = intent.getExtras().getInt("total");
        correct = intent.getExtras().getInt("correct");
        incorrect = intent.getExtras().getInt("incorrect");

        init();
    }

    private void init(){
        TextView totalQuestionsTextView = (TextView) findViewById(R.id.totalQuestionsTextView);
        TextView totalCorrectTextView = (TextView) findViewById(R.id.totalCorrectTextView);
        TextView totalIncorrectTextView = (TextView) findViewById(R.id.totalIncorrectTextView);

        totalQuestionsTextView.setText(total.toString());
        totalCorrectTextView.setText(correct.toString());
        totalIncorrectTextView.setText(incorrect.toString());

        Button tryAgainButton = (Button) findViewById(R.id.tryAgainButton);
        tryAgainButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
            }
        });

    }
}
