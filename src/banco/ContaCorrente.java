package banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(double limite, Cliente c) {
		super(limite, c);
		
	}
	
	@Override
	public void atualiza(double taxa) {
		
		deposita((getSaldo() * taxa) * 2);
		
	}
	
	

}
