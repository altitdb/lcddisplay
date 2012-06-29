package br.com.objective.numeros;

public class Numero2 extends Conteudo implements Numero {

	public Numero2(int tamanho) {
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
		return geraParteLateralEsquerda();
	}

	@Override
	public String retornaParteInferiorBaixo() {
		return geraParteComHifen();
	}

	

}