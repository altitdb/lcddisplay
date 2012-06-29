package br.com.objective;
import static org.junit.Assert.*;

import org.junit.Test;

import br.com.objective.numeros.Conteudo;


public class ConteudoTest {

	@Test
	public void deveriaRetornarParteComHifen() {
		Conteudo conteudo = new Conteudo(2);
		String valor = conteudo.geraParteComHifen();
		String valorEsperado = " -- ";
		assertEquals("Parte com Hifen (2)", valorEsperado, valor);
	}

	
	@Test
	public void deveriaRetornarParteSemHifen() {
		Conteudo conteudo = new Conteudo(3);
		String valor = conteudo.geraParteSemHifen();
		String valorEsperado = "     ";
		assertEquals("Parte sem Hifen (3)", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteLateralEsquerda() {
		Conteudo conteudo = new Conteudo(1);
		String valor = conteudo.geraParteLateralEsquerda();
		String valorEsperado = "|  ";
		assertEquals("Parte Lateral Esquerda (1)", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteLateralDireita() {
		Conteudo conteudo = new Conteudo(6);
		String valor = conteudo.geraParteLateralDireita();
		String valorEsperado = "       |";
		assertEquals("Parte Lateral Direita (6)", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteLateralEsquerdaDireita() {
		Conteudo conteudo = new Conteudo(5);
		String valor = conteudo.geraParteLateralEsquerdaDireita();
		String valorEsperado = "|     |";
		assertEquals("Parte Lateral Direita (5)", valorEsperado, valor);
	}

}
