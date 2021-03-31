import React, { Component } from 'react'

class KeyPad extends Component {

    onClick = (e) => {
        this.props.onClick(e.target.name);
    };
    render() {
    return (
    <div className="buttons">
        <button name="clear" onClick={this.onClick} className="btn">clear</button>
        <button name="(" onClick={this.onClick}>(</button>
        <button name=")" onClick={this.onClick}>)</button>
        <button name="/" onClick={this.onClick}>/</button>
        <button name="1" onClick={this.onClick}>1</button>
        <button name="2" onClick={this.onClick}>2</button>
        <button name="3" onClick={this.onClick}>3</button>
        <button name="+" onClick={this.onClick}>+</button>
        <button name="4" onClick={this.onClick}>4</button>
        <button name="5" onClick={this.onClick}>5</button>
        <button name="6" onClick={this.onClick}>6</button>
        <button name="-" onClick={this.onClick}>-</button>
        <button name="7" onClick={this.onClick}>7</button>
        <button name="8" onClick={this.onClick}>8</button>
        <button name="9" onClick={this.onClick}>9</button>
        <button name="=" onClick={this.onClick}>=</button>
    </div>
        );
    }

}
export default KeyPad;