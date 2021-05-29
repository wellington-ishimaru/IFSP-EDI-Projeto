package main;

import java.util.ArrayList;
import java.util.List;

import pessoas.Ator;

public class Filme {
	
	private int codigo;
	private String titulo;
	private List<Ator> elenco = new ArrayList<Ator>();
	private int ano;
	private String sinopse;
	private Genero genero;
	

	public Filme(int codigo, String titulo, List<Ator> elenco, int ano, String sinopse, Genero genero) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.elenco = elenco;
		this.ano = ano;
		this.sinopse = sinopse;
		this.genero = genero;
	}

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Ator> getElenco() {
		return elenco;
	}

	public void setElenco(List<Ator> elenco) {
		this.elenco = elenco;
	}


	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}
