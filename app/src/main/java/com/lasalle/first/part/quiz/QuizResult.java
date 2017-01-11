package com.lasalle.first.part.quiz;

/**
 * Created by Usuario on 11/01/2017.
 */

public class QuizResult {

    private Integer totalQuestions;
    private Integer correctAnswers;
    private Integer incorrectAnswers;


    public QuizResult(Integer totalQuestions){
        this.totalQuestions = totalQuestions;
        this.correctAnswers = 0;
        this.incorrectAnswers = 0;
    }

    public Integer getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(Integer totalQuestions) {
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
}
