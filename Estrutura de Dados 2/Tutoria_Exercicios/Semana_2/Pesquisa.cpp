bool pesquisa(TipoRegistro *x, TipoApontador Ap){
    long i = 1;
    if (Ap == NULL){
        cout << "TipoRegistro nao esta presente na arvore" << endl;
        return 1;
    }

    while (i < Ap->n && x->Chave > Ap->r[i - 1].Chave){
        i++;
        if(x->Chave == Ap->r[i-1].Chave){
            *x = Ap->r[i-1];
            return 0;
        }
    }

    if(x->Chave < Ap->r[i-1].Chave){
        pesquisa(x,Ap->p[i-1]);
    }else{
        pesquisa(x, Ap->p[i]);
    } 
}