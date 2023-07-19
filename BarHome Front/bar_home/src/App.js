import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import MainContainer from './containers/MainContainer';
import Footer from './components/Footer';
import Header from './components/Header';

function App() {
  return (
      <div className="App">
        <div className='Header'>
          <Header/>
        </div>
        <div className='MainContainer'>
          <MainContainer/>
        </div>
        <div className='Footer'>
          <Footer/>
        </div>
      </div>
  );
}

export default App;
