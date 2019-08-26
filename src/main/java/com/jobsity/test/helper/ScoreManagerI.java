package com.jobsity.test.helper;

import com.jobsity.test.model.BowlingFrame;
import com.jobsity.test.model.Person;

import java.util.List;

public interface ScoreManagerI {
    public  List<BowlingFrame>  calculateFrame(List<BowlingFrame> scoreSheet);
    public int calculateTotal(Person player);
}
