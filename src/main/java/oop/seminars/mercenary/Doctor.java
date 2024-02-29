package oop.seminars.mercenary;

import oop.seminars.Ability.HealAble;
import oop.seminars.Ability.InjectionAble;
import oop.seminars.Ability.SurgeryAble;

public class Doctor extends Mercenarys implements HealAble, InjectionAble, SurgeryAble {


    public Doctor(String name, int age, String town, String qualification) {
        super(name, age, town, qualification);
    }

    @Override
    public void heal(String namePatient) {
        System.out.println("Доктор полечил пациента: " + namePatient);
    }

    @Override
    public void injection(String namePatient) {
        System.out.println("Доктор сделал укол пациенту: " + namePatient);
    }

    @Override
    public void surgery(String namePatient) {
        System.out.println("Доктор прооперировал пациента: " + namePatient);
    }
}
