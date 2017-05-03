package br.com.github.java8.time;

import java.time.Duration;
import java.time.Instant;

public class UseInstant {

    public static void main(String[] args) throws Exception {

        Instant instantStart = Instant.now();
        System.out.println(instantStart);

        Thread.sleep(1000);

        Instant instantEnd = Instant.now();
        System.out.println(instantEnd);

        Duration elapsed = Duration.between(instantStart, instantEnd);
        System.out.println(String.format("Elapsed %d milliseconds", elapsed.toMillis()));
    }
}
