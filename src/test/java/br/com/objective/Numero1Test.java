package br.com.objective;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.objective.numeros.Numero1;

public class Numero1Test {

	@Test
	public void deveriaRetornarParteSuperiorCima() {
		Numero1 numero = new Numero1(2);
		String valor = numero.retornaParteSuperiorCima();
		String valorEsperado = "    ";
		assertEquals("Parte Superior Topo", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorMeio() {
		Numero1 numero = new Numero1(5);
		String valor = numero.retornaParteSuperiorMeio();
		String valorEsperado = "      |";
		assertEquals("Parte Superior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteMeio() {
		Numero1 numero = new Numero1(5);
		String valor = numero.retornaParteMeio();
		String valorEsperado = "       ";
		assertEquals("Parte Meio", valorEsperado, valor);
	}
		
	@Test
	public void deveriaRetornarParteInferiorMeio() {
		Numero1 numero = new Numero1(3);
		String valor = numero.retornaParteInferiorMeio();
		String valorEsperado = "    |";
		assertEquals("Parte Inferior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorBaixo() {
		Numero1 numero = new Numero1(4);
		String valor = numero.retornaParteInferiorBaixo();
		String valorEsperado = "      ";
		assertEquals("Parte Inferior Baixo", valorEsperado, valor);
	}

}
