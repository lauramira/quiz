package com.lasalle.second.part.quiz.data;

import com.lasalle.second.part.quiz.models.Question;

/**
 * Created by Usuario on 15/01/2017.
 */

public interface QuestionData {

    Question getQuestion(Integer questionId);
    Integer countQuestions();


}
