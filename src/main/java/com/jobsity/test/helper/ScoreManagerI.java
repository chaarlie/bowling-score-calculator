package com.jobsity.test.helper;

import com.jobsity.test.model.BowlingFrame;

import java.util.List;

public interface ScoreManagerI {
    List<BowlingFrame>  calculateFrame(List<BowlingFrame> scoreSheet);
}
