import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1T7Test {

    private Q1T7 task;
    @BeforeEach
    void setUp() {
        task = new Q1T7();
    }

    @AfterEach
    void tearDown() {
        task = null;
    }

    @RepeatedTest(5)
    void generateRandomNumber() {
        int randomNumber = task.generateRandomNumber();

        assertTrue(randomNumber >= 1 && randomNumber <= 100,
                "The generated number " + randomNumber + "should be between 1 and 100 ");
    }

}