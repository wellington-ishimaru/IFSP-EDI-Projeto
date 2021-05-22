package main;

import java.util.Scanner;

public class Main {
	public static void imprimeMenu() {
		System.out.println(">>>>>>> Menu <<<<<<<<<<<");
		System.out.println("1 - Venda de ingressos");
		System.out.println("2 - Gerenciamento de filmes");
		System.out.println("3 - Gerenciamento de salas");
		System.out.println("4 - Gerenciamento de atendentes");
		System.out.println("5 - Financeiro");
		System.out.println("6 - Sair");
		System.out.println("---------------------------------");
		System.out.println("Digite uma opção: ");
	}
	public static void main(String[] args) {
		
		imprimeMenu();
		Scanner sc = new Scanner(System.in);
		int opcao = sc.nextInt();
		while (opcao != 6) {
			imprimeMenu();
			opcao = sc.nextInt();
		}
		System.out.println("Até mais!!!");
		sc.close();
	}

}
