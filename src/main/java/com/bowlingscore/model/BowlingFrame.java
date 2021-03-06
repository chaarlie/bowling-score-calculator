package com.bowlingscore.model;

import com.bowlingscore.enumeration.FrameType;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
@ToString
public  class BowlingFrame {

    // this class abstracts away what a
    //bowling frame is
    @Min(value = 1, message = "A player can't score less than 1 at a round")
    @Max(value = 10, message = "A player can't score more than 10 at a round")
    private int firstBallScore;

    @Min(value = 1, message = "A player can't score less than 1 at a round")
    @Max(value = 10, message = "A player can't score more than 10 at a round")
    private int secondBallScore;

    private int score;

    private FrameType type;

    public BowlingFrame() {}
    public BowlingFrame(int firstBallScore, int secondBallScore) {
        this.firstBallScore = firstBallScore;
        this.secondBallScore = secondBallScore;
    }
}
