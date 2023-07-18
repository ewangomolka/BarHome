import React from 'react';
import { Link } from 'react-router-dom';

const Cocktail = ({cocktail}) => {


    return ( 
        <div>
            {/* <img src={cocktail.image}/> */}
            <p>{cocktail.name}</p>
        </div>
     );
}
 
export default Cocktail;