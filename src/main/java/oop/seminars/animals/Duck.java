package oop.seminars.animals;

import oop.seminars.Animal;
import oop.seminars.Owner;
import oop.seminars.Ability.Flyable;
import oop.seminars.Ability.Runable;
import oop.seminars.Ability.Swimmable;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Runable, Swimmable {
    protected static final int NUMBEROFPAWS;
    protected static final boolean PRESENCEOFTAIL;
    protected static final boolean FLYABLE;
    protected static final boolean SWIMMABLE;
    protected static final boolean RUNNABLE;

    static {
        NUMBEROFPAWS = 2;
        PRESENCEOFTAIL = true;
        FLYABLE = true;
        SWIMMABLE = true;
        RUNNABLE = true;
    }

    public Duck(String name, int weight, LocalDate age, String sex, Owner owner) {
        super(name, weight, age, sex, owner, NUMBEROFPAWS, PRESENCEOFTAIL, FLYABLE, SWIMMABLE, RUNNABLE);
    }

    public Duck() {
        super();
    }

    @Override
    public double fly(){
        return 90.0;
    }
    @Override
    public double swim(){
        return 8.0;
    }
    @Override
    public double run() {
        return 3.0;
    }
}
