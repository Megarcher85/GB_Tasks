package ru.gb.gubaydulin.homework5;

import java.lang.*;

public class Task1 {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Иванов Иван Иванович", "менеджер", "iii@mail.ru", "1111", 50000, 25);
        Employee employee2 = new Employee("Петров Пётр Петрович", "начальник отдела", "ppp@mail.ru", "2222", 60, 35);


        System.out.println("employee1_FullName = " + employee1.getFullName());
        System.out.println("employee1_position = " + employee1.getPosition());
        System.out.println("employee1_email = " + employee1.getEmail());
        System.out.println("employee1_phoneNumb = " + employee1.getPhoneNumb());
        System.out.println("employee1_salary = " + employee1.getSalary());
        System.out.println("employee1_age = " + employee1.getAge());
        System.out.println();

        System.out.println("employee2_FullName = " + employee2.getFullName());
        System.out.println("employee2_position = " + employee2.getPosition());
        System.out.println("employee2_email = " + employee2.getEmail());
        System.out.println("employee2_phoneNumb = " + employee2.getPhoneNumb());
        System.out.println("employee2_salary = " + employee2.getSalary());
        System.out.println("employee2_age = " + employee2.getAge());

    }
}







