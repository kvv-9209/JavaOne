package lesson3;
import java.util.Arrays;
public class TwoDimensionArrayApp {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[7][8];
        twoDimArray[1][1] = 10;
        twoDimArray[6][7] = 42;
        System.out.println(Arrays.toString(twoDimArray));

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            Arrays.fill(twoDimArray[i], i);
            System.out.println(Arrays.toString(twoDimArray[i]));
        }

        System.out.println();
        System.out.println();
        System.out.println();

        int[][] nonFixedArray = new int[3][];

        nonFixedArray[0] = new int[]{1, 2, 3};
        nonFixedArray[1] = new int[]{1, 2, 3, 4, 5};
        nonFixedArray[2] = new int[]{1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < nonFixedArray.length; i++) {
            System.out.println(Arrays.toString(nonFixedArray[i]));
        }


    }
}
