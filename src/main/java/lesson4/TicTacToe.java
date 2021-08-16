package lesson4;

import com.sun.jdi.PathSearchingVirtualMachine;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.PortUnreachableException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static final int DOTS_TO_WIN = 3;
    public static char[][] map;
    public static final char DOT_O = 'O';
    public static final char DOT_X = 'X';
    public static final char DOT_EMPTY = '*';
    public static final int SIZE = 3;
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanMove();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Выиграл человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            npcMove();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Выиграл компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void initMap() {

        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            //левые координаты
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void humanMove() {

        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[x][y] == DOT_EMPTY) {
            return true;
        } else {
            return false;
        }
    }

    public static void npcMove() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(SIZE); // [0, SIZE)
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.printf("NPC сделал ход в %d %d", x + 1, y + 1);
        System.out.println();
        map[x][y] = DOT_O;
    }

    public static boolean checkWin(char sym) {
        //горизонтали
        for (int i = 0; i < SIZE; i++) {

            if (map[0][i] == sym && map[1][i] == sym && map[2][i] == sym) {
                return true;
            }
            if (map[i][0] == sym && map[i][1] == sym && map[i][2] == sym) {
                return true;
            }
        }
        //диагонали
        if (map[0][0] == sym && map[1][1] == sym && map[2][2] == sym) {
            return true;
        }
        if (map[0][2] == sym && map[1][1] == sym && map[2][0] == sym) {
            return true;
        }
        return false;
    }

}




