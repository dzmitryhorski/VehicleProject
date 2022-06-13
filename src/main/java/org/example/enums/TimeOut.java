package org.example.enums;

import java.time.Duration;

public enum TimeOut {

    ONE_SEC(Duration.ofSeconds(1)),
    FIVE_SEC(Duration.ofSeconds(5)),
    THIRTY_SEC(Duration.ofSeconds(30));

    private final Duration duration;

    TimeOut(Duration duration) {
        this.duration = duration;
    }

    public Duration getDuration() {
        return duration;
    }
}
