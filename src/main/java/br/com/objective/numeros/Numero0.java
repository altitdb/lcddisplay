package br.com.objective.numeros;

public class Numero0 extends Conteudo implements Numero {
	
	public Numero0(int tamanho) {
		super(tamanho);
	}

	@Override
	public String retornaParteSuperiorCima() {
		return geraParteComHifen();
	}

	@Override
	public String retornaParteSuperiorMeio() {
		return geraParteLateralEsquerdaDireita();
	}

	@Override
	public String retornaParteMeio() {
		return geraParteSemHifen();
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
