import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveMultiplicationTest2 {

    @Test
    void recursiveMultiply() {
        RecursiveMultiplication recursiveMultiplication = new RecursiveMultiplication();
        int x = 10;
        int y = 10;
        assertEquals(x*y, recursiveMultiplication.recursiveMultiply(x,y));

    }
}