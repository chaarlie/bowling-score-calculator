package com.jobsity.test.service;

import com.jobsity.test.helper.ScoreManager;
import com.jobsity.test.helper.ScoreManagerI;
import com.jobsity.test.util.OutoutFormtatterI;
import com.jobsity.test.util.OutputFormatter;
import com.jobsity.test.util.ScoreSheetReader;
import com.jobsity.test.util.ScoreSheetReaderI;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FactoryService {
    private static FactoryService instance = null;

    private  OutoutFormtatterI outputFormatter;
    private  ScoreSheetReaderI scoreSheetReader;
    private  ScoreManagerI scoreManager;

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
