package oop.seminars.mercenary;

import oop.seminars.Ability.CutAble;
import oop.seminars.Ability.InjectionAble;
import oop.seminars.Ability.WashAble;

public class Nurse extends Mercenarys implements CutAble, InjectionAble, WashAble {

    public Nurse(String name, int age, String town, String qualification) {
        super(name, age, town, qualification);
    }

    @Override
    public void cut(String namePatient) {
        System.out.println("Помошник доктора подстриг пациента: " + namePatient);
    }

    @Override
    public void injection(String namePatient) {
        System.out.println("Помошник доктора сделал укол пациенту: " + namePatient);
    }

    @Override
    public void wash(String namePatient) {
        System.out.println("Помошник доктора вымыл пациента: " + namePatient);
    }
}
