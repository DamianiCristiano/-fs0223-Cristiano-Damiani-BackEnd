
public class Conto {
	
	private double saldo;
	private int numeroConto;
	private Cliente cliente;
	
	public Conto(double saldo, int numeroConto, Cliente cliente) {
		super();
		this.saldo = saldo;
		this.numeroConto = numeroConto;
		this.cliente = cliente;
	}
	public double getSaldo() {
		System.out.println(saldo);
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumeroConto() {
		return numeroConto;
	}
	public void setNumeroConto(int numeroConto) {
		this.numeroConto = numeroConto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public double deposita(double deposito, int numeroConto) {
		if(deposito > 0) {
			this.saldo += deposito;
            System.out.println("Deposito eseguito con successo!");
		}
		return saldo;
	}
	
	public double preleva(double prelievo, int numeroConto) {
			if(prelievo > 0 && prelievo <= this.saldo) {
            this.saldo -= prelievo;
            System.out.println("Prelievo eseguito con successo!");
        }
        return saldo;
	}

}
