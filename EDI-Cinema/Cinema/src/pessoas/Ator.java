package pessoas;

import java.util.ArrayList;
import java.util.List;

import principal.Filme;

public class Ator extends Pessoa {
	
	private String nacionalidade;

	public Ator(String nome, String nacionalidade) {
		super(nome);
		this.nacionalidade = nacionalidade;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}

}

	
