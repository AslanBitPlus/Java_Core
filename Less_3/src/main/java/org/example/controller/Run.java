package org.example.controller;

import java.util.ArrayList;
import org.example.model.Sotr;

public class Run {
    /**
     Массив для Сотрудников
     **/
    public static ArrayList<Sotr> sotrs = new ArrayList<>();

    /**
     newSotr Ввод нового сотрудника
     @param st Статус Сотрудника [0 - Уволен, 1 - Работает, 2 - Босс]
     @param fName Фамилия
     @param name Имя
     @param lName Отчество
     @param bDay Дата рождения (строка)
     @param slr ЗПЛ
     **/
    public static void newSotr(Integer st, String fName, String name,
                               String lName, String bDay, Double slr) {
        // Заполняе Массив cats
        sotrs.add(new Sotr(st, fName, name, lName, bDay, slr));
    }

    // Поднятие зарплаты сотрудникам
    public static void upSalary(Integer proc, Integer sotrNum) {
        // Поднятие зарплаты на proc процентов Сотруднику sotrNum
        // При sotrNum = -1 повышение зарплаты всем кроме Босса
        double oldslr = 0.0;
        double newslr = 0.0;

        // Повышение всем Сотрудникам
        if (sotrNum == -1) {
            System.out.println("----- Повышение зарплат всем сотрудникам на " + proc + "%  -----");
            for (int i = 0; i <Run.sotrs.size() ; i++) {
                if (Run.sotrs.get(i).getStatus() == 1) {
                    oldslr = Run.sotrs.get(i).getSalary();
                    newslr = oldslr + (oldslr * proc / 100);
                    Run.sotrs.get(i).setSalary(newslr);
                    // System.out.println(i + " - " + oldslr + " -> " + newslr);
                }
            }

        } else if (sotrNum - 1 < Run.sotrs.size() && sotrNum >= 0) {
            System.out.println("----- Повышение зарплаты сотруднику " +
                    Run.sotrs.get(sotrNum - 1).getName() + " " +
                    Run.sotrs.get(sotrNum - 1).getFirstName() + " на " +
                    proc + "%  -----");
            oldslr = Run.sotrs.get(sotrNum - 1).getSalary();
            newslr = oldslr + (oldslr * proc / 100);
            Run.sotrs.get(sotrNum - 1).setSalary(newslr);
        }


    }


}
