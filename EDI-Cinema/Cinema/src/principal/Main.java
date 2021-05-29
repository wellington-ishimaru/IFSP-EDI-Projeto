package principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pessoas.Ator;

public class Main {

	public static void main(String[] args) {
		// cria atores, elenco e filmes
		Ator mb = new Ator("Marlon Brando", "Americano");
		Ator ap = new Ator("Al Pacino", "Americano");
		List<Ator> elencoTheGodFather = new ArrayList<Ator>();
		elencoTheGodFather.add(mb);
		elencoTheGodFather.add(ap);
		Filme tgf = new Filme(1, "The GodFather", elencoTheGodFather, 1972, 
				"Conta a história da mafia da Familia Corleone em Nova Iorque", Genero.DRAMA);
		
		Ator hl  = new Ator("Heath Ledger", "Australiano");
		Ator cb	 = new Ator("Christian Bale", "Britânico");
		List<Ator> elencoTheDarkKnight = new ArrayList<Ator>();
		elencoTheDarkKnight.add(hl);
		elencoTheDarkKnight.add(cb);
		Filme tdK = new Filme(2, "The Dark Knight", elencoTheDarkKnight, 2008, "Uma onda de caos toma conta"
				+ "de Gotham City", Genero.ACAO);
		
		Ator hf = new Ator("Harrison Ford", "Americano");
		Ator mh = new Ator("Mark Hamill", "Americano");
		Ator kf = new Ator("Carrie Fisher", "Americana");
		List<Ator> elencoStarWars = new ArrayList<Ator>();
		elencoStarWars.add(hf);
		elencoStarWars.add(mh);
		elencoStarWars.add(kf);
		Filme swrj = new Filme(3, "Star Wars: Return of Jedi", elencoStarWars, 1983, "As aventuras de Luke Skywalker continuam"
				+ "após resgatar seu amigo Han Solo", Genero.ACAO);
	
		//cria cinema e salas
		Cinema cinema = new Cinema();
		cinema.getSala1().criaPoltronaSimples(20, 10);
		cinema.getSala2().criaPoltronaDupla(20, 4);
		
		
		
		
		
		Menu.imprimeMenu();
		Scanner sc = new Scanner(System.in);
		int opcao = sc.nextInt();
		while (opcao != 6) {
			switch (opcao) {
				case 1:
				case 2:
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
				case 4:
				case 5:
			}
			Menu.imprimeMenu();
			opcao = sc.nextInt();
		}
		System.out.println("Até mais!!!");
		sc.close();
	}


}
