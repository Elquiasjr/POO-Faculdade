package lista05.exercicio1;

public class Conta {

	private Cliente cliente;
	private double saldo;
	private int idConta;
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getIdConta() {
		return idConta;
	}
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	@Override
	public String toString() {
		return "Conta [cliente=" + cliente + ", saldo=" + saldo + ", idConta=" + idConta + "]";
	}
	
	public Conta(Cliente cliente, double saldo, int idConta) {
		super();
		this.cliente = cliente;
		this.saldo = saldo;
		this.idConta = idConta;
	}
	
	
	
}
