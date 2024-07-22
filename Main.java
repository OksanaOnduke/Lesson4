import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        counter();
        plusOrMinus();
        method1();
        method2();
        years();
        massive1();
        massive2();
        massive3();
        massive4();
        massive5();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = -3;
        int b = 2;
        int sum = a + b;
        if (sum > 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    static void printColor() {
        int value = 100;
        if (0 < value)
            if (value <= 100)
                System.out.println("Желтый");
        if (value <= 0)
            System.out.println("Красный");
        if (value > 100)
            System.out.println("Зеленый");
    }

    static void compareNumbers() {
        int a = 1002;
        int b = 721;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    static void counter() {
        boolean c = false;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();
        if (a + b > 10 & a + b <= 20) {
            c = true;
            System.out.println(c);
        } else {
            System.out.println(c);
        }
    }

    static void plusOrMinus() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 0)
            System.out.println("число положительное");
        else
            System.out.println("число отрицительное");
    }

    static void method1() {
        boolean c = false;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 0) {
            c = true;
            System.out.println(c);
        } else {
            System.out.println(c);
        }
    }

    static void method2() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        String b = scanner1.nextLine();
        int j = 0;
        while (j < a) {
            System.out.println(b);
            j++;
        }
    }

    static void years() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean t = false;
        if (year % 4 == 0) {
            if (year % 100 != 0)
                t = true;
            if (t == true)
                System.out.println(t);
        }
        if (t == false) {
            if (year % 400 == 0)
                t = true;
            if (t == true)
                System.out.println(t);
        }
        if (t == false) {
            t = false;
            System.out.println(t);
        }

    }

    static void massive1() {
        int[] data = {1, 1, 0, 0, 1, 0};
        data[0] = 1;
        int j = 0;
        while (j < data.length) {
            if (data[j] == 0) {
                data[j] = 1;
            } else {
                data[j] = 0;
            }
            j++;
            if (j == data.length)
                System.out.println(Arrays.toString(data));
        }
    }

    static void massive2() {
        int[] data = new int[100];
        data[0] = 0;
        int j = 0;
        while (j < data.length) {
            data[j] = j;
            j++;
            if (j == data.length)
                System.out.println(Arrays.toString(data));
        }
    }

    static void massive3() {
        int[] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int j = 0;
        while (j < data.length) {
            if (data[j] < 6)
                data[j] = data[j] * 2;
            j++;
            if (j == data.length) {
                System.out.println(Arrays.toString(data));
            }
        }
    }

    static void massive4() {
        int[][] data = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    data[i][j] = 1;
                }
            }
        }
        for (int l = 0; l < data.length; l++) {
            System.out.println(Arrays.toString(data[l]));
        }
    }

    static void massive5() {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int initialValue = scanner1.nextInt();
        int[] data = new int[len];
        int j = 0;
        while (j < data.length) {
            data[j] = initialValue;
            j++;
        }
        System.out.println(Arrays.toString(data));

    }

}

