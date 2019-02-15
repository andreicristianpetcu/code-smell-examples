package com.codesmell.longparameterlist.good;

class FullName {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String salutation;

    FullName(String lastName, String firstName, String middleName, String salutation) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.salutation = salutation;
    }

    String getLastName() {
        return lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getMiddleName() {
        return middleName;
    }

    String getSalutation() {
        return salutation;
    }
}
