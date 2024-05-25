package org.example;

import org.example.model.Sotr;
import org.example.controller.Run;
import org.example.view.Print;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Run.newSotr(1,"Иванов", "Иван", "Иванович", "2000-04-22", 25000.00);
        Run.newSotr(1,"Петров", "Сергей", "Михайлович", "2000-04-22", 30000.00);
        Run.newSotr(2,"Сидоров", "Михаил", "Сидорович", "2000-04-22", 45000.00);
        Run.newSotr(1,"Михайлов", "Василий", "Петрович", "2000-04-22", 22000.00);
        Run.newSotr(1,"Сергеев", "Петр", "Васильевич", "2000-04-22", 24000.00);

        // Печать всех сотрудников
        Print.allSotr();

        // Печать количества сотрудников
        Print.sotrCount();

        // Печать количества сотрудников
        Print.sotrSalary();

        // Поднятие зарплат Сотрудникам на proc Процентов
        Run.upSalary(20, -1);

        // Печать количества сотрудников
        Print.sotrSalary();

        // Поднятие зарплат Сотрудникам на proc Процентов
        Run.upSalary(2, 1);

        // Печать количества сотрудников
        Print.sotrSalary();
    }



}