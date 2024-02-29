package oop.seminars;

import oop.seminars.Ability.PersonManagment;
import oop.seminars.mercenary.Doctor;
import oop.seminars.mercenary.Mercenarys;
import oop.seminars.mercenary.Nurse;

import java.util.ArrayList;
import java.util.List;

public class VetClinic implements PersonManagment {
    String name = "Наши младшие друзья!";
    String[] services = {"Стрижка", "Стерилизация", "Лечение", "Усыпление", "Обезболивание", "Липосакция"};
    List<Doctor> doctors = new ArrayList<>();
    List<Nurse> nurses = new ArrayList<>();
    RecruitmentOffice mercy = new RecruitmentOffice();


    public VetClinic() {
        System.out.println("Добро пожаловать в клинику " + name);
        System.out.println("Мы предоставляем следующие услуги: ");
        for (int i = 0; i < services.length; i++) {
            System.out.println(services[i]);//Выводим в терминал список актуальных услуг
        }
        for (int i = 0; i < mercy.mercenarys.size(); i++) {
            hireEmploye(mercy.mercenarys.get(i));
        }
        dismissEmploye(doctors, 0);//Увольняем врача
        dismissEmploye(nurses, 0);//Увольняем вспомогательного цпециалиста

        for (Doctor doc: doctors) {
            System.out.println(doc);//Выводим в терминал список актуальных врачей
        }
        for (Nurse nurs: nurses) {
            System.out.println(nurs);//Выводим в терминал список вспомогательный персонал
        }
        Patients patients = new Patients();//Инициализируем, выводим в терминал список всех животных по категориям способностей

        //операция
        doctors.get(0).heal(patients.animals.get(0).name);
        nurses.get(1).wash(patients.animals.get(0).name);
        nurses.get(1).injection(patients.animals.get(0).name);
        doctors.get(0).surgery(patients.animals.get(0).name);
        nurses.get(0).cut(patients.animals.get(0).name);

    }

    @Override
    public void hireEmploye(Mercenarys mercenarys) {
        if (mercenarys instanceof Doctor) {
            doctors.add((Doctor) mercenarys);
        } else if (mercenarys instanceof Nurse) {
            nurses.add((Nurse) mercenarys);
        }
    }

    @Override
    public void dismissEmploye(List list, int elem) {
        list.remove(elem);
    }
}
