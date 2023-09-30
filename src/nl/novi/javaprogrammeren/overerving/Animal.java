package nl.novi.javaprogrammeren.overerving;
import nl.novi.javaprogrammeren.overerving.Cat;
import nl.novi.javaprogrammeren.overerving.Wolf;
import nl.novi.javaprogrammeren.overerving.Leeuw;
import nl.novi.javaprogrammeren.overerving.Tiger;

public abstract class Animal {
    public String animalName;
    private String animalSex;
    private String animalFood;
    private String animalSound;

    public Animal(String animalName, String animalSex, String animalFood, String animalSound) {
        this.animalName = animalName;
        this.animalSex = animalSex;
        this.animalFood = animalFood;
        this.animalSound = animalSound;
    }

    public void animalMakeSound() {
        System.out.println(animalSound);
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalSex() {
        return animalSex;
    }

    public void setAnimalSex(String animalSex) {
        this.animalSex = animalSex;
    }

    public String getAnimalFood() {
        return animalFood;
    }

    public void setAnimalFood(String animalFood) {
        this.animalFood = animalFood;
    }

    public String getAnimalSound() {
        return animalSound;
    }

    public void setAnimalSound(String animalSound) {
        this.animalSound = animalSound;
    }

    // Animal:

    // Alle dieren moeten kunnen bewegen


    // Wilde dieren:
    // naam van het hok
    // weekdag laatst gevoed
    // land van herkomst

    // Huisdieren:
    // naam van het baasje
    // Favoriete voedselmerk
    // Soort

    // Leeuw:
    // hoeveelheid kinderen

    // Tijger:
    // Aantal strepen

    // Wolf:
    // naam van de roedel

    // Hond:

    // Kat:
    // binnen of buitenkat


}


// Animal
// Huisdieren - Wilde dieren
// Huisdieren: Hond, Kat
// Wilde dieren: Leeuw, tijger en Wolf