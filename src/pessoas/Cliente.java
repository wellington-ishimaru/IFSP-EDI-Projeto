package pessoas;

public class Cliente extends Pessoa {
	
	private double valorPago;

	public Cliente(String nome, double valorPago) {
		super(nome);
		this.valorPago = valorPago;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
	
}
