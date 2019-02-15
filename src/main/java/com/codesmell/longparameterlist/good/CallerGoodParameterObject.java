package com.codesmell.longparameterlist.good;

//https://sourcemaking.com/refactoring/smells/long-parameter-list
//https://stackoverflow.com/questions/439574/whats-the-best-way-to-refactor-a-method-that-has-too-many-6-parameters
public class CallerGoodParameterObject {

    private static void printPersonDetails(FullName fullName, Address address) {
        System.out.format("Person named %s %s %s %s lives at %s %s %s %s.",
                fullName.getSalutation(), fullName.getFirstName(),
                fullName.getMiddleName(), fullName.getLastName(),
                address.getZipCode(), address.getStreetAddress(),
                address.getCity(), address.getCountry());
    }

    public static void main(String[] args) {
        printPersonDetails(
                new FullName("Doe", "Jane", "Mary", "Mrs."),
                new Address("1234567", "str. Unirii", "Bucuresti", "Romania"));
    }
}

