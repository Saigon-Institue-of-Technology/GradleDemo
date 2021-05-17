import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveMultiplicationTest {

    @Test
    void recursiveMultiply() {
        RecursiveMultiplication recursiveMultiplication = new RecursiveMultiplication();
        int x = 10;
        int y = 10;
        assertEquals(y*x, recursiveMultiplication.recursiveMultiply(x,y));
    }
}