package nl.novi.javaprogrammeren.overerving;
import nl.novi.javaprogrammeren.overerving.Leeuw;

public class Tiger extends WildAnimals {
    String tigerStripese;

    public Tiger(String animalName, String animalSex, String animalFood, String animalSound, String owner, String food, String breed, String animalHouse, String lastFeeded, String countryOfOrigin, String tigerStripese) {
        super(animalName, animalSex, animalFood, animalSound, owner, food, breed, animalHouse, lastFeeded, countryOfOrigin);
        this.tigerStripese = tigerStripese;
    }
}
