package classesutilitarias;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now); // zulu time
        System.out.println(LocalDateTime.now());
        System.out.println(Instant.EPOCH);
    }
}
