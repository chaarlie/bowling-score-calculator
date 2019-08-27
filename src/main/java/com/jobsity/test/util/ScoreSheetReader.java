package com.jobsity.test.util;

import com.jobsity.test.model.BowlingFrame;
import com.jobsity.test.model.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ScoreSheetReader implements ScoreSheetReaderI {
    public  Map<String, Person> inputFile(String fileName) {
        Map<String, Person> players =  new HashMap<>();
        String[] sheetLine;
        String playerName;
        Person player;
        int framePoints;
        BowlingFrame bf;
        BowlingFrame currBf;

        File file = new File(fileName);
        try (BufferedReader br = new BufferedReader(new FileReader((file)))) {

            String line;
            while ((line = br.readLine()) != null) {
                sheetLine = line.split(" ");
                try {
                    framePoints = Integer.parseInt(sheetLine[1]);
                } catch (NumberFormatException ex) {
                    framePoints = 0;
                }

                playerName = sheetLine[0];
                playerName = playerName.substring(0, 1).toUpperCase() + playerName.substring(1);

                if (players.get(playerName) != null) {
                    player = players.get(playerName);
                    currBf = player.getScoreSheet().get(player.getScoreSheet().size() - 1);

                    if (currBf.getSecondBallScore() == 0) {
                        currBf.setSecondBallScore(framePoints);
                    } else {
                        bf = new BowlingFrame();
                        bf.setFirstBallScore(framePoints);
                        player.getScoreSheet().add(bf);
                    }
                } else {
                    player = new Person();
                    player.setName(playerName);
                    player.setScoreSheet(new ArrayList<>());
                    bf = new BowlingFrame();
                    bf.setFirstBallScore(framePoints);
                    player.getScoreSheet().add(bf);
                    players.put(playerName, player);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  players;
    }
}
