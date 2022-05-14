package ru.gb.gubaydulin.homework5;

public class Task1 {
    public static void main(String[] args) {

    }

    public static class Employee {
        private String fullName;
        private String position;
        private String email;
        private String phoneNumb;
        private int salary;
        private int age;

        public Employee (String fullName, String position, String email, String phoneNumb, int salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phoneNumb = phoneNumb;
            this.salary = salary;
            this.age = age;
        }

    }
    Employee employee = new Employee ("Петров Пётр Петрович", "начальник отдела", "ppp@mail.ru", "2222", 60, 35);
}

