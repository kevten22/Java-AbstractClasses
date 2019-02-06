package com.lambdaschool;

public abstract class AbstractAnimal {
    int maxId = 0;
    int id;
    String name;
    int yearDiscovered;

    public AbstractAnimal(String name, int yearDiscovered) {
        maxId++;
        id = maxId;

        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    public String getName() {
        return name;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }
}
