package taskL4;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // 1
        System.out.println("task 1");
        printThreeWords();

        // 2
        System.out.println("task 2");
        checkSumSign(1, 2);

        // 3
        System.out.println("task 3");
        printColor(101);

        // 4
        System.out.println("task 4");
        compareNumbers(1, 2);

        // 5
        System.out.println("task 5");
        checkSumInterval(5, 7);
        System.out.println(checkSumInterval(5, 7));

        // 6
        System.out.println("task 6");
        checkNumSign(4);

        // 7
        System.out.println("task 7");
        checkNumSignBool(-1);
        System.out.println(checkNumSignBool(-1));

        // 8
        System.out.println("task 8");
        writeStr("hello", 5);

        // 9
        System.out.println("task 9");
        System.out.println(isleapYear(1200));

        // 10
        System.out.println("task 10");
        int[] arr1 = { 1, 0, 0, 1 };
        changeArr1(arr1);
        for (int i : arr1) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // 11
        System.out.println("task 11");
        int[] filledArr = fillUpArr();
        for (int i : filledArr) {
            System.out.print(filledArr[i - 1] + " ");
        }
        System.out.println();


        // 12
        System.out.println("task 12");
        changeArr2();
        int[] arr2 = changeArr2();
        for (int i : arr2) {
            System.out.print(arr2[i - 1] + " ");
        }
        System.out.println();

        // 13
        System.out.println("task 13");
        int[][] twoDimArr = {
                { 1, 2, 3 },
                { 0, 1, 4 },
                { 0, 5, 5 } };
        changeArr3(twoDimArr);
        Arrays.stream(twoDimArr).map(Arrays::toString).forEach(System.out::println);

        // 14
        System.out.println("task 14");
        returnArr(10, 99);
        int[] arr3 = returnArr(10, 99);
        for (int j : arr3) {
            System.out.print(j + " ");
        }
    }

    // 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2
    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    // 3
    public static void printColor(int value) {
        if (value <= 0)
            System.out.println("Красный");
        else if (value <= 100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    // 4
    public static void compareNumbers(int a, int b) {
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    // 5
    public static boolean checkSumInterval(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    // 6
    public static void checkNumSign(int value) {
        if (value >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }

    // 7
    public static boolean checkNumSignBool(int value) {
        return value < 0;
    }

    // 8
    public static void writeStr(String str, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println(str);
        }
    }

    // 9
    public static boolean isleapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    // 10
    public static void changeArr1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else if (arr[i] == 1)
                arr[i] = 0;
        }
    }

    // 11
    public static int[] fillUpArr() {
        int[] arr = new int[100];
        int arrValue = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrValue++;
        }
        return arr;
    }

    // 12
    public static int[] changeArr2() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
        }
        return arr;
    }

    // 13
    public static void changeArr3(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }

    // 14
    public static int[] returnArr(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}