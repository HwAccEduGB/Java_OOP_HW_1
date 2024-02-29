package oop.seminars.Ability;

import oop.seminars.mercenary.Mercenarys;

import java.awt.*;

public interface PersonManagment {
    void hireEmploye(Mercenarys mercenarys);
//    void dismissEmploye(List list, int elem);

    void dismissEmploye(java.util.List list, int elem);
}
