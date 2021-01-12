package com.example.pokemonapp.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.pokemonapp.model.Pokemon;

@Database(entities = {Pokemon.class}, version = 1, exportSchema = false)
public abstract class PokemonDB extends RoomDatabase {
    public abstract PokeDao pokeDao();
}
