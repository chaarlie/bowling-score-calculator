package com.jobsity.test;

import com.jobsity.test.model.Person;
import com.jobsity.test.service.FactoryService;

import java.io.IOException;
import java.util.Map;


public class GameAnalyzer {
    public static void main(String[] args) throws IOException {

        FactoryService factoryService = FactoryService.getInstance();

        Map<String, Person> players = factoryService.getScoreSheetReader().inputFile(args[0]);

        // I must mutate the map so I can update the fields null
        // Even though I'm using Lombok. First I load the file, do calcs then update score
        // and frame type. So that's why I used a helper in recursive method
        players.forEach((name, person) -> {
            person.setScoreSheet(factoryService.getScoreManager().calculateFrame(person.getScoreSheet()));
            factoryService.getOutputFormatter().toCommandLine(person);
        });
    }
}
