package com.test;

import java.util.LinkedHashMap;

public class User {
    private String firstName;
    private String lastName;
    private String language;
    private LinkedHashMap<String,String> languages;

    public User(){
        languages = new LinkedHashMap<>();
        languages.put("Tr","Turkish");
        languages.put("En","English");
        languages.put("De","German");
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public LinkedHashMap<String, String> getLanguages() {
        return languages;
    }


}
