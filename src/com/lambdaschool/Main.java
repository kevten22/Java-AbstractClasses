package com.lambdaschool;
import java.util.ArrayList;

public class Main {

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

    }
}
