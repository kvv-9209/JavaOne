package lesson3;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        reverseValueInArray();
        fillEmptyArray();
        multipleNumbers();
        arrayFillDiagonalElementsUnits();
        returnDimArray(10, 15);
        minMaxElements();
        sumBordersArray();

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

    /* 4. Написать метод, принимающий на вход два аргумента: len и initialValue,
     и возвращающий одномерный массив типа int длиной len, каждая ячейка
     которого равна initialValue*/
    public static int[] returnDimArray(int len, int initialValue) {

        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    /* 5.* Задать одномерный массив и найти в нем минимальный и максимальный элементы*/
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

    /*6. ** Написать метод, в который передается не пустой одномерный
 целочисленный массив, метод должен вернуть true, если в массиве
 есть место, в котором сумма левой и правой части массива равны.
 Примеры:
 checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
 checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
 граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.*/
    public static boolean sumBordersArray() {
        int[] array = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            if (array[i] == array[j]) {
                return true;
            } else if (array[i] > array[j]) {
                array[j] += array[j - 1];
            } else if (array[i] < array[j]) {
                array[i] += array[i + 1];
            }
        }
        return true;
    }

}




