package com.lasalle.first.part.quiz;

import java.util.List;
import java.util.Map;

/**
 * Created by master on 10/1/17.
 */

public class Question {
    private String question;
    private String [] questionList = new String [4];
    private Integer correctAnswer;

    public Question(String question,String [] questionList, Integer correctAnswer){
        this.question = question;
        this.questionList = questionList;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getQuestionList() {
        return questionList;
    }

    public void setQuestionList(String[] questionList) {
        this.questionList = questionList;
    }

    public Integer getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Integer correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
