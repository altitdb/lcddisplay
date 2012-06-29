package br.com.objective;
import static org.junit.Assert.*;

import org.junit.Test;


public class ImpressoraTest {
	
	@Test
	public void deveriaImprimirZeroComTamanhoDois() throws Exception {
		Impressora impressora = new Impressora(2, "0");
		String valor = impressora.imprimir();
		String valorExperado = " --  \n" +
						"|  | \n" +
						"|  | \n" +
						"     \n" +
						"|  | \n" +
						"|  | \n" +
						" --  \n";
		assertEquals("Imprimir 0", valorExperado, valor);
	}
	
	@Test
	public void deveriaImprimirZeroComTamanhoTres() throws Exception {
		Impressora impressora = new Impressora(3, "0");
		String valor = impressora.imprimir();
		String valorExperado = " ---  \n" +
						"|   | \n" +
						"|   | \n" +
						"|   | \n" +
						"      \n" +
						"|   | \n" +
						"|   | \n" +
						"|   | \n" +
						" ---  \n";
		assertEquals("Imprimir 0", valorExperado, valor);
	}
	
	@Test
	public void deveriaImprimirZeroEUmComTamanhoDois() throws Exception {
		Impressora impressora = new Impressora(2, "01");
		String valor = impressora.imprimir();
		String valorExperado = " --       \n" +
						"|  |    | \n" +
						"|  |    | \n" +
						"          \n" +
						"|  |    | \n" +
						"|  |    | \n" +
						" --       \n";
		assertEquals("Imprimir 0", valorExperado, valor);
	}
	
	@Test
	public void deveriaImprimirZeroEUmComTamanhoTres() throws Exception {
		Impressora impressora = new Impressora(3, "01");
		String valor = impressora.imprimir();
		String valorExperado = " ---        \n" +
						"|   |     | \n" +
						"|   |     | \n" +
						"|   |     | \n" +
						"            \n" +
						"|   |     | \n" +
						"|   |     | \n" +
						"|   |     | \n" +
						" ---        \n";
		assertEquals("Imprimir 0", valorExperado, valor);
	}
}
