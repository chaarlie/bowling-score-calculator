package com.jobsity.test.helper;

import com.jobsity.test.model.BowlingFrame;
import com.jobsity.test.model.Person;

import java.util.List;
import java.util.Map;

public interface ScoreManagerI {
    public  int calculateFrame(List<BowlingFrame> scoreSheet, int total,  int index);
    public int calculateTotal(Person player);
}
