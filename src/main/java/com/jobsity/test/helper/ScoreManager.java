package com.jobsity.test.helper;

import com.jobsity.test.model.BowlingFrame;
import com.jobsity.test.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ScoreManager implements ScoreManagerI {
   @Override
   public  int calculateFrame(List<BowlingFrame> scoreSheet, int total,  int index) {
        System.out.println(" this is index  before base case" + index);

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

            System.out.println(firstBallScore + " | X" );
            System.out.println("[ " + total + " ]");

           return calculateFrame(scoreSheet,  total,  ++index);
        }

        else if(frameSum < 10) {
            total += frameSum;
            if(secondBallScore == 0) {
                System.out.println(firstBallScore + " | --" );
                System.out.println("[ " + total + " ]");
            }
            else {
                System.out.println(firstBallScore + " | " + secondBallScore );
                System.out.println("[ " + total + " ]");
            }
        }
        else {
            total +=  frameSum + scoreSheet.get(index+1).getFirstBallScore();
            System.out.println(firstBallScore + " | /" );
            System.out.println("[ " + total + " ]");
        }

        return calculateFrame(scoreSheet,  total,  ++index);
    }


    public int calculateTotal(Person player) {
        return 0;
    }
}