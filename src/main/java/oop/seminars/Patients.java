package oop.seminars;

import oop.seminars.Ability.Flyable;
import oop.seminars.Ability.Runable;
import oop.seminars.Ability.Swimmable;
import oop.seminars.animals.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patients {
    List<Animal> animals = new ArrayList<>();
    List<Flyable> flyables = new ArrayList<>();
    List<Swimmable> swimmables = new ArrayList<>();
    List<Runable> runables = new ArrayList<>();

    public Patients() {
        animals.add(leon);
        animals.add(earthWorm);
        animals.add(fishSword);
        animals.add(gorilla);
        animals.add(penguin);
        animals.add(ostrich);
        animals.add(parrot);
        animals.add(duck);

        System.out.println("____________________________________________");
        System.out.println("Списки животных по способностям");

        createCategoryFly(flyables, animals);
        for (Flyable elem: flyables) {System.out.println(elem);}

        createCategorySwim(swimmables, animals);
        for (Swimmable elem: swimmables) {System.out.println(elem);}

        createCategoryRun(runables, animals);
        for (Runable elem: runables) {System.out.println(elem);}
    }

    Animal leon = new Leon("Бонифаций", 190, LocalDate.of(2000, 1, 1), "male", new Owner("Disel"));
    Animal earthWorm = new EarthWorm("Jim", 1, LocalDate.of(2024, 1,1), new Owner("John"));
    Animal fishSword = new FishSword("JohnTravolta", 30, LocalDate.of(2020, 1,1), "male", new Owner("Peter"));
    Animal gorilla = new Gorilla("Kong", 120, LocalDate.of(2021, 1,1), "male", new Owner("Bob"));
    Animal penguin = new Penguin("Ковальски", 10, LocalDate.of(2022, 1,1), "male", new Owner("Tacker"));
    Animal ostrich = new Ostrich("Road Runner", 30, LocalDate.of(2020, 1,1), "female", new Owner("Putin"));
    Animal parrot = new Parrot("Инокентий", 5, LocalDate.of(2020, 1,1), "male", new Owner("Obama"));
    Animal duck = new Duck("Daffy Duck", 8, LocalDate.of(2018, 1,1), "male", new Owner("Richer"));


    //Три дублирующихся метода, не могу придумать как объеденить их в один
    void createCategoryFly(List<Flyable> list, List<Animal> animals ){
        System.out.println("Летающие");
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Flyable){
                list.add((Flyable) animals.get(i));
            }
        }
    }
    void createCategorySwim(List<Swimmable> list, List<Animal> animals ){
        System.out.println("Плавающие");
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Swimmable){
                list.add((Swimmable) animals.get(i));
            }
        }
    }
    void createCategoryRun(List<Runable> list, List<Animal> animals ){
        System.out.println("Бегающие");
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Runable){
                list.add((Runable) animals.get(i));
            }
        }
    }
}
