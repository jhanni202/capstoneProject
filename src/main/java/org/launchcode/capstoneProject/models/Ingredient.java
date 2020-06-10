package org.launchcode.capstoneProject.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Ingredient extends AbstractEntity {

    @ManyToOne
    private User user;

    @NotNull
    private String name;

    public Ingredient(){};

    public Ingredient (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
