package com.jobsity.test.util;

import com.jobsity.test.model.Person;

import java.io.IOException;
import java.util.Map;

public interface ScoreSheetReaderI {
    Map<String, Person> inputFile(String fileName) throws IOException;
}
