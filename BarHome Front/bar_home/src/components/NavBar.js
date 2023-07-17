import React, {useState} from 'react';
import {Link} from 'react-router-dom';
import './NavBar.css';

const NavBar = () => {

    const [isActive, setIsActive] = useState(false)

    const toggleNavBar = () => {
        setIsActive(!isActive)
    }

    return (
        <div>
            <div className={`button ${isActive ? 'active' : ''}`} onClick={toggleNavBar}>
                <div className="bar top"></div>
                <div className="bar middle"></div>
                <div className="bar bottom"></div>
            </div>
            <div className={`sidebar ${isActive ? 'active' : ''}`}>
                <ul className='sidebar-list'>
                    <li>
                        <Link to="/">Home</Link>
                    </li>
                    <li>
                        <Link to="/cocktails">Cocktails</Link>
                    </li>
                    <li>
                        <Link to="/saved">Saved</Link>
                    </li>
                    <li>
                        <Link to="/info">Info</Link>
                    </li>
                </ul>
            </div>
        </div>
     );
}
 
export default NavBar;