package com.jobsity.test;

import com.jobsity.test.helper.ScoreManager;
import com.jobsity.test.model.BowlingFrame;
import com.jobsity.test.service.FactoryService;
import com.jobsity.test.util.ScoreSheetReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class GameAnalyzer
{
    public static void main( String[] args ) throws IOException {

        //ScoreSheetReader.inputFile(args[0]);

        List<BowlingFrame> scoreSheet = new ArrayList<>();
        scoreSheet.add(new BowlingFrame(6, 1));
        scoreSheet.add(new BowlingFrame(9, 0));
        scoreSheet.add(new BowlingFrame(8, 2));
        scoreSheet.add(new BowlingFrame(5, 5));
        scoreSheet.add(new BowlingFrame(8, 0));
        scoreSheet.add(new BowlingFrame(6, 2));
        scoreSheet.add(new BowlingFrame(9, 1));
        scoreSheet.add(new BowlingFrame(7, 2));
        scoreSheet.add(new BowlingFrame(8, 2));
        scoreSheet.add(new BowlingFrame(9, 1));
        scoreSheet.add(new BowlingFrame(7, 0));

//        scoreSheet.add(new BowlingFrame(10, 0));
//        scoreSheet.add(new BowlingFrame(10, 0));
//        scoreSheet.add(new BowlingFrame(7, 3));
//        scoreSheet.add(new BowlingFrame(8, 2));
//        scoreSheet.add(new BowlingFrame(10, 0));
//        scoreSheet.add(new BowlingFrame(9, 1));
//        scoreSheet.add(new BowlingFrame(10, 0));
//        scoreSheet.add(new BowlingFrame(10, 0));
//        scoreSheet.add(new BowlingFrame(10, 0));
//        scoreSheet.add(new BowlingFrame(10, 7));
//        scoreSheet.add(new BowlingFrame(3, 0));
//
//        scoreSheet.add(new BowlingFrame(5, 5));
//        scoreSheet.add(new BowlingFrame(8, 2));
//        scoreSheet.add(new BowlingFrame(9, 1));
//        scoreSheet.add(new BowlingFrame(7, 3));
//        scoreSheet.add(new BowlingFrame(8, 2));
//        scoreSheet.add(new BowlingFrame(6, 4));
//        scoreSheet.add(new BowlingFrame(9, 1));
//        scoreSheet.add(new BowlingFrame(7, 3));
//        scoreSheet.add(new BowlingFrame(6, 4));
//        scoreSheet.add(new BowlingFrame(4, 5));
//        scoreSheet.add(new BowlingFrame(0, 0));

//        scoreSheet.add(new BowlingFrame(10, 0));
//        scoreSheet.add(new BowlingFrame(10, 0));
//        scoreSheet.add(new BowlingFrame(10, 0));
//        scoreSheet.add(new BowlingFrame(10, 0));
//        scoreSheet.add(new BowlingFrame(10, 0));
//        scoreSheet.add(new BowlingFrame(10, 0));
//        scoreSheet.add(new BowlingFrame(10, 0));
//        scoreSheet.add(new BowlingFrame(10, 0));
//        scoreSheet.add(new BowlingFrame(10, 0));
//        scoreSheet.add(new BowlingFrame(10, 10));
//        scoreSheet.add(new BowlingFrame(10, 0));

        FactoryService factoryService = FactoryService.getInstance();

        System.out.println(factoryService.getScoreManager().calculateFrame(scoreSheet, 0, 0));

    }
}
