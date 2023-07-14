package com.example.BarHome.Controllers;

import com.example.BarHome.Cocktail;
import com.example.BarHome.Repositories.CocktailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CocktailController {

    @Autowired
    CocktailRepository cocktailRepository;

    @GetMapping(value="/cocktails")
    public ResponseEntity<List<Cocktail>> getAllCocktails(){
        return new ResponseEntity<>(cocktailRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/cocktails/{id}")
    public ResponseEntity getCocktail(@PathVariable Long id){
        return new ResponseEntity<>(cocktailRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value="/cocktails")
    public ResponseEntity<Cocktail> postCocktail(@RequestBody Cocktail cocktail){
        cocktailRepository.save(cocktail);
        return new ResponseEntity<>(cocktail, HttpStatus.CREATED);
    }
}
