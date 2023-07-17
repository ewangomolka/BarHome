import React, { useState, useEffect } from 'react';
import CocktailList from '../components/CocktailList';
import SavedCocktails from '../components/SavedCocktails';
import NavBar from '../components/NavBar';
import Request from '../helpers/request';
import Home from '../components/Home';
import Info from '../components/Info';
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';

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
            <Router>
            <NavBar/>
                <Routes>
                    <Route path="/" element={<Home/>}/>
                    <Route path="/cocktails" element={<CocktailList cocktails={cocktails} ingredients={ingredients}/>}/>
                    <Route path="/saved" element={<SavedCocktails cocktails={cocktails}/>}/>
                    <Route path="/info" element={<Info/>}/>
                </Routes>
            </Router>
        </div>
     );
}
 
export default MainContainer;