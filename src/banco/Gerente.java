package banco;

public class Gerente extends Funcionario {
	
	private int senha;

	
	
	public Gerente() 
	{
		super();
	}

	public Gerente(String nome, String departamento, double salario, String dataAdimissao, String rg)
	{
		super(nome, departamento, salario, dataAdimissao, rg);
	}

	public boolean autenticaSenha(int senha)
	{
		if (this.senha == senha)
		{
			return true;
		}
		else return false;
	}
	
	public void setSenha(int senha)
	{
		this.senha = senha;
	}
	
	@Override
	public double getBonificacao() {
		return  (getSalario() * 0.10) + 1000;
	}
	
	
	
}
