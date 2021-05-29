package main;

public class Teste {
	
	
	public static void main(String[] args) {
		Sala s1 = new Sala();
		s1.criaPoltronaSimples(20, 10);
		s1.mostraPoltronasSimples();
		s1.setPoltronaSimplesOcupado(5, 5);
		System.out.println();
		s1.mostraPoltronasSimples();
		System.out.println();
		s1.criaPoltronaDupla(20, 4);
		s1.mostraPoltronasDuplas();
		s1.setOcupadoPoltronaDupla(1, 1, 1);
		System.out.println();
		s1.mostraPoltronasDuplas();

	}
}
