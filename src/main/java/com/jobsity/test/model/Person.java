package com.jobsity.test.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@ToString
public class Person {
    @NotNull(message = "Person name can't be null")
    private String name;
    @Size(min=1, max=11, message = "A bowling player should have played at most 10 times")
    private List<BowlingFrame> scoreSheet;
}
