package lesson2;

public class WhileApp {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i = i - 2;
        }


        int j = 10;
        while (j < 100) {
            int z = j;
            if (j > 55) {
                break;
            }
            System.out.println(z);
            j += 10; // j = j+10;
        }
        //System.out.println(z);

        int k = 0;
        do {
            System.out.println(k);
            k += 5;
        } while (k > 100);

        //infinite
        //while (true){}
    }
}
