class Menu {
    constructor() {
        this.buttonContainer = document.querySelector('#menu');
        this.statusBar = document.querySelector('#status-bar');

        this.showButtonClicked = this.showButtonClicked.bind(this);

        this.botoes = [
            new Button(this.buttonContainer, 'A', this.showButtonClicked),
            new Button(this.buttonContainer, 'B', this.showButtonClicked),
            new Button(this.buttonContainer, 'C', this.showButtonClicked)
        ];
    }

    showButtonClicked(event) {
        this.statusBar.textContent = event.informacao.buttonName + ' was clicked';
    }
}
  
class Button {
    constructor(containerElement, text, callback) {
        this.containerElement = containerElement;
        this.text = text;
        this.callback = callback;

        this.onClick = this.onClick.bind(this);

        const button = document.createElement('button');
        button.textContent = text;
        button.addEventListener('click', this.onClick);
        this.containerElement.append(button);
    }

    onClick() {
        const eventInfo = {
            buttonName: this.text
        };
        this.callback({ informacao: eventInfo });
    }
}

new Menu();
