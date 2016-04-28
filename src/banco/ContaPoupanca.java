package banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(double limite, Cliente c) {
		
		super(limite, c);

	}

	@Override
	public void atualiza(double taxa) {
		
		deposita((getSaldo() * taxa) * 3);
		
	}
	
	

}
