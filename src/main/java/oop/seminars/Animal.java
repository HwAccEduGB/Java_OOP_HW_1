package oop.seminars;

import java.time.LocalDate;

public abstract class Animal {
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

    public Animal(String name, int weight, LocalDate age, String sex, Owner owner, int numberOfPaws, boolean presenceOfTail, boolean flyable, boolean swimmable, boolean runnable) {
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

    public Animal() {
        this.name = "some animal";
        this.weight = 100;
        this.age = LocalDate.of(2024, 1, 1);
        this.owner = new Owner("Something Human");
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    public String toString(){
        return String.format("Вид животного: %s, name = %s, weight = %s, age = %s, owner = %s, sex = %s, number of paws = %s, presence of tail = %s, flyable = %s, swimmable = %s",
                getType(), name, weight, age, owner, sex, numberOfPaws, presenceOfTail, flyable, swimmable);
    }
}
