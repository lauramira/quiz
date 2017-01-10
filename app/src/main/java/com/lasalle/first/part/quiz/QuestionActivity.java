package com.lasalle.first.part.quiz;

import android.support.v4.util.ArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class QuestionActivity extends AppCompatActivity {

    List<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        initQuestions();
    }

    private void initQuestions(){
        questions = new ArrayList<>();

        //add questions
        for (int i = 0; i < 5; i++) {

        }
    }
}
