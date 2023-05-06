package com.example.houserentappproject;

public class House1 {

    String name, number, type, rent, city;

    public House1() {
    }

    public House1(String name, String number, String type, String rent, String city) {
        this.name = name;
        this.number = number;
        this.type = type;
        this.rent = rent;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
