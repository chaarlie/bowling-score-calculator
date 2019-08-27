package com.jobsity.test;

import com.jobsity.test.model.Person;
import com.jobsity.test.service.FactoryService;

import java.io.IOException;
import java.util.Map;


public class GameAnalyzer {
    public static void main(String[] args) throws IOException {

        FactoryService factoryService = FactoryService.getInstance();

        Map<String, Person> players = factoryService.getScoreSheetReader().inputFile(args[0]);

        players.forEach((name, person) -> {
            person.setScoreSheet(factoryService.getScoreManager().calculateFrame(person.getScoreSheet()));
            factoryService.getOutputFormatter().toCommandLine(person);
        });
    }
}
