package lesson2;

public class MethodApp {
    public static void main(String[] args) {
        int calc1 = calculate(4,6);
        int calc2 = calculate(10, 10);
        int calc4 = calculate(4);
        System.out.println(calc4);


        int calc5 = calculate(calculate(4,6), calculate(10, 10));



        method1("abrakadabra", 100500);
        method1(100500, "string");
    }

    public static void doSomethinng() {
        System.out.println("something");
    }

    static int calculate(int a, int b){
        return 2*a + b;
    }

    static int calculate(int a){
        return calculate(a, a);
    }

    public static void method1(String s, int i) {
        System.out.println("Method1 "+ s +" "+ i);
    }

    public static void method1(int i, String s) {
        System.out.println("Method1 "+ s +" "+ i);
    }






    //ьак больше не делаем
   /* //4 6
    public static int calc1(){
        int a = 4;
        int b = 6;
        return 2* a + b;
    }
    //20 10
    public static int calc2(){
        int a = 20;
        int b = 10;
        return 2* a + b;
    }*/

    //<modifier> <type> <name> (<params> 0..n)

    //public -> default (no modifier) -> protected -> private
}
