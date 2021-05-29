package principal;
import pessoas.Atendente;
import pessoas.Cliente;

public class Ingresso {
	
	private int codigo;
	private Atendente atendente;
	private Filme filme;
	private double valor;
	private Sala sala;
	private Cliente cliente;
	private Horario horario;
	
	public Ingresso(int codigo, Atendente atendente, Filme filme, double valor, Sala sala, Cliente cliente,
			Horario horario) {
		this.codigo = codigo;
		this.atendente = atendente;
		this.filme = filme;
		this.valor = valor;
		this.sala = sala;
		this.cliente = cliente;
		this.horario = horario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

}
