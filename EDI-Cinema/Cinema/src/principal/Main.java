package principal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cinema cinema = new Cinema();
		cinema.getSala1().criaPoltronaSimples(20, 10);
		cinema.getSala2().criaPoltronaDupla(20, 4);
				
		
		Menu.imprimeMenu();
		Scanner sc = new Scanner(System.in);
		int opcao = sc.nextInt();
		while (opcao != 6) {
			switch (opcao) {
			case 3:
				System.out.println(" 1 - mostra sala1:");
				System.out.println(" 2 - mostra sala2:");
				System.out.print("Digite uma opção: ");
				int subOpcao = sc.nextInt();
					if(subOpcao == 1) {
						cinema.getSala1().mostraPoltronasSimples();
					}else {
						cinema.getSala2().mostraPoltronasDuplas();
					}break;
				
			}
			Menu.imprimeMenu();
			opcao = sc.nextInt();
		}
		System.out.println("Até mais!!!");
		sc.close();
	}


}
