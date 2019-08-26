package com.jobsity.test.model;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public  class BowlingFrame {
    @Min(value = 1, message = "A player can't score less than 1 at a round")
    @Max(value = 10, message = "A player can't score more than 10 at a round")
    private int firstBallScore;

    @Min(value = 1, message = "A player can't score less than 1 at a round")
    @Max(value = 10, message = "A player can't score more than 10 at a round")
    private int secondBallScore;

}
