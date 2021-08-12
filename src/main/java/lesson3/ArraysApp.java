package lesson3;
import java.util.Arrays;
import java.util.Comparator;
public class ArraysApp {
    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[3] = 5;
        intArray[1] = 0;
        intArray[0] = 3;

        System.out.println(intArray[3]);

        for (int i=0; i < intArray.length; i++) {
            int value = intArray[i];
            System.out.println("intArray["+i+"] = " + value );
        }

        int[] arr = new int[10];
        for (int i=0; i < arr.length; i++) {
            arr[i] = i*10;
        }

        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(createArrayAndFillIt(8, 42)));
        System.out.println(Arrays.toString(createArrayAndFillIt(5, 55)));

        boolean[] boolArray = new boolean[5];
        Arrays.fill(boolArray, true);
        System.out.println(Arrays.toString(boolArray));

        String[] strings = new String[5];
        Arrays.fill(strings,"default value");
        System.out.println(Arrays.toString(strings));

        int[] exampleArr = new int[]{1,2,3};

        int[] arr7 = {2, 2, 2, 1, 2, 2, 12, 8, 4, 10, 1};
        System.out.println(Arrays.toString(arr7));
        Arrays.sort(arr);
        //Comparator.reverseOrder()
        System.out.println(Arrays.toString(arr7));

        //Last element
        System.out.println(arr7[arr7.length-1]);

    }

    public static int[] createArrayAndFillIt(int length, int valueToFill) {
        int[] result = new int[length];
        Arrays.fill(result, valueToFill);
        return result;
    }
}
