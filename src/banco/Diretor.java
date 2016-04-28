package banco;

public class Diretor extends Gerente {

	public Diretor() 
	{
		super();
	}

	public Diretor(String nome, String departamento, double salario, String dataAdimissao, String rg)
	{
		super(nome, departamento, salario, dataAdimissao, rg);
		
	}

	@Override
	public double getBonificacao() {
		
		return super.getBonificacao() + 1500;
	}
	
	
	
	

}
