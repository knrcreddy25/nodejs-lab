import React from 'react';
import { Link } from 'react-router-dom';

function Home() {
  const containerStyle = {
    textAlign: 'center',
    padding: '50px',
    fontFamily: 'Arial, sans-serif'
  };

  const buttonStyle = {
    padding: '10px 20px',
    fontSize: '16px',
    backgroundColor: '#007bff',
    color: 'white',
    border: 'none',
    borderRadius: '5px',
    cursor: 'pointer',
    textDecoration: 'none',
    margin: '10px'
  };

  return (
    <div style={containerStyle}>
      <h1>Welcome to the Student Management System</h1>
      <p>Manage registrations, logins, and student profiles efficiently.</p>
     
</div>      
  );
}

export default Home;
