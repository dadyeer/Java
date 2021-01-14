/**
 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 2. Конструктор класса должен заполнять эти поля при создании объекта.
 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 4. Создать массив из 5 сотрудников.
 5. С помощью цикла вывести информацию только о сотрудниках старше 30 лет.
 */

public class Employees {
    private String name;
    private String jobTitle;
    private String email;
    private int phoneNumber;
    private String salary;
    private int age;

    public Employees(String name, String jobTitle, String email, int phoneNumber, String salary, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void employeeInfo() {
        System.out.println(String.format(
                "Name ...%s,JobTitle ...%s,Email ...%s,PhoneNumber ...%s,Salary ...%s,Age ...%s, ",
                name, jobTitle, email, phoneNumber, salary, age
        ));
    }
}
