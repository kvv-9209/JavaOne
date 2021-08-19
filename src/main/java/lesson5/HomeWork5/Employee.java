package lesson5.HomeWork5;

//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    private String fio;
    private String post;
    private String email;
    private long telephone;
    private int salary;
    private int age;

    //Конструктор класса должен заполнять эти поля при создании объекта
    public Employee(String fio, String post, String email, long telephone, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Сотрудник:\n" +
                "Фамилия и имя: '" + fio + '\'' +
                ", Должность: '" + post + '\'' +
                ", email: '" + email + '\'' +
                ", Тел.: " + telephone +
                ", Зарплата: " + salary +
                ", Возраст: " + age;
    }

    public int getAge() {
        return age;
    }
}
