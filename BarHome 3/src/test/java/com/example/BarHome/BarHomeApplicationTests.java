package com.example.BarHome;

import com.example.BarHome.Repositories.CocktailRepository;
import com.example.BarHome.Repositories.IngredientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BarHomeApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	CocktailRepository cocktailRepository;

	@Autowired
	IngredientRepository ingredientRepository;

	@Test
	public void createCocktail(){
		Cocktail cocktail = new Cocktail("image-url", "Cuba Libre", "Build", "Add all ingredients over ice and garnish with lime wedge", false);
		cocktailRepository.save(cocktail);
		Ingredient ingredient = new Ingredient("Rum", "50ml");
		Ingredient ingredient2 = new Ingredient("Cola", "150ml");
		ingredientRepository.save(ingredient);
		ingredientRepository.save(ingredient2);
		cocktail.addIngredient(ingredient);
		cocktail.addIngredient(ingredient2);
		cocktailRepository.save(cocktail);
	}

}
