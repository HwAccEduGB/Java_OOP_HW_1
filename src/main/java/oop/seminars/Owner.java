package oop.seminars;

import java.time.LocalDate;

public class Owner {
    public String name;
    public String sex;
    public LocalDate age;

    public Owner(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
}
