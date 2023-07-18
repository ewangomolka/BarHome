import React from 'react';
import { Link } from 'react-router-dom';
import CocktailCard from './CocktailCard';
import './CocktailCard.css'

const CocktailList = ({cocktails}) => {

    const cocktailElements = cocktails.map((cocktail, index) => {
        const url = "/cocktail/" + cocktail.id
        return (
            <div className='cocktail-spacing'>
                <Link to={url}>
                <li key={index} className='cocktail-card'>
                    <div >
                        <CocktailCard cocktail={cocktail}/>
                    </div>
                </li>
                </Link>
            </div>
        )
    })

    return ( 
        <ul className='cocktail-list'>
            {cocktailElements}
        </ul>
     );
}
 
export default CocktailList;