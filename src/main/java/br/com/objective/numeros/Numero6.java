package br.com.objective.numeros;

public class Numero6 extends Conteudo implements Numero {

	public Numero6(int tamanho) {
		super(tamanho);
	}
	
	@Override
	public String retornaParteSuperiorCima() {
		return geraParteComHifen();
	}

	@Override
	public String retornaParteSuperiorMeio() {
		return geraParteLateralEsquerda();
	}

	@Override
	public String retornaParteMeio() {
		return geraParteComHifen();
	}

	@Override
	public String retornaParteInferiorMeio() {
		return geraParteLateralEsquerdaDireita();
	}

	@Override
	public String retornaParteInferiorBaixo() {
		return geraParteComHifen();
	}

}