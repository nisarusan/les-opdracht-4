package nl.novi.javaprogrammeren.overerving;

public class Cat extends DomesticAnimal {
    private boolean isIndoor;

    public Cat(String animalName, String animalSex, String animalFood, String animalSound, String owner, String food, String breed, boolean isIndoor) {
        super(animalName, animalSex, animalFood, animalSound, owner, food, breed);
        this.isIndoor = isIndoor;
    }
}
