package oop.seminars;

import java.time.LocalDate;

public class Leon extends Animals {
    protected static final int NUMBEROFPAWS;
    protected static final boolean PRESENCEOFTAIL;
    protected static final boolean FLYABLE;
    protected static final boolean SWIMMABLE;
    protected static final boolean RUNNABLE;

    static {
        NUMBEROFPAWS = 4;
        PRESENCEOFTAIL = true;
        FLYABLE = false;
        SWIMMABLE = true;
        RUNNABLE = true;
    }

    public Leon(String name, int weight, LocalDate age, String sex, Owner owner) {
        super(name, weight, age, sex, owner, NUMBEROFPAWS, PRESENCEOFTAIL, FLYABLE, SWIMMABLE, RUNNABLE);
    }

    public Leon() {
        super();
    }
    @Override
    public void toGo(){
        System.out.println(name + " бегает оч быстро");
    }
//    @Override
//    public void fly(){
//        System.out.println(name + "  не умеет летать");
//    }
    @Override
    public void swim(){
        System.out.println(name + " плавает, но медленно");
    }


}
