package br.com.objective;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.objective.numeros.Numero6;

public class Numero6Test {

	@Test
	public void deveriaRetornarParteSuperiorCima() {
		Numero6 numero = new Numero6(3);
		String valor = numero.retornaParteSuperiorCima();
		String valorEsperado = " --- ";
		assertEquals("Parte Superior Topo", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorMeio() {
		Numero6 numero = new Numero6(5);
		String valor = numero.retornaParteSuperiorMeio();
		String valorEsperado = "|      ";
		assertEquals("Parte Superior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteMeio() {
		Numero6 numero = new Numero6(4);
		String valor = numero.retornaParteMeio();
		String valorEsperado = " ---- ";
		assertEquals("Parte Meio", valorEsperado, valor);
	}
		
	@Test
	public void deveriaRetornarParteInferiorMeio() {
		Numero6 numero = new Numero6(3);
		String valor = numero.retornaParteInferiorMeio();
		String valorEsperado = "|   |";
		assertEquals("Parte Inferior Meio", valorEsperado, valor);
	}
	
	@Test
	public void deveriaRetornarParteSuperiorBaixo() {
		Numero6 numero = new Numero6(3);
		String valor = numero.retornaParteInferiorBaixo();
		String valorEsperado = " --- ";
		assertEquals("Parte Inferior Baixo", valorEsperado, valor);
	}

}
