package com.lasalle.second.part.quiz.data.impl;

import com.lasalle.second.part.quiz.data.QuestionData;
import com.lasalle.second.part.quiz.models.Answer;
import com.lasalle.second.part.quiz.models.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Usuario on 15/01/2017.
 */

public class QuestionDataMock implements QuestionData {

    List<Question> questionList;

    public QuestionDataMock() {
        this.questionList = new ArrayList<>();
        this.questionList.add(new Question(
                "Who won the 2014 World Cup?",
                Arrays.asList(
                        new Answer("Argentina", false),
                        new Answer("Brazil", false),
                        new Answer("Spain", false),
                        new Answer("Germany", false)
                )
        ));

        this.questionList.add(new Question("Who won the 15/16 NBA championship?",
                Arrays.asList(new Answer("Cleveland cavaliers", true),
                        new Answer("Golden State Warriors", false),
                        new Answer("San Antonio Spurs", false),
                        new Answer("Toronto Raptors", false)
                )
        ));

        this.questionList.add(new Question("Who won the 14/15 Euroleague Basketball?",
                Arrays.asList(
                        new Answer("FCB Barcelona", false),
                        new Answer("Olympiacos", false),
                        new Answer("Real Madrid", true),
                        new Answer("CSKA Moscú", false)
                )
        ));

        this.questionList.add(new Question("Who won the 2013 MotoGP world title?",
                Arrays.asList(
                        new Answer("Jorge Lorenzo", false),
                        new Answer("Marc Márquez", false),
                        new Answer("Valentino Rossi", false),
                        new Answer("Dani Pedrosa", false)
                )
        ));

        this.questionList.add(new Question("Who won the 2010 Roland Garros?",
                Arrays.asList(
                        new Answer("Novak Djokovic", false),
                        new Answer("Roger Federer", false),
                        new Answer("Rafa Nadal", false),
                        new Answer("Juan Carlos Ferrero", false)
                )
        ));
    }

    @Override
    public Question getQuestion(Integer questionId) {
        return questionList.get(questionId);
    }

    @Override
    public Integer countQuestions() {
        return questionList.size();
    }
}
