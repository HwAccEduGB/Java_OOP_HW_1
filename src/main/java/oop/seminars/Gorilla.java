package oop.seminars;

import java.time.LocalDate;

public class Gorilla extends Animals{
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
    public void toGo(){
        System.out.println(name + " бегает достаточно быстро");
    }
//    @Override
//    public void fly(){
//        System.out.println(name + "  не умеет летать");
//    }
//    @Override
//    public void swim(){
//        System.out.println(name + " не умеет плавать");
//    }
}
