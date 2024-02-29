package oop.seminars.animals;

import oop.seminars.Animal;
import oop.seminars.Owner;

import java.time.LocalDate;

public class EarthWorm extends Animal {
    protected static final int NUMBEROFPAWS;
    protected static final boolean PRESENCEOFTAIL;
    protected static final boolean FLYABLE;
    protected static final boolean SWIMMABLE;
    protected static final boolean RUNNABLE;
    protected static final String SEX;

    static {
        NUMBEROFPAWS = 0;
        PRESENCEOFTAIL = true;
        FLYABLE = false;
        SWIMMABLE = false;
        RUNNABLE = false;
        SEX = "Hermaphrodite";
    }

    public EarthWorm(String name, int weight, LocalDate age, Owner owner) {
        super(name, weight, age, SEX, owner, NUMBEROFPAWS, PRESENCEOFTAIL, FLYABLE, SWIMMABLE, RUNNABLE);
    }
    public EarthWorm() {
        super();
    }


}
