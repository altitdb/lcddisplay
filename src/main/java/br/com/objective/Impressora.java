package br.com.objective;

import java.util.ArrayList;
import java.util.List;

import br.com.objective.numeros.Numero;

public class Impressora {

	private int tamanho;
	private String entrada;
	private static final int SUPERIOR_CIMA = 0;
	private static final int SUPERIOR_MEIO = 1;
	private static final int MEIO = 2;
	private static final int INFERIOR_MEIO = 3;
	private static final int INFERIOR_BAIXO = 4;

	public Impressora(int tamanho, String entrada) {
		this.tamanho = tamanho;
		this.entrada = entrada;
	}

	public String imprimir() throws Exception {
		StringBuffer[] linha = montaLinhas();
		StringBuffer saidaFinal = new StringBuffer();
		saidaFinal.append(linha[SUPERIOR_CIMA]);
		saidaFinal.append(linha[SUPERIOR_MEIO]);
		saidaFinal.append(linha[MEIO]);
		saidaFinal.append(linha[INFERIOR_MEIO]);
		saidaFinal.append(linha[INFERIOR_BAIXO]);
		return saidaFinal.toString();
	}

	private StringBuffer[] montaLinhas() throws Exception {
		List<Numero> numeros = retornaNumeros(tamanho, entrada);
		StringBuffer[] linha = new StringBuffer[] { new StringBuffer(),
				new StringBuffer(), new StringBuffer(), new StringBuffer(),
				new StringBuffer() };
		for (Numero numero : numeros) {
			linha[SUPERIOR_CIMA].append(numero.retornaParteSuperiorCima())
					.append(" ");
			linha[MEIO].append(numero.retornaParteMeio()).append(" ");
			linha[INFERIOR_BAIXO].append(numero.retornaParteInferiorBaixo())
					.append(" ");
		}
		linha[SUPERIOR_CIMA].append("\n");
		linha[MEIO].append("\n");
		linha[INFERIOR_BAIXO].append("\n");
		for (int indiceQuantidade = 0; indiceQuantidade < tamanho; indiceQuantidade++) {
			for (Numero numero : numeros) {
				linha[SUPERIOR_MEIO].append(numero.retornaParteSuperiorMeio()).append(" ");
				linha[INFERIOR_MEIO].append(numero.retornaParteInferiorMeio()).append(" ");
			}
			linha[SUPERIOR_MEIO].append("\n");
			linha[INFERIOR_MEIO].append("\n");
		}
		return linha;
	}

	private List<Numero> retornaNumeros(int tamanho, String entrada)
			throws Exception {
		List<Numero> numeros = new ArrayList<Numero>();
		for (int indiceNumero = 0; indiceNumero < entrada.length(); indiceNumero++) {
			char numeroEntrada = entrada.charAt(indiceNumero);
			Numero numero = (Numero) Class.forName(
					"br.com.objective.numeros.Numero"
							+ String.valueOf(numeroEntrada)).getConstructors()[0]
					.newInstance(tamanho);
			numeros.add(numero);
		}
		return numeros;
	}

}
