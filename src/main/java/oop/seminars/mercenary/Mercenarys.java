package oop.seminars.mercenary;

public abstract class Mercenarys {
    String name;
    int age;
    String town;
    String qualification;

    public Mercenarys(String name, int age, String town, String qualification) {
        this.name = name;
        this.age = age;
        this.town = town;
        this.qualification = qualification;
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    public String toString(){
        return String.format("Вид специалиста: %s, name = %s, age = %s, town = %s, qualification = %s", getType(), name, age, town, qualification);
    }
}
