package oop.seminars;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Leon leon = new Leon("Бонифаций", 150, LocalDate.of(2000, 1, 1), "male", new Owner("Disel"));
        EarthWorm earthWorm = new EarthWorm("Jim", 1, LocalDate.of(2024, 1,1), new Owner("John"));
        FishSword fishSword = new FishSword("JohnTravolta", 30, LocalDate.of(2020, 1,1), "male", new Owner("Peter"));
        Gorilla gorilla = new Gorilla("Kong", 120, LocalDate.of(2021, 1,1), "male", new Owner("Bob"));
        Penguin penguin = new Penguin("Ковальски", 10, LocalDate.of(2022, 1,1), "male", new Owner("Tacker"));
        Ostrich ostrich = new Ostrich("Road Runner", 30, LocalDate.of(2020, 1,1), "female", new Owner("Putin"));
        Parrot parrot = new Parrot("Инокентий", 5, LocalDate.of(2020, 1,1), "male", new Owner("Obama"));
        Duck duck = new Duck("Daffy Duck", 8, LocalDate.of(2018, 1,1), "male", new Owner("Richer"));
        Duck duckTest = new Duck();

        List<Animals> animals = new ArrayList<>();
        animals.add(leon);
        animals.add(earthWorm);
        animals.add(fishSword);
        animals.add(gorilla);
        animals.add(penguin);
        animals.add(ostrich);
        animals.add(parrot);
        animals.add(duck);
        animals.add(duckTest);
        for (Animals animal: animals) {
            System.out.println(animal);
        }
        System.out.println("-----------------------------");
        parrot.toGo();
        duck.fly();
        fishSword.swim();
        leon.toGo();
        System.out.println("-----------------------------");
        parrot.lifeCycle();

    }
}