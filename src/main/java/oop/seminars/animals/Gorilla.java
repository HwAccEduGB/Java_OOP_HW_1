package oop.seminars.animals;

import oop.seminars.Animal;
import oop.seminars.Owner;
import oop.seminars.Ability.Runable;

import java.time.LocalDate;

public class Gorilla extends Animal implements Runable {
    protected static final int NUMBEROFPAWS;
    protected static final boolean PRESENCEOFTAIL;
    protected static final boolean FLYABLE;
    protected static final boolean SWIMMABLE;
    protected static final boolean RUNNABLE;

    static {
        NUMBEROFPAWS = 4;
        PRESENCEOFTAIL = false;
        FLYABLE = false;
        SWIMMABLE = false;
        RUNNABLE = true;
    }

    public Gorilla(String name, int weight, LocalDate age, String sex, Owner owner) {
        super(name, weight, age, sex, owner, NUMBEROFPAWS, PRESENCEOFTAIL, FLYABLE, SWIMMABLE, RUNNABLE);
    }
    public Gorilla() {
        super();
    }

    @Override
    public double run() {
        return 40.0;
    }
}
