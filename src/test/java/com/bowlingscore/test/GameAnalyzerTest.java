package com.bowlingscore.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.bowlingscore.model.BowlingFrame;
import com.bowlingscore.service.FactoryService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for ScoreManager.
 */
public class GameAnalyzerTest
{

    @Test
    public void shouldAnswerWithTrue()
    {

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

        assertTrue( true );

        FactoryService factoryService = FactoryService.getInstance();
        List<BowlingFrame> bowlingFrames = factoryService.getScoreManager().calculateFrame(scoreSheet);

        assertTrue( bowlingFrames.size() > 0 );
        assertEquals(7, bowlingFrames.get(0).getScore());
    }
}
