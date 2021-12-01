package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
//        Задача первая
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        sum = 0;
//        вариант 2
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

//        Задача вторая
        int min = 200_000;
        int max = 100_000;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " + "Максимальная сумма трат за день составила " + max + " рублей.");
//        вариант 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " + "Максимальная сумма трат за день составила " + max + " рублей.");


//        Задача третья
        float medium = (float) sum / (arr.length);
        System.out.println("Средняя сумма трат за месяц составила " + medium + " рублей.");

//        Задача четвертая
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
