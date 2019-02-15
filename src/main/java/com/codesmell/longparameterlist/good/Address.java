package com.codesmell.longparameterlist.good;

class Address {
    private final String zipCode;
    private final String streetAddress;
    private final String city;
    private final String country;

    Address(String zipCode, String streetAddress, String city, String country) {
        this.zipCode = zipCode;
        this.streetAddress = streetAddress;
        this.city = city;
        this.country = country;
    }

    String getZipCode() {
        return zipCode;
    }

    String getStreetAddress() {
        return streetAddress;
    }

    String getCity() {
        return city;
    }

    String getCountry() {
        return country;
    }
}
