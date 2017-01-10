package com.lasalle.first.part.quiz;

import java.util.List;
import java.util.Map;

/**
 * Created by master on 10/1/17.
 */

public class Question {
    private String question;
    private Map<String, Integer> questionList;
    private Integer correctAnswer;

    public Question(String question, Map<String, Integer> questionList, Integer correctAnswer){
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

    public Map<String, Integer> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(Map<String, Integer> questionList) {
        this.questionList = questionList;
    }

    public Integer getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Integer correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
