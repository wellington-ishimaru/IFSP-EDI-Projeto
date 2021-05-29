package principal;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

	private Sala sala1 = new Sala();
	private Sala sala2 = new Sala();
	private List<Filme> filmesEmCartaz = new ArrayList<Filme>();
	
	public Sala getSala1() {
		return sala1;
	}
	public void setSala1(Sala sala1) {
		this.sala1 = sala1;
	}
	public Sala getSala2() {
		return sala2;
	}
	public void setSala2(Sala sala2) {
		this.sala2 = sala2;
	}
	public List<Filme> getFilmesEmCartaz() {
		return filmesEmCartaz;
	}
	public void setFilmesEmCartaz(Filme filme) {
		this.filmesEmCartaz.add(filme);
	}
	public void removeFilmeEmCartaz(Filme filme) {
		this.filmesEmCartaz.remove(filme);
	}
	
	
}
