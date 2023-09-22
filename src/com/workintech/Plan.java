package com.workintech;

public enum Plan {
    STANDART("STANDART" , 2000) ,
    CHEAP("CHEAP" , 1500),
    PREMIUM("PREMIUM" , 3000),
    ;

    private  String name;

    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;

    }
}
