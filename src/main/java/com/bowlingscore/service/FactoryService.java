package com.bowlingscore.service;

import com.bowlingscore.helper.ScoreManagerI;
import com.bowlingscore.util.OutputFormatter;
import com.bowlingscore.util.OutputFormatterI;
import com.bowlingscore.util.ScoreSheetReader;
import com.bowlingscore.util.ScoreSheetReaderI;
import com.bowlingscore.helper.ScoreManager;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FactoryService {
    private static FactoryService instance = null;

    private OutputFormatterI outputFormatter;
    private ScoreSheetReaderI scoreSheetReader;
    private ScoreManagerI scoreManager;

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
