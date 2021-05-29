package principal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Menu.imprimeMenu();
		Scanner sc = new Scanner(System.in);
		int opcao = sc.nextInt();
		while (opcao != 6) {
			switch (opcao) {
			case 3:
				
			}
			Menu.imprimeMenu();
			opcao = sc.nextInt();
		}
		System.out.println("Até mais!!!");
		sc.close();
	}


}
