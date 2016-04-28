package banco;

public class Presidente extends Funcionario
{

	public Presidente() {
		super();
	}

	public Presidente(String nome, String departamento, double salario, String dataAdimissao, String rg) 
	{
		super(nome, departamento, salario, dataAdimissao, rg);
	}

	@Override
	public double getBonificacao() {
		
		return 	(getSalario() *  0.10 )+ 10000;
	}
	
	
	

}
