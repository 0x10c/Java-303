package io.github.theacid.challenge108;

import java.util.ArrayList;
import java.util.List;

class Main4 {
    public static void main(String[] args) {
        List<String> listOfElements = new ArrayList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        List<String> listOfElements2 = new ArrayList<>();
        listOfElements2.add("Java");
        listOfElements2.add("Scala");
        listOfElements2.add("Golang");
        listOfElements2.add("C#");
        listOfElements2.add("Malbolge");
        listOfElements2.add("C++");
        listOfElements2.add("Elixir");


        List<String> listOfElements3 = new ArrayList<>();
        for(String elements : listOfElements) {
            listOfElements3 .add(listOfElements2.contains(elements) ? "Yes" : "No");
            System.out.println(listOfElements3);
        }
    }
}