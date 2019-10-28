package com.bowlingscore.helper;

import com.bowlingscore.model.BowlingFrame;

import java.util.List;

public interface ScoreManagerI {
    List<BowlingFrame>  calculateFrame(List<BowlingFrame> scoreSheet);
}
