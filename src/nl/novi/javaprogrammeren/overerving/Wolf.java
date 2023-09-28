package nl.novi.javaprogrammeren.overerving;

public class Wolf extends WildAnimals {
    String wolfPack;

    public Wolf(String animalName, String animalSex, String animalFood, String animalSound, String owner, String food, String breed, String animalHouse, String lastFeeded, String countryOfOrigin, String wolfPack) {
        super(animalName, animalSex, animalFood, animalSound, owner, food, breed, animalHouse, lastFeeded, countryOfOrigin);
        this.wolfPack = wolfPack;
    }

}
