package com.jobsity.test.util;

import com.jobsity.test.enumeration.FrameType;
import com.jobsity.test.model.BowlingFrame;
import com.jobsity.test.model.Person;

public interface OutputFormatterI {
    default String pinfallSubstitution(BowlingFrame frame){
        String result = "";

        switch (frame.getType()) {
            case DASH:
                result = frame.getFirstBallScore() + " | --";
                break;
            case STRIKE:
                result = frame.getFirstBallScore() + " | X" ;
                break;
            case SPARE:
                result = frame.getFirstBallScore() + " | /";
                break;
            case NUMBER:
                result = frame.getFirstBallScore() + " | " + frame.getSecondBallScore();
                break;
        }
        return result;
    }
    void toCommandLine(Person player);
}
