import React from 'react';
import drinkAware from '../logos/drinkaware.jpeg';
import './Footer.css';

const Footer = () => {



    return ( 
        <div className='footer'>
            <img className='footer-img' src={drinkAware} alt={'Drink Responsibly'}/>
        </div>
     );
}
 
export default Footer;