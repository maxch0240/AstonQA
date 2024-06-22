package taskL12;

public class Main {
    public static void main(String[] args) {
        String[][] validArray = new String[][] {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongSizeArray = new String[][] {
                {"1", "2", "3", "4", "1"},
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

        int sum;
        try {
            sum = ArrayHandler.processArray(validArray);
            System.out.println("No exceptions in validArray");
            System.out.println("sum: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("MyArraySizeException in validArray");
        } catch (MyArrayDataException e) {
            System.out.println("MyDataSizeException in validArray");
        }

        System.out.println();
        try {
            sum = ArrayHandler.processArray(wrongSizeArray);
            System.out.println("No exceptions in wrongSizeArray");
            System.out.println("sum: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("MyArraySizeException in wrongSizeArray");
        } catch (MyArrayDataException e) {
            System.out.println("MyDataSizeException in wrongSizeArray");
        }

        System.out.println();
        try {
            sum = ArrayHandler.processArray(wrongDataArray);
            System.out.println("No exceptions in wrongDataArray");
            System.out.println("sum: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("MyArraySizeException in wrongDataArray");
        } catch (MyArrayDataException e) {
            System.out.println("MyDataSizeException in wrongDataArray");
        }
    }
}
