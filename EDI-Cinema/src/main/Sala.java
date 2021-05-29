package main;

public class Sala {
	
	
	private Filme filme;
	private Horario horario;
	private String[][] poltronasSimples;
	private String[][][] poltronasDuplas;
	

	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	public void criaPoltronaSimples(int fileira, int coluna) {
		this.poltronasSimples = new String[fileira][coluna];
		for (int i = 0; i < fileira ; i++) {
			for (int j = 0; j < coluna ; j++) {
				this.poltronasSimples[i][j] = "Vago";
			}
		}
	}
	public void mostraPoltronasSimples(){
		for (int i = 0; i < poltronasSimples.length; i++) {
			for (int j = 0; j < poltronasSimples[0].length; j++) {
				System.out.print(poltronasSimples[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void setPoltronaSimplesOcupado(int fileira, int coluna) {
		this.poltronasSimples[fileira][coluna] = "Ocup";

	}
	
	public void criaPoltronaDupla(int fileira, int coluna) {
		this.poltronasDuplas = new String[fileira][coluna][2];
		for (int i = 0; i < fileira ; i++) {
			for (int j = 0; j < coluna ; j++) {
				this.poltronasDuplas[i][j][0] = "Vago";
				this.poltronasDuplas[i][j][1] = "Vago";
			}
		}
	}
	public void mostraPoltronasDuplas(){
		for (int i = 0; i < poltronasDuplas.length; i++) {
			for (int j = 0; j < poltronasDuplas[0].length; j++) {
				System.out.print("[" + poltronasDuplas[i][j][0] + " ");
				System.out.print(poltronasDuplas[i][j][1] + "]");
			}
			System.out.println();
		}
	}
	
	public void setOcupadoPoltronaDupla(int fileira, int coluna, int lugar) {
		this.poltronasDuplas[fileira][coluna][lugar] = "Ocup";
	}
	
}
