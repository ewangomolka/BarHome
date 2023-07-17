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
        Ingredient trplPineapple = new Ingredient("Pineapple Juice", "75ml");
        ingredientRepository.save(vodka);
        ingredientRepository.save(chambord);
        ingredientRepository.save(trplPineapple);
        Cocktail frenchMartini = new Cocktail("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9KveRIJ-saq8EAd7xuf7YuGcqzAn7priy8g&usqp=CAU",
                "French Martini", "Shaken", "Add all ingredients to a cocktail shaker with ice and shake vigorously. Strain into a coupe/martini glass and garnish with a raspberry.",
                false);
        frenchMartini.addIngredient(vodka);
        frenchMartini.addIngredient(chambord);
        frenchMartini.addIngredient(trplPineapple);
        cocktailRepository.save(frenchMartini);
        //French Martini
        Ingredient dblTequila = new Ingredient("Tequila", "50ml");
        Ingredient tripleSec = new Ingredient("Triple Sec", "25ml");
        Ingredient halfSugar = new Ingredient("Sugar Syrup", "12.5ml");
        Ingredient limeJuice = new Ingredient("Lime Juice", "25ml");
        ingredientRepository.save(dblTequila);
        ingredientRepository.save(tripleSec);
        ingredientRepository.save(halfSugar);
        ingredientRepository.save(limeJuice);
        Cocktail margarita = new Cocktail("https://image.essen-und-trinken.de/11856236/t/aW/v…64eeb4dc69a33d80405855b-margarita-jpg--21377-.jpg",
                "Margarita", "Shaken or Blended", "Add all ingredients to a cocktail shaker and shake vigorously (Optional add all ingredients to a belnder and mix). " +
                "strain/pour into a coupe/martini glass with a salt rim and garnish with a lime wedge.", false);
        margarita.addIngredient(dblTequila);
        margarita.addIngredient(tripleSec);
        margarita.addIngredient(halfSugar);
        margarita.addIngredient(limeJuice);
        cocktailRepository.save(margarita);
        //Margarita
        Ingredient dblRum = new Ingredient("Rum", "50ml");
        Ingredient sugarSyrup = new Ingredient("Sugar Syrup", "25ml");
        ingredientRepository.save(dblRum);
        ingredientRepository.save(sugarSyrup);
        Cocktail daquiri = new Cocktail("https://cocktailbart.de/wp-content/uploads/2021/06/Hemingway-Daiquiri.jpg",
                "Daquiri", "Shaken or Blended", "Add all ingredients to a cocktail shaker and shake vigorously (Optional add all ingredients to a blender and mix)." +
                " strain/pour into a coupe/martini glass and garnish with a lime wedge. Tip: Try adding fruit puree for a fruit flavoured Daquiri", false);
        daquiri.addIngredient(dblRum);
        daquiri.addIngredient(sugarSyrup);
        daquiri.addIngredient(limeJuice);
        cocktailRepository.save(daquiri);
        //Daquiri
        Ingredient halfVodka = new Ingredient("Vodka", "12.5ml");
        Ingredient halfGin = new Ingredient("Gin", "12.5ml");
        Ingredient halfRum = new Ingredient("Rum", "12.5ml");
        Ingredient halfTequila = new Ingredient("Tequila", "12.5ml");
        Ingredient halfTripleSec = new Ingredient("Triple Sec", "12.5ml");
        Ingredient halfLemonJuice = new Ingredient("Lemon Juice", "12.5ml");
        Ingredient cola = new Ingredient("Cola", "To finish");
        ingredientRepository.save(halfVodka);
        ingredientRepository.save(halfGin);
        ingredientRepository.save(halfRum);
        ingredientRepository.save(halfTequila);
        ingredientRepository.save(halfTripleSec);
        ingredientRepository.save(halfLemonJuice);
        ingredientRepository.save(cola);
        Cocktail longIsland = new Cocktail("https://assets.website-files.com/594bcc8db100b47a2a8c2e38/5c37204df7e3840c445c3446_long-island.jpg",
                "Long Island Iced Tea", "Shaken",
                "Add all ingredients (except the cola) with ice and shake vigorously. Strain into a tall glass over ice and fill to the top with Cola. " +
                        "Garnish with a lemon slice.", false);
        longIsland.addIngredient(halfVodka);
        longIsland.addIngredient(halfGin);
        longIsland.addIngredient(halfRum);
        longIsland.addIngredient(halfTequila);
        longIsland.addIngredient(halfTripleSec);
        longIsland.addIngredient(halfLemonJuice);
        longIsland.addIngredient(halfSugar);
        longIsland.addIngredient(cola);
        cocktailRepository.save(longIsland);
        // Long Island Iced Tea
        Ingredient dblCranberryJuice = new Ingredient("Cranberry Juice", "50ml");
        ingredientRepository.save(dblCranberryJuice);
        Cocktail cosmo = new Cocktail("https://alwaystheholidays.com/wp-content/uploads/2019/05/cosmopolitan-drink.jpg",
                "Cosmopolitan", "Shaken",
                "Add all ingredients to a cocktail shaker with ice and shake vigorously. Strain into a coupe/martini glass and garnish with an orange peel.",
                false);
        cosmo.addIngredient(vodka);
        cosmo.addIngredient(tripleSec);
        cosmo.addIngredient(limeJuice);
        cosmo.addIngredient(dblCranberryJuice);
        cocktailRepository.save(cosmo);
        // Cosmopolitan
        Ingredient coconutCream = new Ingredient("Coconut Cream", "25ml");
        ingredientRepository.save(coconutCream);
        Cocktail pinaColada = new Cocktail("https://vinepair.com/wp-content/uploads/2016/04/pina-colada-card.jpg",
                "Pina Colada", "Shaken or Blended", "Add all ingredients to a cocktail shaker and shake vigorously (Optional add all ingredients to a blender and mix). " +
                "Strain into a tall glass over ice (no ice if blended) and garnish with a pineapple wedge/leaf.", false);
        pinaColada.addIngredient(dblRum);
        pinaColada.addIngredient(trplPineapple);
        pinaColada.addIngredient(coconutCream);
        cocktailRepository.save(pinaColada);
        // Pina Colada
        Ingredient dblBourbon = new Ingredient("Bourbon Whiskey", "50ml");
        Ingredient bitters = new Ingredient("Angostura Bitters", "2 dashes");
        ingredientRepository.save(dblBourbon);
        ingredientRepository.save(bitters);
        Cocktail oldFashioned = new Cocktail("https://drinkoteket.com/wp-content/uploads/old-fashioned-640x640.jpg",
                "Old Fashioned", "Stirred", "Add all ingredients to a mixing glass with ice and stir for roughly 10 seconds. Strain over ice and garnish with orange peel.",
                false);
        oldFashioned.addIngredient(dblBourbon);
        oldFashioned.addIngredient(sugarSyrup);
        oldFashioned.addIngredient(bitters);
        cocktailRepository.save(oldFashioned);
        // Old Fashioned
        Ingredient swVermouth = new Ingredient("Sweet Vermouth", "25ml");
        ingredientRepository.save(swVermouth);
        Cocktail manhattan = new Cocktail("https://drinkoteket.com/wp-content/uploads/manhattan-1.jpg",
                "Manhattan", "Stirred", "Add all ingredients to a mixing glass with ice and stir for roughly 10 seconds. Strain over ice and garnish with a maraschino cherry.",
                false);
        manhattan.addIngredient(dblBourbon);
        manhattan.addIngredient(swVermouth);
        manhattan.addIngredient(bitters);
        cocktailRepository.save(manhattan);
        // Manhattan
        Ingredient peachSch = new Ingredient("Peach Schnapps", "25ml");
        Ingredient orangeJuice = new Ingredient("Orange Juice", "25ml");
        ingredientRepository.save(peachSch);
        ingredientRepository.save(orangeJuice);
        Cocktail sotb = new Cocktail("https://img.freepik.com/premium-photo/sex-beach-cocktail-glass-black_123827-9526.jpg",
                "Sex on the Beach", "Built", "Add all ingredients to a glass over ice. Garnish with a orange slice", false);
        sotb.addIngredient(vodka);
        sotb.addIngredient(peachSch);
        sotb.addIngredient(dblCranberryJuice);
        sotb.addIngredient(orangeJuice);
        cocktailRepository.save(sotb);
        // Sex on the Beach
        Ingredient trpleCranberryJuice = new Ingredient("Cranberry Juice", "75ml");
        ingredientRepository.save(trpleCranberryJuice);
        Cocktail wooWoo = new Cocktail("https://www.2foodtrippers.com/wp-content/uploads/2023/03/Woo-Woo-Cocktail-from-Above-720x720.jpg",
                "Woo Woo", "Built", "Add all ingredients to a glass over ice. Garnish with a lime slice", false);
        wooWoo.addIngredient(vodka);
        wooWoo.addIngredient(peachSch);
        wooWoo.addIngredient(trpleCranberryJuice);
        cocktailRepository.save(wooWoo);
        // Woo Woo
        Ingredient dblVodka = new Ingredient("Vodka", "50ml");
        Ingredient tomatoJuice = new Ingredient("Tomato Juice", "100ml");
        Ingredient tobascoSauce = new Ingredient("Tobasco Sauce", "to taste");
        Ingredient worcester = new Ingredient("Worcester Sauce", "4 dashes");
        Ingredient saltNPepper = new Ingredient("Salt and Pepper", "to taste");
        ingredientRepository.save(dblVodka);
        ingredientRepository.save(tomatoJuice);
        ingredientRepository.save(tobascoSauce);
        ingredientRepository.save(worcester);
        ingredientRepository.save(saltNPepper);
        Cocktail bloodyMary = new Cocktail("https://cdn.diffords.com/contrib/stock-images/2021/03/60537cdedaa5e.jpg",
                "Bloody Mary", "Shaken", "Add all ingredients to a cocktail shaker with ice and shake gently. Strain over ice and garnish with a celery stalk." +
                "Tip: mark your spice tolerance out of 10 and use that many dashes of tobasco sauce.", false);
        bloodyMary.addIngredient(dblVodka);
        bloodyMary.addIngredient(tomatoJuice);
        bloodyMary.addIngredient(worcester);
        bloodyMary.addIngredient(saltNPepper);
        bloodyMary.addIngredient(tobascoSauce);
        cocktailRepository.save(bloodyMary);
        // Bloody Mary
        Ingredient dblWhiskey = new Ingredient("Whiskey", "50ml");
        Ingredient eggWhite = new Ingredient("Egg White", "1");
        Ingredient lemonJuice = new Ingredient("Lemon Juice", "25ml");
        ingredientRepository.save(dblWhiskey);
        ingredientRepository.save(eggWhite);
        ingredientRepository.save(lemonJuice);
        Cocktail whiskeySour = new Cocktail("https://cdn.diffords.com/contrib/stock-images/2021/03/60537cdedaa5e.jpg",
                "Whiskey Sour", "Shaken", "Add all ingredients to a shaker without ice and shake vigorously, (remove egg white to make the drink vegan.) then add ice and repeat. " +
                "Strain over ice and garnish with a lemon peel and a dash of Angostura bitters.", false);
        whiskeySour.addIngredient(dblWhiskey);
        whiskeySour.addIngredient(eggWhite);
        whiskeySour.addIngredient(sugarSyrup);
        whiskeySour.addIngredient(lemonJuice);
        cocktailRepository.save(whiskeySour);
        // Whiskey Sour
        Ingredient grenadine = new Ingredient("Grenadine", "25ml");
        Ingredient cherryBrandy = new Ingredient("Cherry Brandy", "25ml");
        Ingredient gin = new Ingredient("Gin", "25ml");
        Ingredient dblPineappleJuice = new Ingredient("Pineapple Juice", "50ml");
        ingredientRepository.save(grenadine);
        ingredientRepository.save(cherryBrandy);
        ingredientRepository.save(gin);
        ingredientRepository.save(dblPineappleJuice);
        Cocktail singaporeSling = new Cocktail("url",
                "Singapore Sling", "Shaken", "Add all ingredients to a cocktail shaker and shake vigorously. " +
                "Strain into a tall glass over ice and garnish with a pineapple wedge/leaf and a maraschino cherry.", false);
        singaporeSling.addIngredient(grenadine);
        singaporeSling.addIngredient(gin);
        singaporeSling.addIngredient(cherryBrandy);
        singaporeSling.addIngredient(dblPineappleJuice);
        singaporeSling.addIngredient(lemonJuice);
        cocktailRepository.save(singaporeSling);
        // Singapore Sling
        Ingredient dblGin = new Ingredient("Gin", "50ml");
        Ingredient sodaWater = new Ingredient("Soda Water", "to finish");
        ingredientRepository.save(dblGin);
        ingredientRepository.save(sodaWater);
        Cocktail tomCollins = new Cocktail("url",
                "Tom Collins", "Shaken", "Add all ingredients (except the soda water) to a cocktail shaker and shake vigorously. " +
                "Strain over a tall glass with ice and top up with the soda water. Garnish with a lemon slice.", false);
        tomCollins.addIngredient(dblGin);
        tomCollins.addIngredient(sugarSyrup);
        tomCollins.addIngredient(lemonJuice);
        tomCollins.addIngredient(sodaWater);
        cocktailRepository.save(tomCollins);
        // Tom Collins
        Ingredient gingerBeer = new Ingredient("Ginger Beer", "to finish");
        ingredientRepository.save(gingerBeer);
        Cocktail moscowMule = new Cocktail("url",
                "Moscow Mule", "Built", "Add all ingredients to a tall glass and top up with ice (crushed ice if you have it). " +
                "Finish by topping up with the ginger beer and garnish with a lime wedge. Tip: Try crushing some fruit in the glass to create a flavoured mule.",
                false);
        moscowMule.addIngredient(dblVodka);
        moscowMule.addIngredient(limeJuice);
        moscowMule.addIngredient(sugarSyrup);
        moscowMule.addIngredient(gingerBeer);
        cocktailRepository.save(moscowMule);
        // Moscow Mule
        Ingredient dblDisaronno = new Ingredient("Disaronno", "50ml");
        ingredientRepository.save(dblDisaronno);
        Cocktail disaronnoSour = new Cocktail("url",
                "Disaronno Sour", "Shaken", "Add all ingredients to a shaker without ice and shake vigorously, (remove egg white to make the drink vegan.) then add ice and repeat. " +
                "Strain over ice and garnish with a lemon peel and a dash of Angostura bitters.", false);
        disaronnoSour.addIngredient(dblDisaronno);
        disaronnoSour.addIngredient(sugarSyrup);
        disaronnoSour.addIngredient(lemonJuice);
        disaronnoSour.addIngredient(eggWhite);
        cocktailRepository.save(disaronnoSour);
        // Disaronno Sour
        Cocktail gimlet = new Cocktail("url",
                "Gimlet", "Shaken", "Add all ingredients to a cocktail shaker and shake vigorously." +
                "strain/pour into a coupe/martini glass and garnish with a lime wedge. Tip: Try adding fruit puree for a fruit flavoured Gimlet.", false);
        gimlet.addIngredient(dblGin);
        gimlet.addIngredient(sugarSyrup);
        gimlet.addIngredient(limeJuice);
        cocktailRepository.save(gimlet);
        // Gimlet
        Ingredient mint = new Ingredient("Mint Leaves", "6-8 leaves");
        ingredientRepository.save(mint);
        Cocktail mojito = new Cocktail("url",
                "Mojito", "Built", "Add all ingredients to a tall glass, add in ice (crushed ice preferably) and mix. " +
                "Top up with the soda water and garnish with a lime wedge and mint sprig.", false);
        mojito.addIngredient(dblRum);
        mojito.addIngredient(sugarSyrup);
        mojito.addIngredient(limeJuice);
        mojito.addIngredient(mint);
        mojito.addIngredient(sodaWater);
        cocktailRepository.save(mojito);
        // Mojito
        Cocktail mintJulip = new Cocktail("url",
                "Mint Julip", "Built", "Add all ingredients to a glass, add in ice (crushed ice preferably) and mix. " +
                "Top up with the soda water and garnish with a lime wedge and mint sprig.", false);
        mintJulip.addIngredient(dblBourbon);
        mintJulip.addIngredient(sugarSyrup);
        mintJulip.addIngredient(limeJuice);
        mintJulip.addIngredient(mint);
        cocktailRepository.save(mintJulip);
        // Mint Julip
        Ingredient dryVermouth = new Ingredient("Dry Vermouth", "5ml");
        ingredientRepository.save(dryVermouth);
        Cocktail vodkaMartini = new Cocktail("url",
                "Vodka Martini", "Stirred", "Add all ingredients to a mixing glass with ice and stir for roughly 10 seconds. " +
                "Strain over ice and garnish with a lemon twist or green olives.", false);
        vodkaMartini.addIngredient(dblVodka);
        vodkaMartini.addIngredient(dryVermouth);
        cocktailRepository.save(vodkaMartini);
        // Vodka Martini
        Cocktail ginMartini = new Cocktail("url",
                "Gin Martini", "Stirred", "Add all ingredients to a mixing glass with ice and stir for roughly 10 seconds." +
                " Strain over ice and garnish with a lemon twist or green olives.", false);
        ginMartini.addIngredient(dblGin);
        ginMartini.addIngredient(dryVermouth);
        cocktailRepository.save(ginMartini);
        // Gin Martini
        Cocktail vesperMartini = new Cocktail("url",
                "Vesper Martini", "Stirred", "Add all ingredients to a mixing glass with ice and stir for roughly 10 seconds. " +
                "Strain over ice and garnish with a lemon twist.", false);
        vesperMartini.addIngredient(vodka);
        vesperMartini.addIngredient(gin);
        vesperMartini.addIngredient(dryVermouth);
        cocktailRepository.save(vesperMartini);
        // Vesper Martini
    }
}
