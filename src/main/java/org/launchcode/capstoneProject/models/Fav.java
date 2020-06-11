package org.launchcode.capstoneProject.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Fav extends AbstractEntity{

    @NotNull
    private int user_id;

    @NotNull
    private String name;

    @NotNull
    private String link;

    public Fav(){};

    public Fav(String name,String link){
        this.name = name;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return name;
    }
}
