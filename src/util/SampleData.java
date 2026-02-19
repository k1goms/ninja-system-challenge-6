package util;

import model.Ninja;

import java.util.LinkedList;

public class SampleData {

    public static LinkedList<Ninja> createNinjaLinkedList() {

        LinkedList<Ninja> ninjaList = new LinkedList<>();

        ninjaList.add(new Ninja("Naruto", 18, "Hidden Leaft Village"));
        ninjaList.add(new Ninja("Sakura", 18, "Hidden Leaft Village"));
        ninjaList.add(new Ninja("Sasuke", 18, "Hidden Leaft Village"));
        ninjaList.add(new Ninja("Kakashi", 30, "Hidden Leaft Village"));
        ninjaList.add(new Ninja("Tsunade", 50, "Hidden Leaft Village"));
        ninjaList.add(new Ninja("Gaara", 18, "Hidden Sand Village"));
        ninjaList.add(new Ninja("Temari", 18, "Hidden Sand Village"));

        return ninjaList;

    }

}
