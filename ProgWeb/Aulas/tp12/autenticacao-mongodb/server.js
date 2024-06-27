const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const exphbs = require('express-handlebars');  // Use 'exphbs' em vez de 'handlebars'
const apiRoutes = require('./api');
const viewRoutes = require('./view');

const app = express();
const PORT = process.env.PORT || 3000;

// Conexão com o MongoDB (substitua 'sua_conexao_mongodb' pela sua string de conexão)
mongoose.connect('mongodb://localhost:27017/Autenticador', { useNewUrlParser: true, useUnifiedTopology: true });

// Configuração do Handlebars
app.engine('handlebars', exphbs({ layoutsDir: 'views', defaultLayout: 'login' }));
app.set('view engine', 'handlebars');

// Middlewares
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

// Rotas
app.use('/api', apiRoutes);
app.use('/', viewRoutes);

// Inicialização do servidor
app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});

