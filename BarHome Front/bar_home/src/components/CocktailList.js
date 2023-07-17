import React from 'react';

const CocktailList = ({cocktails, ingredients}) => {

    {/* for the purposes of testing */}
    const cocktailListItem = cocktails.map((cocktail, index) => {
        console.log(cocktails);
        return <li key={index}>{cocktail.name}</li>
    })

    return ( 
        <ul>
        {cocktailListItem}
        </ul>
     );
}
 
export default CocktailList;