package com.jobsity.test.service;

import com.jobsity.test.helper.ScoreManager;
import com.jobsity.test.helper.ScoreManagerI;
import com.jobsity.test.util.OutputFormatterI;
import com.jobsity.test.util.OutputFormatter;
import com.jobsity.test.util.ScoreSheetReader;
import com.jobsity.test.util.ScoreSheetReaderI;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FactoryService {
    private static FactoryService instance = null;

    private OutputFormatterI outputFormatter;
    private  ScoreSheetReaderI scoreSheetReader;
    private  ScoreManagerI scoreManager;

    //I'm just gathering all instances inside
    // here so i don't have to instantiate anywhere else
    private FactoryService () {
        outputFormatter = new OutputFormatter();
        scoreSheetReader = new ScoreSheetReader();
        scoreManager = new ScoreManager();
    }
    public static FactoryService getInstance() {
        if(instance == null)
            instance = new FactoryService();
        return  instance;
    }
}
