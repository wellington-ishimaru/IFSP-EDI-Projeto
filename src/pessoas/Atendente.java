package pessoas;

public class Atendente extends Pessoa{
	
	private int codigo;
	private String cargo;
	
	public Atendente(String nome, int codigo, String cargo) {
		super(nome);
		this.codigo = codigo;
		this.cargo = cargo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
