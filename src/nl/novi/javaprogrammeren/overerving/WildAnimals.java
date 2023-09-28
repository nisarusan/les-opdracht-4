package nl.novi.javaprogrammeren.overerving;

public abstract class WildAnimals extends DomesticAnimal {

    private String animalHouse;
    private String lastFeeded;
    private String countryOfOrigin;

    public WildAnimals(String animalName, String animalSex, String animalFood, String animalSound, String owner, String food, String breed, String animalHouse, String lastFeeded, String countryOfOrigin) {
        super(animalName, animalSex, animalFood, animalSound, owner, food, breed);
        this.animalHouse = animalHouse;
        this.lastFeeded = lastFeeded;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getAnimalHouse() {
        return animalHouse;
    }

    public void setAnimalHouse(String animalHouse) {
        this.animalHouse = animalHouse;
    }

    public String getLastFeeded() {
        return lastFeeded;
    }

    public void setLastFeeded(String lastFeeded) {
        this.lastFeeded = lastFeeded;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    // Wilde dieren:
    // naam van het hok
    // weekdag laatst gevoed
    // land van herkomst
}
