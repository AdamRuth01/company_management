package org.example;

public class Developer extends Employee{

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public Developer(String name, String programmingLanguage) {
        super();
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String getSound(){
        return "WOOP woop!";
    }



}
