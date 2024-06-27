const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const port = 3000;

app.use(bodyParser.json());
app.use(express.static('public'));

app.post('/transformar-texto', (req, res) => {
  const { texto, maiusculo } = req.body;

  if (maiusculo === 'true') {
    res.send(texto.toUpperCase());
  } else if (maiusculo === 'false') {
    res.send(texto.toLowerCase());
  } else {
    res.status(400).send('Parâmetro inválido. Use "true" para maiúsculo ou "false" para minúsculo.');
  }
});

app.listen(port, () => {
  console.log(`Servidor rodando em http://localhost:${port}`);
});
