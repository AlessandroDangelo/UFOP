class Menu {
    constructor() {
        this.buttonContainer = document.querySelector('#menu');
        this.statusBar = document.querySelector('#status-bar');

        this.showButtonClicked = this.showButtonClicked.bind(this);

        this.buttons = [
            new Button(this.buttonContainer, 'A'),
            new Button(this.buttonContainer, 'B'),
            new Button(this.buttonContainer, 'C')
        ];

        document.addEventListener('button-clicked', this.showButtonClicked);
    }

    showButtonClicked(event) {
        this.statusBar.textContent = event.detail.buttonName + ' was clicked';
    }
}
  
class Button {
    constructor(containerElement, text) {
        this.containerElement = containerElement;
        this.text = text;

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
        document.dispatchEvent(
            new CustomEvent('button-clicked', { detail: eventInfo }));
    }
}

new Menu();
