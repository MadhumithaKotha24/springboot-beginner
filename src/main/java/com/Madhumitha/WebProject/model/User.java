package com.Madhumitha.WebProject.model;

public class User {

    int id;
    String name, gender, image;

    public User() {

    }

    public User(String name, String gender, String image, int id) {
        this.name = name;
        this.gender = gender;
        this.image = image;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return this.image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}