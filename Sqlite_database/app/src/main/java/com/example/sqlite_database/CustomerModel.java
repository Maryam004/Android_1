package com.example.sqlite_database;

public class CustomerModel {
    private String name;

    public CustomerModel(int id,String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
        this.id = id;
    }

    private int age;
    private boolean isActive;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                ", id=" + id +
                '}';
    }
}
