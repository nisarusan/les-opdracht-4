package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.*;


public class AnimalMain {
    public static void main(String[] args) {
        Cat bert = new Cat("Bert", "male", "wortels", "prrrrrrr", "robin", "caviaar", "siamees", false);
        Cat bertha = new Cat("Bert", "female", "wortels", "prrrrrrr", "robin", "caviaar", "siamees", false);

        bert.animalMakeSound();
        bertha.animalMakeSound();

        Wolf GreyWolve = new Wolf("Grey Wolve", "Male", "Animals", "Woof WOOOF", "None", "Animal", "Grey Wolve", "None", "Not feeded", "Turkey", "Caesar");
        Leeuw Simba = new Leeuw("Simba", "Male", "Animals", "GRRRRRRRRR", "None", "deer", "Lion", "None", "Not feeded", "Africa", "Caesar");
        GreyWolve.animalMakeSound();
        Simba.animalMakeSound();
        Tiger redTiger = new Tiger("redTiger", "Male", "Small animals", "GRRRRR BRR", "Jungles", "None", "Liger", "Zoo", "Yesterday", "Africa", "4");

        String[] tigerPropList = {redTiger.getAnimalName(), redTiger.getAnimalFood(), redTiger.getAnimalHouse(), redTiger.getCountryOfOrigin()};
        for (int i = 0; i < tigerPropList.length - 1; i++) {
            System.out.println(tigerPropList[i]);
        }

        redTiger.getAnimalFood();
        String[] getsList = {Simba.getAnimalFood(), Simba.getSpecies(), Simba.getAnimalFood(), Simba.getCountryOfOrigin(), Simba.getSpecies()};
        for (int i = 0; i < getsList.length - 1; i++) {
            System.out.println(getsList[i]);
        }


    }


    /*
    Het is traditie om overerving uit te leggen met behulp van dieren. Hier ontkomen jullie dus ook niet aan.

    Opdracht
    Bekijk de beschrijving van onderstaande dieren. Bedenk wat je in de superklasse kan zetten. De subklassen hoef
    je nog niet te maken.

    Van een Leeuw slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op en de hoeveelheid kinderen.

    Van een Tijger slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op. Ook willen we het aantal strepen weten.

    Van een Hond slaan we naam, naam van het baasje, favoriete voedselmerk, geslacht en soort op.

    Van een Kat slaan we de naam, naam van het baasje, favoriete voedsel merk, geslacht en soort op. Ook willen we weten
    of het een binnen of buitenkat is.

    Van een Wolf slaan we de naam, naam van het hok, geslacht, weekdag dat die voor het laatste gevoed is en land van
    herkomst op. Ook willen we de naam van de roedel weten.

    Alle dieren moeten kunnen bewegen. Dit moet als methode toegevoegd worden. Wanneer een dier beweegt print je in
    de console dat deze 0.25 meter is verplaatst.

    Alle dieren moeten ook een maak-geluid-methode hebben waarmee je het geluid van de dieren afdrukt naar de console.

    Alle dieren slapen 8 uur per dag. Maak een methode slapen en print dit uit wanneer de methode wordt aangeroepen.

    Alle dieren eten. Maak een methode die een String ontvangt en print dan uit wat het dier eet.

    Alles staat hier in het Nederlands beschreven. Schrijf je klassen-, variabele en methodenamen in het Engels.

     */

}
