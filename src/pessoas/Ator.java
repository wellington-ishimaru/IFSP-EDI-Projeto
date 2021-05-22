package pessoas;

import java.util.ArrayList;
import java.util.List;

import main.Filme;

public class Ator extends Pessoa{
	
	private List<Filme> filmes = new ArrayList<Filme>();

	public Ator(String nome, List<Filme> filmes) {
		super(nome);
		this.filmes = filmes;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(Filme filme) {
		filmes.add(filme);
	}
}
