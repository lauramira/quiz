package com.lasalle.second.part.quiz.manager;

import com.lasalle.second.part.quiz.data.ResultData;
import com.lasalle.second.part.quiz.data.impl.ResultDataMock;
import com.lasalle.second.part.quiz.models.Result;

/**
 * Created by Usuario on 15/01/2017.
 */

public class ResultManager {

    ResultData resultData = new ResultDataMock();

    public Result getCurrentResult(Integer gameId) {
        return resultData.getResult(gameId);
    }


}
