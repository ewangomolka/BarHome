package com.example.BarHome.Components;

import com.example.BarHome.Cocktail;
import com.example.BarHome.Ingredient;
import com.example.BarHome.Repositories.CocktailRepository;
import com.example.BarHome.Repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CocktailRepository cocktailRepository;

    @Autowired
    IngredientRepository ingredientRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        Ingredient vodka = new Ingredient("Vodka", "25ml");
        Ingredient chambord = new Ingredient("Chambord", "25ml");
        Ingredient pineapple = new Ingredient("Pineapple Juice", "75ml");
        ingredientRepository.save(vodka);
        ingredientRepository.save(chambord);
        ingredientRepository.save(pineapple);
        Cocktail frenchMartini = new Cocktail("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9KveRIJ-saq8EAd7xuf7YuGcqzAn7priy8g&usqp=CAU",
                "French Martini", "Shaken", "Add all ingredients to a cocktail shaker with ice and shake vigorously. Strain into a coupe/martini glass and garnish with a raspberry.",
                false);
        frenchMartini.addIngredient(vodka);
        frenchMartini.addIngredient(chambord);
        frenchMartini.addIngredient(pineapple);
        cocktailRepository.save(frenchMartini);
        //French Martini
        Ingredient tequila2 = new Ingredient("Tequila", "50ml");
        Ingredient tripleSec = new Ingredient("Triple Sec", "25ml");
        Ingredient halfSugar = new Ingredient("Sugar Syrup", "12.5ml");
        Ingredient limeJuice = new Ingredient("Lime Juice", "25ml");
        ingredientRepository.save(tequila2);
        ingredientRepository.save(tripleSec);
        ingredientRepository.save(halfSugar);
        ingredientRepository.save(limeJuice);
        Cocktail margarita = new Cocktail("https://image.essen-und-trinken.de/11856236/t/aW/v…64eeb4dc69a33d80405855b-margarita-jpg--21377-.jpg",
                "Margarita", "Shaken or Blended", "Add all ingredients to a cocktail shaker and shake vigorously (Optional add all ingredients to a belnder and mix). " +
                "strain/pour into a coupe/martini glass with a salt rim and garnish with a lime wedge.", false);
        margarita.addIngredient(tequila2);
        margarita.addIngredient(tripleSec);
        margarita.addIngredient(halfSugar);
        margarita.addIngredient(limeJuice);
        cocktailRepository.save(margarita);
        //Margarita
        Ingredient whiteRum = new Ingredient("White Rum", "50ml");
        Ingredient sugarSyrup = new Ingredient("Sugar Syrup", "25ml");
        Ingredient strawbPuree = new Ingredient("Strawberry Puree", "50ml");
        ingredientRepository.save(whiteRum);
        ingredientRepository.save(sugarSyrup);
        ingredientRepository.save(strawbPuree);
        Cocktail strawbDaquiri = new Cocktail("https://www.moodymixologist.com/wp-content/uploads…Daiquiri-Cocktail-for-valentines-days-7449596.jpg",
                "Strawberry Daquiri", "Shaken or Blended", "Add all ingredients to a cocktail shaker and shake vigorously (Optional add all ingredients to a belnder and mix)." +
                " strain/pour into a coupe/martini glass and garnish with a strawberry or a lime wedge.", false);
        strawbDaquiri.addIngredient(whiteRum);
        strawbDaquiri.addIngredient(strawbPuree);
        strawbDaquiri.addIngredient(sugarSyrup);
        strawbDaquiri.addIngredient(limeJuice);
        cocktailRepository.save(strawbDaquiri);
        //Strawberry Daquiri
    }
}
