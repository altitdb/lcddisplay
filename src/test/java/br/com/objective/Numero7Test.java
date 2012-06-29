package br.com.objective;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.objective.numeros.Numero7;

public class Numero7Test {

	@Test
	public void deveriaRetornarParteSuperiorCima() {
		Numero7 numero = new Numero7(2);
		String valor = numero.retornaParteSuperiorCima();
		String valorEsperado = " -- ";
		assertEquals("Parte Superior Topo", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorMeio() {
		Numero7 numero = new Numero7(5);
		String valor = numero.retornaParteSuperiorMeio();
		String valorEsperado = "      |";
		assertEquals("Parte Superior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteMeio() {
		Numero7 numero = new Numero7(5);
		String valor = numero.retornaParteMeio();
		String valorEsperado = "       ";
		assertEquals("Parte Meio", valorEsperado, valor);
	}
		
	@Test
	public void deveriaRetornarParteInferiorMeio() {
		Numero7 numero = new Numero7(3);
		String valor = numero.retornaParteInferiorMeio();
		String valorEsperado = "    |";
		assertEquals("Parte Inferior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorBaixo() {
		Numero7 numero = new Numero7(4);
		String valor = numero.retornaParteInferiorBaixo();
		String valorEsperado = "      ";
		assertEquals("Parte Inferior Baixo", valorEsperado, valor);
	}

}
