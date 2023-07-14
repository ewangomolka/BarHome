package com.example.BarHome.Controllers;

import com.example.BarHome.Ingredient;
import com.example.BarHome.Repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IngredientController {

    @Autowired
    IngredientRepository ingredientRepository;

    @GetMapping(value="/ingredient")
    public ResponseEntity<List<Ingredient>> getAllIngredients(){
        return new ResponseEntity<>(ingredientRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/ingredient/{id}")
    public ResponseEntity getIngredient(@PathVariable Long id){
        return new ResponseEntity<>(ingredientRepository.findById(id), HttpStatus.OK);
    }
}
