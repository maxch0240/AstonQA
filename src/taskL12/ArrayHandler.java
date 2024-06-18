package taskL12;

public class ArrayHandler {
    public static void processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;
        int number = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    System.out.println(array[i][j] + " ");
                    number = Integer.getInteger(array[i][j]);
                } catch (MyArrayDataException e) {
                    throw new MyArrayDataException(i, j);
                }
                sum += number;
            }
        }
    }
}
