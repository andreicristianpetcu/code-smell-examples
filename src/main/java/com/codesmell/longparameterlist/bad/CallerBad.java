package com.codesmell.longparameterlist.bad;

//https://www.javaworld.com/article/2074935/core-java/too-many-parameters-in-java-methods--part-2--parameters-object.html
public class CallerBad {

    @SuppressWarnings("SameParameterValue")
    private static void printPersonDetails(final String lastName, final String firstName,
                                           final String middleName, final String salutation,
                                           final String zipCode, final String streetAddress,
                                           final String city, final String country) {

        System.out.format("Person named %s %s %s %s lives at %s %s %s %s.",
                salutation, firstName, middleName, lastName,
                zipCode, streetAddress, city, country);
    }

    public static void main(String[] args) {
        printPersonDetails("Doe", "Jane", "Mary", "Mrs.",
                "1234567", "str. Unirii", "Bucuresti", "Romania");
    }
}
