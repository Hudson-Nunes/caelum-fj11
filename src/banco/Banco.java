package banco;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private String cnpj;
	
	public void setFuncionario(Funcionario f)
	{
		funcionarios.add(f);
	}
	
	public ArrayList<Funcionario> getFuncionarios()
	{
		return funcionarios;
	}
	
	public boolean pertenceAoBanco(Funcionario f)
	{
		if (this.funcionarios.contains(f))
		return true;
		
		return false;
		
	}
}
