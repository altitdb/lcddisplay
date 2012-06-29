package br.com.objective;

public class Main {

	public static void main(String[] args) throws Exception {
		String entrada = "0123456789";
		
		int tamanho2 = 2;
		Impressora impressora2 = new Impressora(tamanho2, entrada);
		String resultado2 = impressora2.imprimir();
		System.out.println(resultado2);
		
		int tamanho3 = 3;
		Impressora impressora3 = new Impressora(tamanho3, entrada);
		String resultado3 = impressora3.imprimir();
		System.out.println(resultado3);
		
		int tamanho4 = 4;
		Impressora impressora4 = new Impressora(tamanho4, entrada);
		String resultado4 = impressora4.imprimir();
		System.out.println(resultado4);
	}
}
