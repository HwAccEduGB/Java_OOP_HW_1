package oop.seminars.animals;

import oop.seminars.Animal;
import oop.seminars.Owner;
import oop.seminars.Ability.Swimmable;

import java.time.LocalDate;

public class FishSword extends Animal implements Swimmable {
    protected static final int NUMBEROFPAWS;
    protected static final boolean PRESENCEOFTAIL;
    protected static final boolean FLYABLE;
    protected static final boolean SWIMMABLE;
    protected static final boolean RUNNABLE;

    static {
        NUMBEROFPAWS = 0;
        PRESENCEOFTAIL = true;
        FLYABLE = false;
        SWIMMABLE = true;
        RUNNABLE = false;
    }

    public FishSword(String name, int weight, LocalDate age, String sex, Owner owner) {
        super(name, weight, age, sex, owner, NUMBEROFPAWS, PRESENCEOFTAIL, FLYABLE, SWIMMABLE, RUNNABLE);
    }
    public FishSword() {
        super();
    }

    @Override
    public double swim(){
        return 90.0;
    }

}
