package br.com.objective.numeros;

public class Numero1 extends Conteudo implements Numero {

	public Numero1(int tamanho) {
		super(tamanho);
	}
	
	@Override
	public String retornaParteSuperiorCima() {
		return geraParteSemHifen();
	}

	@Override
	public String retornaParteSuperiorMeio() {
		return geraParteLateralDireita();
	}

	@Override
	public String retornaParteMeio() {
		return geraParteSemHifen();
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