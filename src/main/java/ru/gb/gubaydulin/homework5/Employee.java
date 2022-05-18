package ru.gb.gubaydulin.homework5;

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
        setSalary(salary);
        setAge(age);
    }

    public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 200) {
            this.age = age;
        }
    }

    public void print() {
        System.out.println("Полное имя сотрудника: " + fullName + ", " + "Должность сотрудника: " + position + ", " + "Электронная почта: " + email + ", " + "Номер телефона: " + phoneNumb + ", " + "Заработная плата: " + salary + ", " + "Возраст сотрудника: " + age);
    }
}
