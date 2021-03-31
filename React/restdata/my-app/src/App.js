import './App.css';
import List from './components/List';
import Headercomponent from './components/headercomponent';
import React, { Component } from 'react';
import Footer from './components/footer';
import{BrowserRouter as Router,Route,Switch} from 'react-router-dom';
import CreateuserComponent from './components/CreateuserComponent';
import updateuser from'./components/updateuser';
class App extends Component {
  state = {  }
  render() { 
    return (  <React.Fragment>
    <Router>
    
    <Headercomponent />
    <div className="container">
      <Switch>
        <Route path="/" exact component ={List}></Route>
        <Route path="/users" component ={List}></Route>
        <Route path="/add-user" component ={CreateuserComponent}></Route>
        <Route path="/update-user/:id" component ={updateuser}></Route>
             {/* <List/> */}
      </Switch>
    </div>
    <div className="container-fluid">
  
   </div>
                
                  {/* <Footer />*/}                  
   </Router>
   </React.Fragment> );
  }
}
 


export default App;
