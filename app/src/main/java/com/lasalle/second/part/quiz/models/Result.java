package com.lasalle.second.part.quiz.models;

import java.util.Date;

/**
 * Created by Usuario on 15/01/2017.
 */

public class Result {
    private Integer correctAnswers;
    private Integer incorrectAnswers;
    private Integer totalQuestions;

    public Result(Integer correctAnswers, Integer incorrectAnswers, Integer totalQuestions) {
        this.correctAnswers = correctAnswers;
        this.incorrectAnswers = incorrectAnswers;
        this.totalQuestions = totalQuestions;
    }

    public Integer getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(Integer correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public Integer getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public void setIncorrectAnswers(Integer incorrectAnswers) {
        this.incorrectAnswers = incorrectAnswers;
    }

    public Integer getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(Integer totalQuestions) {
        this.totalQuestions = totalQuestions;
    }
}
