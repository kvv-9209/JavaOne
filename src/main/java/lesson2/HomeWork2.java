package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {

        isSummInRange (5, 12);
        isPositive (5);
        isNegative (-5);
        printString ("Я выполнил дз", 5);
        leapYears (2021);

    }

    /**
     * 1. сумма должна лежать в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false
     */
    public static boolean isSummInRange (int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20)
        {
            return true;
            //System.out.println(true);
        }
        else {
            return false;
            //System.out.println(false);
        }
    }
    /**
     * 2. метод должен напечатать в консоль, положительное ли
     * число передали или отрицательное. Замечание: ноль считаем
     * положительным числом.
     */

    public static void isPositive (int d) {
        if (d >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
    /**
     * 3. Метод должен вернуть true, если число отрицательное,
     * и вернуть false если положительное
     */

    public static boolean isNegative (int d) {
        if (d >= 0) {
            return false;
            // System.out.println(false);
        }
        else {
            return true;
            // System.out.println(true);
        }
    }
    /**
     * 4. в качестве аргументов передается строка и число, метод должен
     * отпечатать в консоль указанную строку, указанное количество раз
     */
    public static void printString(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    /**
     * Если год високосный, тогад он принимает значение true иначе false
     * если введенный год делится без остатка на 4 переходим к следующему условию,
     * иначе он не високосный
     * если введенный год делится без остатка на 100 переходим к следующему условию,
     *  иначе он високосный
     *  если введенный год делится без остатка на 400 тогда год високосный,
     *  иначе он не високосный
     *
     * @param year отвечает за то, какой год надо проверить на високосность
     */
    public static boolean leapYears (int year) {

        if (year % 4 != 0) {
            return false;
            // System.out.println(false);

        } else if (year % 100 != 0) {
            return true;
            //System.out.println(true);

        } else if (year % 400 != 0) {
            return true;
            //System.out.println(true);

        } else {
            return false;
            //System.out.println(false);
        }
    }
}
