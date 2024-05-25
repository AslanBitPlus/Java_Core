package org.example.model;

public class Sotr extends Worker {
    public Sotr(Integer status, String firstName, String name,
                String sureName, String birthday, Double salary) {
        super(status, firstName, name, sureName, birthday, salary);
    }


    @Override
    public String toString() {
        String st = "";
        if (status == 1) {
            st = "Сотрудник";
        } else st = "Босс>";
        return st +" {" +
                "Фамилия: '" + firstName + '\'' +
                ", Имя: '" + name + '\'' +
                ", Отчество: '" + sureName + '\'' +
                ", Дата ождения: '" + birthday + '\'' +
                ", ЗПЛ: '" + salary + '\'' +
                '}';
    }

}
