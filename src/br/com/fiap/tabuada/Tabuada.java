package br.com.fiap.tabuada;

public class Tabuada {
	
	public void executarTabuada(int multiplicando, int multiplicador) {
		
		int cont = 0;
		int produto = 0;
		
		while (cont <= multiplicador) {
			produto = multiplicando * cont;
			
			System.out.println(multiplicando + " x " + cont + " = " + produto);
			cont++; //acrescenta um a cada volta
			
			//cont = cont + 1; acrescentar um a cada volta
			//cont--; tirar um a cada volta
			//cont = cont +3 acrescenta três a cada volta
			//cont +=3; cont +3 acrescenta três
		
		}
	}

}
