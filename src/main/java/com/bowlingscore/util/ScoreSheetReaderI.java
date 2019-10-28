package com.bowlingscore.util;

import com.bowlingscore.model.Person;

import java.io.IOException;
import java.util.Map;

public interface ScoreSheetReaderI {
    Map<String, Person> inputFile(String fileName) throws IOException;
}
