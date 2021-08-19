package lesson5.HomeWork5;

public class EmployeeApp {

    public static final int SIZE = 5;

    public static void main(String[] args) {

        // Вначале объявляем массив объектов
        Employee[] empArray = new Employee[SIZE];
        // потом для каждой ячейки массива задаем объект
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "Ivanov@mailbox.com", 89231231224l, 78000, 30);
        empArray[1] = new Employee("Fedorov Fedor", "Programmer", "Fedorov@mailbox.com", 89298536812l, 80000, 28);
        empArray[2] = new Employee("Tapochkina Elena", "Engineer", "Tapochkina@mailbox.com", 89259231482l, 65000, 32);
        empArray[3] = new Employee("Kuznetsov Semen", "Programmer", "Kuznetsov@mailbox.com", 89261650101l, 130000, 41);
        empArray[4] = new Employee("Medvedev Dmitri", "Deputy Chairman", "Medvedev@mailbox.com", 89296123121l, 600000, 55);

        for (int i = 0; i < SIZE; i++) {
            if (empArray[i].getAge() > 40) {
                empArray[i].info();
            }
        }
    }
}
