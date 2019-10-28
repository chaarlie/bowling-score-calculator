package com.bowlingscore.util;

import com.bowlingscore.model.BowlingFrame;
import com.bowlingscore.model.Person;

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
