package org.launchcode.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Category {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

//    represents the list of all items in a given category
//Each one category will have many cheeses, but each cheese can have only one category
    @OneToMany
    @JoinColumn(name = "category_id")//tells Hibernate to use the category_id column of the cheese table to determine which cheese belong to a given category.
    private List<Cheese> cheeses = new ArrayList<>();

    public Category() { }

    public Category(String name) {
        this.name = name;
    }

public int getId() {
    return id;
        }
public String getName() {
        return name;
}

    public void setName(String name) {
        this.name = name;
    }

public List<Cheese> getCheeses() {
    return cheeses;
}
}