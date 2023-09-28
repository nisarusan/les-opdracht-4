package nl.novi.javaprogrammeren.overerving;


public class Leeuw extends WildAnimals {
    String lionStripes;

    public Leeuw(String animalName, String animalSex, String animalFood, String animalSound, String owner, String food, String breed, String animalHouse, String lastFeeded, String countryOfOrigin, String lionStripes) {
        super(animalName, animalSex, animalFood, animalSound, owner, food, breed, animalHouse, lastFeeded, countryOfOrigin);
        this.lionStripes = lionStripes;
    }

}
