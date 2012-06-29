package br.com.objective.numeros;

public class Numero3 extends Conteudo implements Numero {

	public Numero3(int tamanho) {
		super(tamanho);
	}
	
	@Override
	public String retornaParteSuperiorCima() {
		return geraParteComHifen();
	}

	@Override
	public String retornaParteSuperiorMeio() {
		return geraParteLateralDireita();
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
		return geraParteComHifen();
	}



}