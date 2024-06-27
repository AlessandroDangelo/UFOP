const express = require('express');
const router = express.Router();
const User = require('./models/User'); // Crie o modelo de usuário conforme sua necessidade

// Rota para verificar autenticação
router.post('/authenticate', async (req, res) => {
    const { username, password } = req.body;
  
    try {
      const user = await User.findOne({ username });
  
      if (!user) {
        return res.status(401).json({ message: 'Usuário e/ou senha incorretos' });
      }
  
      // Compare a senha fornecida com a senha armazenada no banco de dados
      if (password === user.password) {
        return res.json({ message: 'Usuário logado com sucesso' });
      } else {
        return res.status(401).json({ message: 'Senha incorreta' });
      }
    } catch (error) {
      console.error(error);
      res.status(500).json({ message: 'Erro no servidor' });
    }
  });
  

// Rota para cadastrar usuário
router.post('/register', async (req, res) => {
    const { username, password } = req.body;
  
    try {
      // Verifica se o usuário já existe no banco de dados
      const existingUser = await User.findOne({ username });
      if (existingUser) {
        return res.status(400).json({ message: 'Conta já existe para este usuário' });
      }
  
      // Cria um novo usuário
      const newUser = new User({ username, password });
      await newUser.save();
  
      return res.json({ message: 'Usuário cadastrado com sucesso' });
    } catch (error) {
      console.error(error);
      res.status(500).json({ message: 'Erro no servidor' });
    }
  });
  

module.exports = router;
