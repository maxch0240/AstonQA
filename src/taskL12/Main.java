package taskL12;

public class Main {
    public static void main(String[] args) {
        String[][] validArray = new String[][] {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(validArray[i][j] + " ");
            }
            System.out.println();
        }

        String[][] wrongSizeArray = new String[][] {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16", "17", "18"}
        };

        String[][] wrongDataArray = new String[][] {
                {"some string", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            ArrayHandler.processArray(validArray);
        } catch (MyArraySizeException e) {
            System.out.println("MyArraySizeException");
        } catch (MyArrayDataException e) {
            System.out.println("MyDataSizeException");
        }

        try {
            ArrayHandler.processArray(wrongSizeArray);
        } catch (MyArraySizeException e) {
            System.out.println("MyArraySizeException");
        } catch (MyArrayDataException e) {
            System.out.println("MyDataSizeException");
        }

        try {
            ArrayHandler.processArray(wrongDataArray);
        } catch (MyArraySizeException e) {
            System.out.println("MyArraySizeException");
        } catch (MyArrayDataException e) {
            System.out.println("MyDataSizeException");
        }
    }
}
