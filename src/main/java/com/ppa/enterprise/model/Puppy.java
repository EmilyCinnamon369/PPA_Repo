package com.ppa.enterprise.model;

import java.util.Objects;

public class Puppy {

    private int id;

    private String name;

    private String color;

    private String breed;

    private String gender;


    public Puppy(){

    }

    public Puppy(int id, String name, String color, String breed, String gender) {
        this.id = id;
        setName(name);
        setColor(color);
        setBreed(breed);
        setGender(gender);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name != null ? name.trim() : null;
    }

    public void setColor(String color) {
        this.color = color != null ? color.trim() : null;
    }

    public void setBreed(String breed) {
        this.breed = breed != null ? breed.trim() : null;
    }

    public void setGender(String gender) {
        this.gender = gender != null ? gender.trim() : null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Puppy other)) return false;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Puppy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
