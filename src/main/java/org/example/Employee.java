package org.example;

public class Employee extends Person {

    public Employee(){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        String firstCharacter = name.substring(0,1).toUpperCase();
        String rest = name.substring(1);
        this.name = firstCharacter + rest;
    }


    public String getSound(){
        return "Aaow!";
    }

    @Override
    public String eatFood() {
        return "Nom Nom Nom";
    }
}
