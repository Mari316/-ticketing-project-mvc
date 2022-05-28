package com.cydeo.enums;

public enum Gender {
    MALE("Male"), FEMALE("Female");// one way to building enum, here we can change value

    private final String value;

    Gender (String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
