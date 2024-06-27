#include "maquina.hpp"

void montarMemoria(BlocoMemoria** memoria, int tamanho, int qdePalavrasBloco){

	for(int i=0; i<tamanho; i++){
		BlocoMemoria *aux = gerarBM();
		setEndBlocoBM(aux, i);
		int** palavras = new int*[qdePalavrasBloco];


		for(int j=0;j<qdePalavrasBloco; j++){
			int * intaux = new int;
			*intaux = rand() % 100;
			palavras[j] = intaux;
		}

		setPalavras(aux, palavras);
		memoria[i]= aux;

	}
}

void montarMemoriaVazia(int tamanho, BlocoMemoria** memoria){
	for(int i=0; i<tamanho; i++){
		BlocoMemoria *aux = gerarBM();
		//forcando cache estar vazia
		setEndBlocoBM(aux, 0);

		 memoria[i]= aux;
		// delete[] aux;
	}
}

void carregarInstrucoesTXT(Instrucao** memoriaInstrucoes){

	ifstream inFile;
	inFile.open("./instrucoes.txt");

	if(!inFile){
		cerr<< "nao foi capaz de encontrar instrucoes.txt";
		exit(1);
	}
	int opcode=0, i=0;
	while(opcode!=-1){
		int endBloco;
		int endPalavra;

		inFile>>opcode;
		inFile>>endBloco;
		inFile>>endPalavra;

		setOpcode(memoriaInstrucoes[i], opcode);
		setEndBloco(getAdd1(memoriaInstrucoes[i]), endBloco);
		setEndPalavra(getAdd1(memoriaInstrucoes[i]), endPalavra);

		inFile>>endBloco;
		inFile>>endPalavra;

		setEndBloco(getAdd2(memoriaInstrucoes[i]), endBloco);
		setEndPalavra(getAdd2(memoriaInstrucoes[i]), endPalavra);

		inFile>>endBloco;
		inFile>>endPalavra;

		setEndBloco(getAdd3(memoriaInstrucoes[i]), endBloco);
		setEndPalavra(getAdd3(memoriaInstrucoes[i]), endPalavra);

		i++;
	}

	inFile.close();

}

void maquina(Instrucao** memoriaInstrucoes, BlocoMemoria** HD, BlocoMemoria** ram, int tamRam, BlocoMemoria*** cache, int* tamanhoCache, int qtdCache){
	//Gerador de Interrupção
	int interrupcao = 0;
	//registradores
	int pc;
	int custo=0;
	int opCode;
	//caches 1 e 2 Hit e miss
	int* hit = new int[qtdCache + 1];
	int* miss = new int[qtdCache + 1];
	for (int i = 0; i < qtdCache + 1; i++)
	{
		hit[i] = 0;
		miss[i]= 0;
	}
	
	for(pc=0; getOpcode(memoriaInstrucoes[pc])!=-1; pc++){
		//TP3
		BlocoMemoria *dadoMemoriaAdd1= gerarBM();
		BlocoMemoria *dadoMemoriaAdd2= gerarBM();
		BlocoMemoria *dadoMemoriaAdd3= gerarBM();

		//Interrupção
		srand(time(NULL));
		interrupcao = rand() % 4096;
		opCode = getOpcode(memoriaInstrucoes[pc]);
		if(opCode != -1){
			if((interrupcao % MOD_INTERRUPT) == INTERRUPT){ // Instrução aleatória para interrupção
				opCode = rand() % 3;
				dadoMemoriaAdd1 = buscarNasMemorias(getAdd1(memoriaInstrucoes[rand() % 4096]), HD, ram, tamRam, cache, tamanhoCache, qtdCache);
				dadoMemoriaAdd2 = buscarNasMemorias(getAdd2(memoriaInstrucoes[rand() % 4096]), HD, ram, tamRam, cache, tamanhoCache, qtdCache);
				dadoMemoriaAdd3 = buscarNasMemorias(getAdd3(memoriaInstrucoes[rand() % 4096]), HD, ram, tamRam, cache, tamanhoCache, qtdCache);
			}else{	// Buscando a os blocos da instrução
				dadoMemoriaAdd1 = buscarNasMemorias(getAdd1(memoriaInstrucoes[pc]), HD, ram, tamRam, cache, tamanhoCache, qtdCache);

				dadoMemoriaAdd2 = buscarNasMemorias(getAdd2(memoriaInstrucoes[pc]), HD, ram, tamRam, cache, tamanhoCache, qtdCache);

				dadoMemoriaAdd3 = buscarNasMemorias(getAdd3(memoriaInstrucoes[pc]), HD, ram, tamRam, cache, tamanhoCache, qtdCache);
			}
			//incrementando custos
			custo += getCusto(dadoMemoriaAdd1);
			custo += getCusto(dadoMemoriaAdd2);
			custo += getCusto(dadoMemoriaAdd3);

			 //validando hits e misses
			
			for (int i = 0; i < getCacheHit(dadoMemoriaAdd1); i++)
			{
				if ((i + 1) == getCacheHit(dadoMemoriaAdd1))
				{
					hit[i]++;
				}else miss[i]++;				
			}

			for (int i = 0; i < getCacheHit(dadoMemoriaAdd2); i++)
			{
				if ((i + 1) == getCacheHit(dadoMemoriaAdd2))
				{
					hit[i]++;
				}else miss[i]++;				
			}

			for (int i = 0; i < getCacheHit(dadoMemoriaAdd3); i++)
			{
				if ((i + 1) == getCacheHit(dadoMemoriaAdd3))
				{
					hit[i]++;
				}else miss[i]++;				
			}

			switch (opCode){
				//levar para cache1 dados externos
				case 0:{
					//cout<<"Nao ha demanda por levar dados externos para as memorias. "<<endl;
					break;
				}
				case 1:{
					//somar
					int conteudo1 = getPalavra(dadoMemoriaAdd1, getEndPalavra(getAdd1(memoriaInstrucoes[pc])));
					int conteudo2 = getPalavra(dadoMemoriaAdd2, getEndPalavra(getAdd2(memoriaInstrucoes[pc])));
					int soma = conteudo1+conteudo2;
					//salvando resultado na cache1
					setPalavra(dadoMemoriaAdd3, getEndPalavra(getAdd3(memoriaInstrucoes[pc])), &soma);

					break;
				}
				case 2:{
					//subtrair
					int conteudo1 = getPalavra(dadoMemoriaAdd1, getEndPalavra(getAdd1(memoriaInstrucoes[pc])));
					int conteudo2 = getPalavra(dadoMemoriaAdd2, getEndPalavra(getAdd2(memoriaInstrucoes[pc])));
					int sub = conteudo1-conteudo2;

					//salvando resultado na cache1
					setPalavra(dadoMemoriaAdd3, getEndPalavra(getAdd3(memoriaInstrucoes[pc])), &sub);

					break;
				}
			}
			if(interrupcao %  MOD_INTERRUPT == INTERRUPT)
				pc--;

			// deleteBM(dadoMemoriaAdd1);
			// deleteBM(dadoMemoriaAdd2);
			// deleteBM(dadoMemoriaAdd3);

		}//end if
	}//end for
	cout<<"\n\n----------------------------------------------------"<<endl;
	cout<<"Custo total do programa: "<<custo<<endl;
	cout<<"Hits e Misses do programa - ";
	for (int i = 0; i <= qtdCache; i++)
	{
		if (i == qtdCache)
		{
			cout<<"RAM hit: "<<hit[i]<<" ("<<hit[i]/((hit[i]+miss[i])/100)<<"%) | "<<"RAM miss:"<<miss[i]<<" | "; 	
		}else
			cout<<"C"<<i+1<<" hit: "<<hit[i]<<" ("<<hit[i]/((hit[i]+miss[i])/100)<<"%) | "<<"C"<<i+1<<" miss:"<<miss[i]<<" | "; 
	}
	
	cout<<"\n----------------------------------------------------"<<endl;
	cout<<"----------------------\nHD:\t 4096"<<endl;
	cout<<"---------------------\nRAM:\t "<<tamRam<<endl;
	for (int i = 0; i < qtdCache; i++)
	{
		cout<<"Cache "<<i+1<<": "<<tamanhoCache[i]<<endl;
	}
}
