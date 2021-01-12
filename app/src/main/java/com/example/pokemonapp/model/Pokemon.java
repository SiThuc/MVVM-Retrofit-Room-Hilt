package com.example.pokemonapp.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "favorite_table")
public class Pokemon {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String url;

    public Pokemon(int id, String url) {
        this.id = id;
        this.url = url;
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
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
