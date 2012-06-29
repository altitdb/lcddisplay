package br.com.objective.numeros;

public class Conteudo {
	
	private int tamanho;
	private String parteComHifen;
	private String parteSemHifen;
	private String parteLateralEsquerda;
	private String parteLateralDireita;
	private String parteLateralEsquerdaDireita;
	
	public Conteudo(int quantidade) {
		this.tamanho = quantidade;
	}

	public String geraParteComHifen() {
		parteComHifen = " ";
		for(int i = 0; i < tamanho; i++) {
			parteComHifen += "-";
		}
		parteComHifen += " ";
		return parteComHifen;
	}

	public String geraParteSemHifen() {
		parteSemHifen = " ";
		for(int i = 0; i < tamanho; i++) {
			parteSemHifen += " ";
		}
		parteSemHifen += " ";
		return parteSemHifen;
	}
	
	public String geraParteLateralEsquerda() {
		parteLateralEsquerda = "|";
		for(int i = 0; i < tamanho; i++) {
			parteLateralEsquerda += " ";
		}
		parteLateralEsquerda += " ";
		return parteLateralEsquerda;
	}
	
	public String geraParteLateralDireita() {
		parteLateralDireita = " ";
		for(int i = 0; i < tamanho; i++) {
			parteLateralDireita += " ";
		}
		parteLateralDireita += "|";
		return parteLateralDireita;
	}
	
	public String geraParteLateralEsquerdaDireita() {
		parteLateralEsquerdaDireita = "|";
		for(int i = 0; i < tamanho; i++) {
			parteLateralEsquerdaDireita += " ";
		}
		parteLateralEsquerdaDireita += "|";
		return parteLateralEsquerdaDireita;
	}

	
}
