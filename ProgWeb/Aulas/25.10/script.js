let contador = document.getElementById("contador");
let contagem = 0;
let interrupitor = false;

function mudarEstado() {
    let botao = document.getElementById("botao");

    contagem++;
    contador.textContent = contagem;

    if (interrupitor === false) {
        botao.src = "images/acesa.png";
        interrupitor = true;
    } else {
        botao.src = "images/apagada.png";
        interrupitor = false;
    }
}