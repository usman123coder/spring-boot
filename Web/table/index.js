import React, { useState } from 'react';
import ReactDOM from 'react-dom';
import './index.css';

function Calculator() {
  const [input, setInput] = useState('');
  const [result, setResult] = useState('');

  const handleClick = (value) => {
    setInput((prevInput) => prevInput + value);
  };

  const clearInput = () => {
    setInput('');
    setResult('');
  };

  const calculateResult = () => {
    try {
      setResult(eval(input)); // WARNING: eval can be dangerous if used improperly
    } catch (error) {
      setResult('Error');
    }
  };

  return (
    <div className="calculator">
      <input type="text" value={input} readOnly />
      <div className="result">{result}</div>
      <div className="buttons">
        <button onClick={() => handleClick('1')}>1</button>
        <button onClick={() => handleClick('2')}>2</button>
        <button onClick={() => handleClick('3')}>3</button>
        <button onClick={() => handleClick('+')}>+</button>
        <button onClick={() => handleClick('4')}>4</button>
        <button onClick={() => handleClick('5')}>5</button>
        <button onClick={() => handleClick('6')}>6</button>
        <button onClick={() => handleClick('-')}>-</button>
        <button onClick={() => handleClick('7')}>7</button>
        <button onClick={() => handleClick('8')}>8</button>
        <button onClick={() => handleClick('9')}>9</button>
        <button onClick={() => handleClick('*')}>*</button>
        <button onClick={() => handleClick('0')}>0</button>
        <button onClick={() => handleClick('/')}>/</button>
        <button onClick={calculateResult}>=</button>
        <button onClick={clearInput}>C</button>
      </div>
    </div>
  );
}

ReactDOM.render(<Calculator />, document.getElementById('root'));
