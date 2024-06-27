void maximo(TipoRegistro *x, TipoApontador Ap){
    if (Ap == NULL){
        return;
    }

    *x = Ap->r[Ap->n-1];

    maximo(x, Ap->p[Ap->n]);
}