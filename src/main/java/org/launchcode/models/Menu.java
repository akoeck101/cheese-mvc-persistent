package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Menu {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @ManyToMany
    List<Cheese> cheeses;



    public Menu(String name) {
        this.name = name;
    }
    public Menu() { }

    public void addItem(Cheese item) {
        cheeses.add(item);
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

    public void setCheeses(List<Cheese> cheeses) {
        this.cheeses = cheeses;
    }
}
