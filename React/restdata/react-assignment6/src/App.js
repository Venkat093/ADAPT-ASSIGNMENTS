import React, { Component } from 'react';
import './App.css';
import Navbar from './components/Navbar';
import {BrowserRouter as Router, Link} from 'react-router-dom';
import Route from 'react-router-dom/Route'



class App extends Component {
  render() {
  return (
    <Router>
      <div className="App">
        <ul>
          <li>
        <Link to="/Home" className="link">Home</Link>
        <Link to="/project" className="link">project</Link>
        <Link to="/services" className="link">services</Link>
        <Link to="/contact" className="link">contact</Link>
        </li>
        </ul>
      <Navbar />
      <Route path="/Home" exact strict render={
        ()=> {
          return ( <h1>you choose Home</h1>);
        }
      }/>
      <Route path="/project" exact strict render={
        ()=> {
          return ( <h1>you choose project</h1>);
        }
      }/>
      <Route path="/services" exact strict render={
        ()=> {
          return ( <h1>you choose services</h1>);
        }
      }/>
      <Route path="/contact" exact strict render={
        ()=> {
          return ( <h1>you choose contact</h1>);
        }
      }/>
      </div>
    </Router>
  );
}
}

export default App;
