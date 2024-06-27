void Maximo(TipoRegistro *x, TipoApontador Ap){
    TipoApontador Pag;
    Pag = *Ap;

    if (Pag == NULL){
        return;
    }

    if(Pag->Pt == Interna){
        Maximo(x, &Pag->UU.U0.pi[Pag->UU.U0.ni]);
    }else{
        *x = Pag->UU.U1.re[Pag->UU.U1.ne - 1];
    }
}