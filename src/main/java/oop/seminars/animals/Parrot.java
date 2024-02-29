package oop.seminars.animals;

import oop.seminars.Animal;
import oop.seminars.Owner;
import oop.seminars.Ability.Flyable;

import java.time.LocalDate;

public class Parrot extends Animal implements Flyable {
    protected static final int NUMBEROFPAWS;
    protected static final boolean PRESENCEOFTAIL;
    protected static final boolean FLYABLE;
    protected static final boolean SWIMMABLE;
    protected static final boolean RUNNABLE;

    static {
        NUMBEROFPAWS = 2;
        PRESENCEOFTAIL = true;
        FLYABLE = true;
        SWIMMABLE = false;
        RUNNABLE = false;
    }

    public Parrot(String name, int weight, LocalDate age, String sex, Owner owner) {
        super(name, weight, age, sex, owner, NUMBEROFPAWS, PRESENCEOFTAIL, FLYABLE, SWIMMABLE, RUNNABLE);
    }
    public Parrot() {
        super();
    }

    @Override
    public double fly(){
        return 120.0;
    }


}
