package oop.seminars.animals;

import oop.seminars.Animal;
import oop.seminars.Owner;
import oop.seminars.Ability.Runable;
import oop.seminars.Ability.Swimmable;

import java.time.LocalDate;

public class Penguin extends Animal implements Runable, Swimmable {
    protected static final int NUMBEROFPAWS;
    protected static final boolean PRESENCEOFTAIL;
    protected static final boolean FLYABLE;
    protected static final boolean SWIMMABLE;
    protected static final boolean RUNNABLE;

    static {
        NUMBEROFPAWS = 2;
        PRESENCEOFTAIL = true;
        FLYABLE = false;
        SWIMMABLE = true;
        RUNNABLE = true;
    }

    public Penguin(String name, int weight, LocalDate age, String sex, Owner owner) {
        super(name, weight, age, sex, owner, NUMBEROFPAWS, PRESENCEOFTAIL, FLYABLE, SWIMMABLE, RUNNABLE);
    }
    public Penguin() {
        super();
    }

    @Override
    public double swim(){
        return 15.0;
    }
    @Override
    public double run() {
        return 8;
    }
}
