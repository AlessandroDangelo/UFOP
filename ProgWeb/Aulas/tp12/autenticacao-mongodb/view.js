const express = require('express');
const router = express.Router();

// Rota para renderizar a página de autenticação
router.get('/login', (req, res) => {
  res.render('login');
});

router.get('/register', (req, res) => {
    res.render('register');
  });  

module.exports = router;
