package oop.seminars;

import java.time.LocalDate;

public class Animals {
    protected String name;
    protected int weight;
    protected LocalDate age;
    protected String sex;
    protected Owner owner;
    protected int numberOfPaws;
    protected boolean presenceOfTail;
    protected boolean flyable;
    protected boolean swimmable;
    protected boolean runnable;


    public Animals(String name, int weight, LocalDate age, String sex, Owner owner, int numberOfPaws, boolean presenceOfTail, boolean flyable, boolean swimmable, boolean runnable) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.sex = sex;
        this.owner = owner;
        this.numberOfPaws = numberOfPaws;
        this.presenceOfTail = presenceOfTail;
        this.flyable = flyable;
        this.swimmable = swimmable;
        this.runnable = runnable;
    }

    public Animals() {
        this.name = "some animal";
        this.weight = 100;
        this.age = LocalDate.of(2024, 1, 1);
        this.owner = new Owner("Something Human");
    }


//    public void toGo(){
//        switch (getType()){
//            case "Parrot", "EarthWorm", "FishSword":
//                System.out.println(getType() + " не умеет бегать");
//                break;
//            case "Ostrich", "Leon":
//                System.out.println(getType() + " превосходно бегает");
//                break;
//            case "Gorilla", "Penguin", "Duck":
//                System.out.println(getType() + " не плохо бегает");
//                break;
//        }
//    }

//    public void fly(){
//        switch (getType()){
//            case "Parrot", "Duck":
//                System.out.println(getType() + " отлично летает");
//                break;
//            case "Ostrich", "EarthWorm", "Leon", "FishSword", "Gorilla", "Penguin":
//                System.out.println(getType() + " не умеет летать");
//                break;
//        }
//    }
    public void swim(){

    }
    public void toGo(){

    }
    public void fly(){

    }


    public void lifeCycle(){
        wakeup();
        eat();
        play();
        sleep();
    }
    public String getType(){
        return getClass().getSimpleName();
    }
    private void sleep(){
        System.out.println(getType() + " is sleeping");
    }
    private void wakeup(){
        System.out.println(getType() + " waked up");
    }
    private void eat(){
        System.out.println(getType() + " is eating");
    }
    private void play(){
        System.out.println(getType() + " is playing");
    }


    public String toString(){
        return String.format("Вид животного: %s, name = %s, weight = %s, age = %s, owner = %s, sex = %s, number of paws = %s, presence of tail = %s, flyable = %s, swimmable = %s",
                getType(), name, weight, age, owner, sex, numberOfPaws, presenceOfTail, flyable, swimmable);
    }
}
