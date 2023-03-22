package com.engeto.lekce8_jUnit;

import animals.Cat;
import animals.Dog;
import animals.GoldFish;

import java.util.Scanner;

public class lekce8_jUnit {

    public static void main(String[] args) {

        // Example1 hard coded
        Dog dog = new Dog("Rex", "Labrador", 5);
        System.out.print("Jmeno psa je: " + dog.getName());
        System.out.println(", je " + dog.getAge() + " let stary a je to " + dog.getBreed() + ". A dokaze utikat rychlosti: " + dog.calculateSpeed() + " km/h.");

        Cat cat = new Cat("Micka", "Persian", 3);
        System.out.print("Jmeno kocky je: " + cat.getName());
        System.out.println(", je " + cat.getAge() + " let stara a je to " + cat.getBreed() + ".");

        GoldFish goldFish = new GoldFish("Zlaty", 3);
        System.out.print("Jmeno ryby je: " + goldFish.getName());
        System.out.println(", je " + goldFish.getAge() + " let stara, to odpovida " + goldFish.calculateAgeInHumanYears() + " lidskym letum.");

        // Example2 with user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Zadejte druh zvirete:");
        System.out.println("1 - pes");
        System.out.println("2 - kocka");
        System.out.println("3 - ryba");
        String animalType = keyboard.nextLine();

        System.out.println("Zadejte jmeno zvirete:");
        String animalName = keyboard.nextLine();

        System.out.println("Zadejte vek zvirete:");
        int animalAge = keyboard.nextInt();

        if (animalType.equals("1")) {
            System.out.println("Zadejte plemeno psa:");
            String animalBreed = keyboard.nextLine();
            Dog dog2 = new Dog(animalName, animalBreed, animalAge);
            System.out.print("Jmeno psa je: " + dog2.getName());
            System.out.println(", je " + dog2.getAge() + " let stary a je to " + dog2.getBreed() + ". A dokaze utikat rychlosti: " + dog2.calculateSpeed() + " km/h.");
        } else if (animalType.equals("2")) {
            System.out.println("Zadejte plemeno kocky:");
            String animalBreed = keyboard.nextLine();
            Cat cat2 = new Cat(animalName, animalBreed, animalAge);
            System.out.print("Jmeno kocky je: " + cat2.getName());
            System.out.println(", je " + cat2.getAge() + " let stara a je to " + cat2.getBreed() + ".");
        } else if (animalType.equals("3")) {
            GoldFish goldFish2 = new GoldFish(animalName, animalAge);
            System.out.print("Jmeno ryby je: " + goldFish2.getName());
            System.out.println(", je " + goldFish2.getAge() + " let stara, to odpovida " + goldFish2.calculateAgeInHumanYears() + " lidskym letum.");
        } else {
            System.out.println("Neznamy typ zvirete.");
        }


    }
}
