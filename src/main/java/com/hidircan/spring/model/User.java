package com.hidircan.spring.model;

public class User {
    private int index;
    private String name;
    private long id;

    public User() {}

    public User(int index, String name,long id ) {
        this.index = index;
        this.name = name;
        this.id = id;
    }

    public int getIndex() { return index; }
    public void setIndex(int index) { this.index = index; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public long getId() { return id; }
    public void setId(Long id) { this.id = id; }

}
