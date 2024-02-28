package oop.seminars;

import java.time.LocalDate;

public class EarthWorm extends Animals{
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
//    @Override
//    public void toGo(){
//        System.out.println(name + " не умеет бегать");
//    }
//    @Override
//    public void fly(){
//        System.out.println(name + " не умеет летать");
//    }
//    @Override
//    public void swim(){
//        System.out.println(name + " не умеет плавать");
//    }
}
