package taskL12;

public class MyArrayDataException  extends NumberFormatException {
    public MyArrayDataException(int i, int j) {
        super("Incorrect data in [" + i + "]["+ j + "]");
    }
}