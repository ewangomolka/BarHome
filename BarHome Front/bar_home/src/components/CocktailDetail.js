import React, {useState} from 'react';
import './CocktailDetail.css';

const CocktailDetail = ({cocktail}) => {

    const [showIngredients, setShowIngredients] = useState(true)

    const cocktailIngredients = cocktail.ingredients.map((ingredient, index) => {
        return <li key={index}><p>{ingredient.name}:</p><p>{ingredient.quantity}</p></li>
    })

    const showCocktailIngredients = () => {
        setShowIngredients(!showIngredients)
    }

    const handleIngredients = () => {
        showCocktailIngredients()
    }

    return ( 
        <div className='page-container'>
            <div className='cocktail-container'>
                <div className='cocktail-title'>
                    <p>{cocktail.name}</p>
                </div>
                    <p>{cocktail.type}</p>
                    <img className='image' src={cocktail.image}/>
                <div className='buttons'>
                    {showIngredients ? <button onClick={handleIngredients}>Method</button> : 
                    <button onClick={handleIngredients}>Ingredients</button>}
                </div>
                <div className='card' id='card'>
                    { showIngredients ? <div className='cocktail-ingredients'>
                        <ul>{cocktailIngredients}</ul>
                    </div> : <div className='cocktail-method'>
                        <p>{cocktail.method}</p>
                    </div>}
                </div>
            </div>
        </div>
     );
}
 
export default CocktailDetail;