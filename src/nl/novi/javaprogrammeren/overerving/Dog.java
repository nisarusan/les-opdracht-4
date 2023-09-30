package nl.novi.javaprogrammeren.overerving;

public class Dog extends DomesticAnimal {

    String favoriteFood;
    public Dog (String animalName, String animalSex, String animalFood, String animalSound, String owner, String food, String breed, String favoriteFood) {
        super(animalName, animalSex, animalFood, animalSound, owner, food, breed);
        this.favoriteFood = favoriteFood;
    }
    //    Van een Hond slaan we naam, naam van het baasje, favoriete voedselmerk, geslacht en soort op.

}
