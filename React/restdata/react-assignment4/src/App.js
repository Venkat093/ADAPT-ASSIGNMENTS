import React, { Component } from 'react'
import './App.css';
import KeyPad from './components/KeyPad'
import Output from './components/Output';

class App extends Component {
  state = {
    result: ''
  }
  onClick = buttonName => {
    if(buttonName === '='){
      this.calculate();
    }else if (buttonName === "clear"){
      this.backspace();
    }
    else
    this.setState({
      result: this.state.result + buttonName
    });
  };

  backspace = () => {
    this.setState({
      result: this.state.result.slice(0, -1)
    });
  };

  calculate = () => {
    this.setState({
      result: eval(this.state.result)
    });
  };
  render() {
    return (
    <div className="App">
      <div className="calc-body">
      <Output result={this.state.result} />
      <KeyPad onClick={this.onClick} />
      </div>
    </div>
  );
}
}

export default App;
