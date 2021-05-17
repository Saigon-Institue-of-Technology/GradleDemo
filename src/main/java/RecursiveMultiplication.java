public class RecursiveMultiplication {
    public long recursiveMultiply(int x, int y)
    {
        if(y < 1)
            throw new IllegalArgumentException("y is less than 1");
        else if(y == 1)
            return x;
        else
            return x + recursiveMultiply(x, y - 1);
    }
}
