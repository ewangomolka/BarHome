import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Routes, Route} from 'react-router-dom';

function App() {
  return (
    <Router>
      <div className="App">
        <div>
        {/* header */}
        </div>
        <div>
          <MainContainer/>
        </div>
        <div>
          {/* footer */}
        </div>
      </div>
    </Router>
  );
}

export default App;
