package com.example.techbuild;

public class oop_objects {
    int number, square;
    String objects,company,address;

    public oop_objects(int number, String objects, String company, String address, int square) {
        this.number = number;
        this.square = square;
        this.objects = objects;
        this.company = company;
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public int getSquare() {
        return square;
    }

    public String getObjects() {
        return objects;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void setObjects(String objects) {
        this.objects = objects;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
