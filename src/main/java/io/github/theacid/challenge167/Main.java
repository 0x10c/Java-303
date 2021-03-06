package io.github.theacid.challenge167;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> listOfElements = new TreeMap<>();
        listOfElements.put(1, "Java");
        listOfElements.put(11, "Scala");
        listOfElements.put(21, "Golang");
        listOfElements.put(31, "C#");
        listOfElements.put(41, "C");
        listOfElements.put(61, "C++");
        listOfElements.put(71, "Elixir");

        System.out.println("Original TreeMap: " + listOfElements);

        System.out.println("Values for keys less or equal to 29: " + listOfElements.higherKey(29));
        System.out.println("Values for keys less or equal to 55: " + listOfElements.higherKey(55));
        System.out.println("Values for keys less or equal to 72: " + listOfElements.higherKey(72));
    }
}
