import React from 'react';
import './Home.css';
import logo from '../logos/Bar_home2.png';

const Home = () => {



    return (
        <div className='home-body'>
        <div className='blurb'>
            <div>
                <img className='logo' src={logo}/>
            </div>
            <div className='detail'>
                <b>Want a cocktail?</b>
                <p>
                    With our app, you can create great tasting cocktails with the ingredients you already have at home!
                </p>
                <p>
                    Simply select the drinks and spirits you have in our search filter, and our app will provide you with a list of cocktails you can make using your ingredients.
                </p>
            </div>
        </div>
        </div>
     );
}
 
export default Home;