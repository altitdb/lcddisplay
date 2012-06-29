package br.com.objective;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.objective.numeros.Numero5;

public class Numero5Test {

	@Test
	public void deveriaRetornarParteSuperiorCima() {
		Numero5 numero = new Numero5(2);
		String valor = numero.retornaParteSuperiorCima();
		String valorEsperado = " -- ";
		assertEquals("Parte Superior Topo", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorMeio() {
		Numero5 numero = new Numero5(5);
		String valor = numero.retornaParteSuperiorMeio();
		String valorEsperado = "|      ";
		assertEquals("Parte Superior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteMeio() {
		Numero5 numero = new Numero5(2);
		String valor = numero.retornaParteMeio();
		String valorEsperado = " -- ";
		assertEquals("Parte Meio", valorEsperado, valor);
	}
		
	@Test
	public void deveriaRetornarParteInferiorMeio() {
		Numero5 numero = new Numero5(3);
		String valor = numero.retornaParteInferiorMeio();
		String valorEsperado = "    |";
		assertEquals("Parte Inferior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorBaixo() {
		Numero5 numero = new Numero5(3);
		String valor = numero.retornaParteInferiorBaixo();
		String valorEsperado = " --- ";
		assertEquals("Parte Inferior Baixo", valorEsperado, valor);
	}

}
