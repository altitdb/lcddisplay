package br.com.objective.numeros;

public class Numero4 extends Conteudo implements Numero {

	public Numero4(int tamanho) {
		super(tamanho);
	} 
	
	@Override
	public String retornaParteSuperiorCima() {
		return geraParteSemHifen();
	}

	@Override
	public String retornaParteSuperiorMeio() {
		return geraParteLateralEsquerdaDireita();
	}

	@Override
	public String retornaParteMeio() {
		return geraParteComHifen();
	}

	@Override
	public String retornaParteInferiorMeio() {
		return geraParteLateralDireita();
	}

	@Override
	public String retornaParteInferiorBaixo() {
		return geraParteSemHifen();
	}

}