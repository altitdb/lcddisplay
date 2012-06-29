package br.com.objective;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.objective.numeros.Numero9;

public class Numero9Test {

	@Test
	public void deveriaRetornarParteSuperiorCima() {
		Numero9 numero = new Numero9(2);
		String valor = numero.retornaParteSuperiorCima();
		String valorEsperado = " -- ";
		assertEquals("Parte Superior Topo", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorMeio() {
		Numero9 numero = new Numero9(5);
		String valor = numero.retornaParteSuperiorMeio();
		String valorEsperado = "|     |";
		assertEquals("Parte Superior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteMeio() {
		Numero9 numero = new Numero9(3);
		String valor = numero.retornaParteMeio();
		String valorEsperado = " --- ";
		assertEquals("Parte Meio", valorEsperado, valor);
	}
		
	@Test
	public void deveriaRetornarParteInferiorMeio() {
		Numero9 numero = new Numero9(3);
		String valor = numero.retornaParteInferiorMeio();
		String valorEsperado = "    |";
		assertEquals("Parte Inferior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorBaixo() {
		Numero9 numero = new Numero9(2);
		String valor = numero.retornaParteInferiorBaixo();
		String valorEsperado = " -- ";
		assertEquals("Parte Inferior Baixo", valorEsperado, valor);
	}

}
