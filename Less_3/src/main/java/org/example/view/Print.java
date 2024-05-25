package org.example.view;

import org.example.controller.Run;
import org.example.model.*;

public class Print {
    // Печать списка всех сотрудников
    public static void allSotr () {
        System.out.println("----- Список Сотрудников -----");
        for (int i = 0; i < Run.sotrs.size(); i++) {
            System.out.println(Run.sotrs.get(i));
        }
    }

    public static void sotrCount () {
        System.out.println("----- Всего Сотрудников -----");
        System.out.println("Всего сотрудников: " + Worker.count);
    }

    public static void sotrSalary () {
        System.out.println("----- Зарплаты Сотрудников -----");
        for (int i = 0; i < Run.sotrs.size(); i++) {
            System.out.println(Run.sotrs.get(i).getName() + " " +
                    Run.sotrs.get(i).getFirstName() + " -> " +
                    Run.sotrs.get(i).getSalary());
        }
    }


}
