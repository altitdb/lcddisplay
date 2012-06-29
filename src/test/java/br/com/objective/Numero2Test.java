package br.com.objective;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.objective.numeros.Numero2;

public class Numero2Test {

	@Test
	public void deveriaRetornarParteSuperiorCima() {
		Numero2 numero = new Numero2(2);
		String valor = numero.retornaParteSuperiorCima();
		String valorEsperado = " -- ";
		assertEquals("Parte Superior Topo", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorMeio() {
		Numero2 numero = new Numero2(5);
		String valor = numero.retornaParteSuperiorMeio();
		String valorEsperado = "      |";
		assertEquals("Parte Superior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteMeio() {
		Numero2 numero = new Numero2(5);
		String valor = numero.retornaParteMeio();
		String valorEsperado = " ----- ";
		assertEquals("Parte Meio", valorEsperado, valor);
	}
		
	@Test
	public void deveriaRetornarParteInferiorMeio() {
		Numero2 numero = new Numero2(3);
		String valor = numero.retornaParteInferiorMeio();
		String valorEsperado = "|    ";
		assertEquals("Parte Inferior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorBaixo() {
		Numero2 numero = new Numero2(4);
		String valor = numero.retornaParteInferiorBaixo();
		String valorEsperado = " ---- ";
		assertEquals("Parte Inferior Baixo", valorEsperado, valor);
	}

}
