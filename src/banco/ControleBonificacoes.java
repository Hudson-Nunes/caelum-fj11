package banco;

public class ControleBonificacoes {
	
	private double totalBonificacoes = 0;
	
	public void registra(Funcionario f)
	{
		totalBonificacoes+= f.getBonificacao();
	}
	
	public double getTotalBonificacoes()
	{
		return totalBonificacoes;
	}

}
