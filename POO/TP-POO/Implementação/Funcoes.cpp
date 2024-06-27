
#include "Funcoes.hpp"


/*  O menu é onde o programa todo se baseia, criamos os vetores de vendedores, clientes e mecanicos, também criamos o único administrador, esses vetores serão
 e o administrador serão usados no restante do programa e são passados como parametreos em metodos chamado aqui. */
void menuInicial() {
    int opcao;
    Administrador admin;
    vector <Vendedor*> vendedor;
    vector <Mecanico*> mecanico;
    vector <Cliente*> clientes;

    Vendedor *inicialv = new Vendedor("Alessandro", "1234567891011", "(16) 98109-7848", "alessandro.angelo@aluno.ufop.br", "AleDangelo", "123", "Vendedor", 1000, "20/09/2020", true);
    vendedor.push_back(inicialv);

    Mecanico *inicialm = new Mecanico("Fabio", "1234567891011", "(77) 99869-2122", "fabio.dias@aluno.ufop.br", "Fabioh", "1234", "Mecanico", 1500, "20/09/2020", true);
    mecanico.push_back(inicialm);



    do {

        cout << char(201);
        for (int i = 0; i < 24; i++) { cout << char(205); }
        cout << " OFICINA D'ANGELO ";
        for (int i = 0; i < 22; i++) { cout << char(205); }
        cout << char(187) << "\n";

        for (int i = 0; i < 2; i++) {
            cout << char(186);
            for (int i = 0; i < 64; i++) { cout << " "; }
            cout << char(186) << "\n";
        }

        cout << char(186) << "\t\t   Escolha seu tipo de usuario:\t\t\t " << char(186) << "\n";

        cout << char(186) << "\t\t\t[1] - Admnistrador\t\t\t " << char(186) << "\n";
        cout << char(186) << "\t\t\t[2] - Mecanico\t\t\t\t " << char(186) << "\n";
        cout << char(186) << "\t\t\t[3] - Vendedor\t\t\t\t " << char(186) << "\n";
        cout << char(186) << "\t\t\t[4] - Sair\t\t\t\t " << char(186) << "\n";

        for (int i = 0; i < 2; i++) {
            cout << char(186);
            for (int i = 0; i < 64; i++) { cout << " "; }
            cout << char(186) << "\n";
        }

        cout << char(200);
        for (int i = 0; i < 64; i++) { cout << char(205); }
        cout << char(188) << "\n";

        // COLHENDO A OPÇÃO DO USUARIO //


        cin >> opcao;

        switch (opcao) {
            case 1: {
                admin.loginAdm(mecanico, vendedor);
                break;
            }
            case 2: {
                mecanico[0]->loginMec(mecanico, clientes);
                break;
            }
            case 3: {
                vendedor[0]->loginVend(vendedor, clientes);
                break;
            }
            case 4: {
                break;
            }
            default:
                cout << "Esta opcao é invalida" << endl;
        };

    }while (opcao != 4);
}