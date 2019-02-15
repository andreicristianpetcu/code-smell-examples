package com.codesmell.primitiveobsession.good;

//http://curiousjava.blogspot.com/2012/09/primitive-obsession-with-example.html
//https://softwareengineering.stackexchange.com/questions/385078/is-using-the-pair-class-a-sign-of-primitive-obsession-code-smell
public class CallerExtractClass {

    public static void main(String []args) {

        City[] cityPopulations = {
                new City(13000000, "London"),
                new City(21903623, "New York"),
                new City(12570000, "Tokyo"),
                new City(1932763, "Stockholm"),
                new City(1605602, "Barcelona"),
                new City(4119190, "Sydney"),
        };

        for (City city : cityPopulations) {
            System.out.println(city.population);
        }
    }
}

class City {
    final int population;
    final String name;

    City(int population, String name) {
        this.population = population;
        this.name = name;
    }
}