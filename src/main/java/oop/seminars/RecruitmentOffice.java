package oop.seminars;

import oop.seminars.mercenary.Doctor;
import oop.seminars.mercenary.Mercenarys;
import oop.seminars.mercenary.Nurse;

import java.util.ArrayList;
import java.util.List;

public class RecruitmentOffice {
    List<Mercenarys> mercenarys = new ArrayList<>();

    Mercenarys doctor1 = new Doctor("Айболит", 55, "Вильно", "Ветеринарный врач I категории");
    Mercenarys doctor2 = new Doctor("Быков", 45, "Ленинград", "Ветеринарный врач II категории");
    Mercenarys doctor3 = new Doctor("Лобанов", 25, "Москва", "Ветеринарный врач");
    Mercenarys nurse1 = new Nurse("Любовь Михайловна", 45, "Ростов", "Санитар");
    Mercenarys nurse2 = new Nurse("Купитман", 50, "Воронеж", "Младший ветеринарный врач");
    Mercenarys nurse3 = new Nurse("Черноус", 25, "Краснодар", "Младший ветеринарный врач");

    public RecruitmentOffice() {
        mercenarys.add(doctor1);
        mercenarys.add(doctor2);
        mercenarys.add(doctor3);
        mercenarys.add(nurse1);
        mercenarys.add(nurse2);
        mercenarys.add(nurse3);
    }
}
