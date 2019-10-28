package com.bowlingscore.helper;

import com.bowlingscore.enumeration.FrameType;
import com.bowlingscore.model.BowlingFrame;

import java.util.List;

public class ScoreManager implements ScoreManagerI {
   @Override
   public  List<BowlingFrame> calculateFrame(List<BowlingFrame> scoreSheet) {
       helper(scoreSheet, 0, 0);
       return scoreSheet;
    }

    // I'm just using tail recursion  /w helper method
    public  int helper(List<BowlingFrame> scoreSheet, int total,  int index) {
        if(index == scoreSheet.size()-1) return total;

        int firstBallScore =  scoreSheet.get(index).getFirstBallScore();
        int secondBallScore =  scoreSheet.get(index).getSecondBallScore();
        int frameSum = firstBallScore + secondBallScore;

        // considering the first one is a Strike
        if(firstBallScore == 10) {
            total += firstBallScore;

            // this loop is to apply the bonus, e. i. giving the next 2 moves + 10 pts
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
            // no scores
            if(secondBallScore == 0) {
                scoreSheet.get(index).setScore(total);
                scoreSheet.get(index).setType(FrameType.DASH);
            }
            else {
                // when player just dont add up to 10
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
