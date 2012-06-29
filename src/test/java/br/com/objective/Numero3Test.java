package br.com.objective;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.objective.numeros.Numero3;

public class Numero3Test {

	@Test
	public void deveriaRetornarParteSuperiorCima() {
		Numero3 numero = new Numero3(2);
		String valor = numero.retornaParteSuperiorCima();
		String valorEsperado = " -- ";
		assertEquals("Parte Superior Topo", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorMeio() {
		Numero3 numero = new Numero3(5);
		String valor = numero.retornaParteSuperiorMeio();
		String valorEsperado = "      |";
		assertEquals("Parte Superior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteMeio() {
		Numero3 numero = new Numero3(5);
		String valor = numero.retornaParteMeio();
		String valorEsperado = " ----- ";
		assertEquals("Parte Meio", valorEsperado, valor);
	}
		
	@Test
	public void deveriaRetornarParteInferiorMeio() {
		Numero3 numero = new Numero3(3);
		String valor = numero.retornaParteInferiorMeio();
		String valorEsperado = "    |";
		assertEquals("Parte Inferior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorBaixo() {
		Numero3 numero = new Numero3(4);
		String valor = numero.retornaParteInferiorBaixo();
		String valorEsperado = " ---- ";
		assertEquals("Parte Inferior Baixo", valorEsperado, valor);
	}

}
