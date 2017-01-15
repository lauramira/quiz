package com.lasalle.second.part.quiz.data.impl;

import com.lasalle.second.part.quiz.data.ResultData;
import com.lasalle.second.part.quiz.models.Result;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 15/01/2017.
 */

public class ResultDataMock implements ResultData {

    private List<Result> resultList;

    public ResultDataMock() {
        resultList = new ArrayList<>();
        resultList.add(new Result(1,4,5));
        resultList.add(new Result(4,3,7));
        resultList.add(new Result(5,1,6));
        resultList.add(new Result(4,1,5));
        resultList.add(new Result(3,1,5));
    }

    @Override
    public Result getResult(Integer gameId) {

        return resultList.get(gameId);
    }
}
