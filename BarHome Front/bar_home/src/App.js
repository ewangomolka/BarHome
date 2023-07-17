import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import MainContainer from './containers/MainContainer';
import Footer from './components/Footer';

function App() {
  return (
      <div className="App">
        <div>
        {/* header */}
        </div>
        <div>
          <MainContainer/>
        </div>
        <div>
          <Footer/>
        </div>
      </div>
  );
}

export default App;
