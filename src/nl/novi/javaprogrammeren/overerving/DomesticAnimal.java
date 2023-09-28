package nl.novi.javaprogrammeren.overerving;

public abstract class DomesticAnimal extends Animal {
    private String owner;
    private String food;
    private String breed;

    public DomesticAnimal(String animalName, String animalSex, String animalFood, String animalSound, String owner, String food, String breed) {
        super(animalName, animalSex, animalFood, animalSound);
        this.owner = owner;
        this.food = food;
        this.breed = breed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSpecies() {
        return breed;
    }

    public void setSpecies(String species) {
        this.breed = species;
    }
}
