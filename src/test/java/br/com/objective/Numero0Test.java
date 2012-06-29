package br.com.objective;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.objective.numeros.Numero0;

public class Numero0Test {

	@Test
	public void deveriaRetornarParteSuperiorCima() {
		Numero0 numero = new Numero0(2);
		String valor = numero.retornaParteSuperiorCima();
		String valorEsperado = " -- ";
		assertEquals("Parte Superior Topo", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorMeio() {
		Numero0 numero = new Numero0(5);
		String valor = numero.retornaParteSuperiorMeio();
		String valorEsperado = "|     |";
		assertEquals("Parte Superior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteMeio() {
		Numero0 numero = new Numero0(5);
		String valor = numero.retornaParteMeio();
		String valorEsperado = "       ";
		assertEquals("Parte Meio", valorEsperado, valor);
	}
		
	@Test
	public void deveriaRetornarParteInferiorMeio() {
		Numero0 numero = new Numero0(3);
		String valor = numero.retornaParteInferiorMeio();
		String valorEsperado = "|   |";
		assertEquals("Parte Inferior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorBaixo() {
		Numero0 numero = new Numero0(4);
		String valor = numero.retornaParteInferiorBaixo();
		String valorEsperado = " ---- ";
		assertEquals("Parte Inferior Baixo", valorEsperado, valor);
	}

}
