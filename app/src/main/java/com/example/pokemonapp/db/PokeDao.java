package com.example.pokemonapp.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.pokemonapp.model.Pokemon;

import java.util.List;

@Dao
public interface PokeDao {
    @Insert
    void insertPokemon(Pokemon pokemon);

    @Query("Delete from favorite_table where name= :pokemonName")
    void deletePokemon(String pokemonName);

    @Query("delete from favorite_table")
    void deleteAll();

    @Query("Select * from favorite_table")
    LiveData<List<Pokemon>> getFavoritePokemons();
}
