package com.jobsity.test.util;

import com.jobsity.test.model.Person;

public class OutputFormatter implements OutputFormatterI {

    @Override
    public void toCommandLine(Person player) {
        StringBuilder frames = new StringBuilder();
        StringBuilder pinfalls = new StringBuilder();
        StringBuilder scores = new StringBuilder();

        frames.append("Frame\t");
        pinfalls.append("Pinfalls");
        scores.append("Scores\t");

        for (int i = 0; i < player.getScoreSheet().size()-1; i++) {
            frames.append("\t " + (i+1));
            pinfalls.append("\t" + OutputFormatterI.super.pinfallSubstitution(player.getScoreSheet().get(i)));
            scores.append("\t  " + player.getScoreSheet().get(i).getScore());
        }

        System.out.println(frames);
        System.out.println(player.getName());
        System.out.println(pinfalls);
        System.out.println(scores);
    }
}
