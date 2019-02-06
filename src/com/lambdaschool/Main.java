package com.lambdaschool;
import java.util.ArrayList;

public class Main {

    public static void printAnimals(ArrayList<AbstractAnimal> vehicles, CheckAnimal tester){
        for( AbstractAnimal v: vehicles){
            if(tester.test(v))
            {
                System.out.println(v.getName());
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
    ArrayList<AbstractAnimal> zoo = new ArrayList<AbstractAnimal>();

    //Mammals
    zoo.add(new Mammal("Panda", 1869));
    zoo.add(new Mammal("Zebra", 1778));
    zoo.add(new Mammal("Koala", 1816));
    zoo.add(new Mammal("Sloth", 1804));
    zoo.add(new Mammal("Armadillo", 1758));
    zoo.add(new Mammal("Raccoon", 1758));
    zoo.add(new Mammal("Bigfoot", 2021));

    //Birds
    zoo.add(new Bird("Pigeon", 1837));
    zoo.add(new Bird("Peacock", 1821));
    zoo.add(new Bird("Toucan", 1758));
    zoo.add(new Bird("Parrot", 1824));
    zoo.add(new Bird("Swan", 1758));

    //Fish
    zoo.add(new Fish("Salmon", 1758));
    zoo.add(new Fish("Catfish", 1817));
    zoo.add(new Fish("Perch", 1758));

    //Sorts and prints by year named in descending order
    zoo.sort((v1, v2) -> v2.getYearDiscovered() - v1.getYearDiscovered());
    zoo.forEach((v) -> System.out.println(v.getYearDiscovered()));

    //Sorts and prints by animal names alphabetically
    zoo.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
    zoo.forEach((v) -> System.out.println(v.getName()));

    //Sorts and prints by how animals move
    zoo.sort((v1,v2) -> v1.move().compareToIgnoreCase(v2.move()));
    zoo.forEach((v) -> System.out.println(v.getName() + ": " + v.move()));

    System.out.println("Animals that breathe with lungs:");;
    printAnimals(zoo, v -> v.breath().equals("lungs"));

    System.out.println("Animals that breath with lungs and named in 1758:");
    printAnimals(zoo, v -> (v.breath().equals("lungs") && v.getYearDiscovered() == 1758));

    System.out.println("Animals that lay eggs and breath with lungs:");
    printAnimals(zoo, v -> (v.breath().equals("lungs") && v.reproduce().equals("eggs")));

    System.out.println("Animals named in 1758 in alphabetical order:");
    zoo.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
    printAnimals(zoo, v -> v.getYearDiscovered() == 1758);

    }
}
