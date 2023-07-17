import React, { useState, useEffect } from 'react';
import CocktailList from '../components/CocktailList';
import SavedCocktails from '../components/SavedCocktails';

const MainContainer = () => {

    const [cocktails, setCocktails] = useState([])
    const [ingredients, setIngredients] = useState ([])

    useEffect(() => {
        getCocktails();
        getIngredients();
    }, [])

    const getCocktails = () => {
        const request = new Request()
        request.get("/api/cocktails")
        .then((data) => {
            setCocktails(data)
        })
    }

    const getIngredients = () => {
        const request = new Request()
        request.get("/api/ingredient")
        .then((data) => {
            setIngredients(data)
        })
    }

    return ( 
        <div>
            <Route path="/" element={<Home/>}/>
            <Route path="/cocktails" element={<CocktailList cocktails={cocktails} ingredients={ingredients}/>}/>
            <Route path="/saved" element={<SavedCocktails cocktails={cocktails}/>}/>
            <Route path="/info" element={<Info/>}/>
        </div>
     );
}
 
export default MainContainer;