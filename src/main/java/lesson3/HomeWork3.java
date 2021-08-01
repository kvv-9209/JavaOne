package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        //reverseValueInArray();
        // fillEmptyArray();
        // multipleNumbers();
        // arrayFillDiagonalElementsUnits();
        //   returnDimArray(10, 15);
        //  minMaxElements();
        //  checkBalance();
        //displaceAllElementsArray(2);
        tested(1);
    }


    /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью
         цикла и условия заменить 0 на 1, 1 на 0 */
    public static void reverseValueInArray() {

        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /* 2. Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/
    public static void fillEmptyArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2 */
    public static void multipleNumbers() {
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /* 4. Создать квадратный двумерный целочисленный массив
          (количество строк и столбцов одинаковое),
          и с помощью цикла(-ов) заполнить его диагональные элементы единицами
          (можно только одну из диагоналей, если обе сложно).
          Определить элементы одной из диагоналей можно по следующему принципу:
          индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n] */
    public static void arrayFillDiagonalElementsUnits() {

        int[][] dimensionalArray = new int[6][6];

        for (int i = 0; i < dimensionalArray.length; i++) {
            for (int j = 0, n = dimensionalArray[i].length; j < dimensionalArray.length; j++, n--) {

                Arrays.fill(dimensionalArray[j], 0);
                if (i == j || i == n - 1) {
                    dimensionalArray[i][j] = 1;
                }
                System.out.print(dimensionalArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    /* 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
     и возвращающий одномерный массив типа int длиной len, каждая ячейка
     которого равна initialValue*/
    public static int[] returnDimArray(int len, int initialValue) {

        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    /* 6.* Задать одномерный массив и найти в нем минимальный и максимальный элементы*/

    public static int[] minMaxElements() {
        int[] array = new int[]{10, 5, 3, 2, 11, 4, 7, 6, 12, 8, 9, 1};
        int maxElement = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        int minElement = maxElement;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < minElement) {
                minElement = array[j];
            }
        }
        return array;
    }

    /* 7. ** Написать метод, в который передается не пустой одномерный
 целочисленный массив, метод должен вернуть true, если в массиве
 есть место, в котором сумма левой и правой части массива равны.
 Примеры:
 checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
 checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
 граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.*/
    public static boolean checkBalance() {
        int[] array = new int[]{2, 2, 2, 1, 2, 2, 2, 1};
        int leftBorder = 0;
        int rightBorder = 0;

        for (int i = 0; i < array.length; i++) {
            leftBorder += array[i];
        }
        for (int j = array.length - 1; true || false; j--) {
            if (leftBorder == rightBorder) {
                return true;
            } else if (leftBorder == 0) {
                return false;
            } else {
                leftBorder -= array[j];
                rightBorder += array[j];
            }
        }
    }

    /* 8. *** Написать метод, которому на вход подается одномерный массив
    и число n (может быть положительным, или отрицательным), при этом
    метод должен сместить все элементы массива на n позиций.
    Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
    вспомогательными массивами.
    Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
    при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.*/
    /*public static void displaceAllElementsArray(int n) {

        int[] arr = {3, 5, 6, 1};

        if(n > 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i + n];
            }
        }
        System.out.println(Arrays.toString(arr));
        *//* Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите размер массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size

        //Пройдёмся по всему массиву, заполняя его
        for (int i = 0; i < size; i++) {
            System.out.println("Введите значение для " + (i + 1) + "элемента:");
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println(); *//*
    }*/

    public static void tested(int n) {
        int[] arr = {3, 5, 6, 1};
        int i = 0;
        while (i < arr.length + n) {
            int j = arr.length - 1;
            int buffer = arr[j];
            while (j < arr.length) {
                if (j == 0) {
                    arr[j] = buffer;
                    break;
                } else {
                    arr[j] = arr[j - 1];
                    j--;
                }
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }

}






