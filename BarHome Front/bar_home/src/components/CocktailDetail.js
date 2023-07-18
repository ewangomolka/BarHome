import React from 'react';

const CocktailDetail = ({cocktail}) => {

    const cocktailIngredients = cocktail.ingredients.map((ingredient, index) => {
        return <li key={index}>{ingredient.name} {ingredient.quantity}</li>
    })

    return ( 
        <div>
        <img src={cocktail.image}/>
        <p>{cocktail.name}</p>
        <ul>{cocktailIngredients}</ul>
        <p>{cocktail.method}</p>
        </div>
     );
}
 
export default CocktailDetail;