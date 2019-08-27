package com.jobsity.test.helper;

import com.jobsity.test.enumeration.FrameType;
import com.jobsity.test.model.BowlingFrame;

import java.util.List;

public class ScoreManager implements ScoreManagerI {
   @Override
   public  List<BowlingFrame> calculateFrame(List<BowlingFrame> scoreSheet) {
       helper(scoreSheet, 0, 0);
       return scoreSheet;
    }

    public  int helper(List<BowlingFrame> scoreSheet, int total,  int index) {
        if(index == scoreSheet.size()-1) return total;

        int firstBallScore =  scoreSheet.get(index).getFirstBallScore();
        int secondBallScore =  scoreSheet.get(index).getSecondBallScore();
        int frameSum = firstBallScore + secondBallScore;

        if(firstBallScore == 10) {
            total += firstBallScore;

            for (int i = index+1, count = 0; i < scoreSheet.size(); i++) {
                if(count == 2) {
                    break;
                }
                if(scoreSheet.get(i).getFirstBallScore() > 0) {
                    total += scoreSheet.get(i).getFirstBallScore();
                    count++;
                }

                if(scoreSheet.get(i).getSecondBallScore() > 0 && count <2 ) {
                    total += scoreSheet.get(i).getSecondBallScore();
                    count++;
                }
            }

            scoreSheet.get(index).setScore(total);
            scoreSheet.get(index).setType(FrameType.STRIKE);

            return helper(scoreSheet,  total,  ++index);
        }

        else if(frameSum < 10) {
            total += frameSum;
            if(secondBallScore == 0) {
                scoreSheet.get(index).setScore(total);
                scoreSheet.get(index).setType(FrameType.DASH);
            }
            else {
                scoreSheet.get(index).setScore(total);
                scoreSheet.get(index).setType(FrameType.NUMBER);
            }
        }
        else {
            total +=  frameSum + scoreSheet.get(index+1).getFirstBallScore();

            scoreSheet.get(index).setScore(total);
            scoreSheet.get(index).setType(FrameType.SPARE);
        }

        return helper(scoreSheet,  total,  ++index);
    }
}
