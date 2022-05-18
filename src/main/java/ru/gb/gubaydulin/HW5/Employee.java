package ru.gb.gubaydulin.HW5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumb;
    private int salary;
    private int age;


    public Employee(String fullName, String position, String email, String phoneNumb, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumb = phoneNumb;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println("Полное имя сотрудника: " + fullName + ", " + "Должность сотрудника: " + position + ", " + "Электронная почта: " + email + ", " + "Номер телефона: " + phoneNumb + ", " + "Заработная плата: " + salary + ", " + "Возраст сотрудника: " + age);
    }
}
