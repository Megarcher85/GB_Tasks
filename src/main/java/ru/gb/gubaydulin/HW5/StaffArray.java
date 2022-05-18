package ru.gb.gubaydulin.HW5;

import ru.gb.gubaydulin.homework5.Employee;

public class StaffArray {
    public static void main(String[] args) {
        ru.gb.gubaydulin.homework5.Employee[] staffArr = new ru.gb.gubaydulin.homework5.Employee[6];
        staffArr[0] = new ru.gb.gubaydulin.homework5.Employee("Иванов ИИ", "менеджер", "iii@m.ru", "1111", 40000, 25);
        staffArr[1] = new ru.gb.gubaydulin.homework5.Employee("Петров ПП", "менеджер", "ppp@m.ru", "2222", 45000, 52);
        staffArr[2] = new ru.gb.gubaydulin.homework5.Employee("Сидоров СС", "менеджер", "sss@m.ru", "3333", 50000, 45);
        staffArr[3] = new ru.gb.gubaydulin.homework5.Employee("Иванова АА", "менеджер", "iaa@m.ru", "4444", 44000, 35);
        staffArr[4] = new ru.gb.gubaydulin.homework5.Employee("Петрова ББ", "менеджер", "pbb@m.ru", "5555", 48000, 44);
        staffArr[5] = new ru.gb.gubaydulin.homework5.Employee("Сидорова ВВ", "менеджер", "svv@m.ru", "6666", 52000, 33);

    }
}
