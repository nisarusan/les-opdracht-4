package nl.novi.javaprogrammeren.overerving;


public class Leeuw extends WildAnimals {
    String lionCubs;

    public Leeuw(String animalName, String animalSex, String animalFood, String animalSound, String owner, String food, String breed, String animalHouse, String lastFeeded, String countryOfOrigin, String lionCubs) {
        super(animalName, animalSex, animalFood, animalSound, owner, food, breed, animalHouse, lastFeeded, countryOfOrigin);
        this.lionCubs = lionCubs;
    }

}
