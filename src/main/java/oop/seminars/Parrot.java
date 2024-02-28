package oop.seminars;

import java.time.LocalDate;

public class Parrot extends Animals{
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

//    @Override
//    public void toGo(){
//        System.out.println(name + " не умеет бегать");
//    }
    @Override
    public void fly(){
        System.out.println(name + " отлично летает");
    }
//    @Override
//    public void swim(){
//        System.out.println(name + " не умеет плавать");
//    }

}
