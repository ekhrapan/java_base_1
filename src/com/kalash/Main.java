package com.kalash;

public class Main {

    public static void main(String[] args) {

        // объявление переменной
        int a;
        // инициализация переменной
        a = 5;
        // объявление и инициализация переменной
        int b = 23;

        // конструкция if
        if (a >= 10) {
            System.out.println("a >= 10");
        } else {
            System.out.println("a < 10");
        }

        // конструкция if
        if (b < 10) {
            System.out.println("b < 10");
        } else {
            System.out.println("b >= 10");
        }

        // конструкция switch
        char symbol = '1';
        switch (symbol) {
            case '1':
                System.out.println("Цифра 1");
                break;
            case 'б':
                System.out.println("Буква б");
                break;
            default:
                System.out.println("Другой символ");
        }

        // цикл for
        for (int i = 1; i < 5; i++) {
            System.out.print(i);
            System.out.print(" ");
        }

        // пустые строки
        System.out.println();
        System.out.println();

        int counter = 1;

        // цикл while
        while (counter <= 20) {

            // пропуск итерации цикла
            if (counter == 10) {
                counter++;
                continue;
            }

            // выход из цикла
            if (counter == 15) {
                break;
            }

            System.out.println("Счетчик: " + counter);

            // инкремент (увеличение на 1)
            counter++;
        }

        // пустые строки
        System.out.println();
        System.out.println();

        // цикл do ... while
        do {
            System.out.println("Тот же счетчик: " + counter);
            counter--;
        } while (counter > 0);

        // пустые строки
        System.out.println();
        System.out.println();

        // объявление массива
        int[] array = new int[3];

        // инициализация массива
        array[0] = 5;
        array[1] = -78;
        array[2] = 67;

        // вывод массива на экран
        System.out.println("1-ый элемент массива = " + array[0]);
        System.out.println("2-ой элемент массива = " + array[1]);
        System.out.println("3-ий элемент массива = " + array[2]);
    }
}
