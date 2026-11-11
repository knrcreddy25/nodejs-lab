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
      
      <div style={{ marginTop: '30px' }}>
        <Link to="/register" style={buttonStyle}>Get Started</Link>
        <Link to="/login" style={{ ...buttonStyle, backgroundColor: '#6c757d' }}>Login to Account</Link>
      </div>

      <section style={{ marginTop: '50px', display: 'flex', justifyContent: 'center', gap: '20px' }}>
        <div style={{ border: '1px solid #ddd', padding: '20px', borderRadius: '8px', width: '200px' }}>
          <h3>Easy Registration</h3>
          <p>Sign up in seconds to access your dashboard.</p>
        </div>
        <div style={{ border: '1px solid #ddd', padding: '20px', borderRadius: '8px', width: '200px' }}>
          <h3>Secure Login</h3>
          <p>Your data is protected with encrypted authentication.</p>
        </div>
        <div style={{ border: '1px solid #ddd', padding: '20px', borderRadius: '8px', width: '200px' }}>
          <h3>24/7 Support</h3>
          <p>Reach out via our contact page for any help.</p>
        </div>
      </section>
    </div>
  );
}

export default Home;
