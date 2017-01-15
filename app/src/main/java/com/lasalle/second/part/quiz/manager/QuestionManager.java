package com.lasalle.second.part.quiz.manager;

import com.lasalle.second.part.quiz.data.QuestionData;
import com.lasalle.second.part.quiz.data.impl.QuestionDataMock;
import com.lasalle.second.part.quiz.models.Answer;
import com.lasalle.second.part.quiz.models.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Usuario on 15/01/2017.
 */

public class QuestionManager {

    private QuestionData questionData = new QuestionDataMock();
    public QuestionManager() {}

    public Question getNextQuestion(Integer questionId){
        return questionData.getQuestion(questionId);
    }

    public Integer countQuestions(){
        return questionData.countQuestions();
    }
}
