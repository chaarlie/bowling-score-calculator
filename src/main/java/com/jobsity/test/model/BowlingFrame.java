package com.jobsity.test.models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
public class BowlingFrame {
    @Min(value = 1, message = "A player can't score less than 1 at a round")
    @Max(value = 10, message = "A player can't score more than 10 at a round")
    private int score;
}
