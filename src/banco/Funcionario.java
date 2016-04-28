package banco;

public abstract class Funcionario {
	
	private String nome;
	private String departamento;
	private double salario;
	private String dataAdimissao;
	private String rg;
	
	public Funcionario (String nome, String departamento, 
										double salario, String dataAdimissao,
										String rg)
	{
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.dataAdimissao = dataAdimissao;
		this.rg = rg;
	}
	
	public Funcionario(){}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataAdimissao == null) ? 0 : dataAdimissao.hashCode());
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (dataAdimissao == null) {
			if (other.dataAdimissao != null)
				return false;
		} else if (!dataAdimissao.equals(other.dataAdimissao))
			return false;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}

	public void imprimeDados()
	{
		System.out.println("\nNome: " + this.getNome());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Salário: " + this.getSalario());
		System.out.println("Data de Admissão: " + this.getDataAdimissao());
		System.out.println("RG: " + this.getRg());
	}
	
	public void recebeAumento(double aumento)
	{
		salario+= aumento;
	}

	public double getGanhoAnual ()
	{
		return salario*12;
	}
	
	public abstract double getBonificacao();

	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {

		return nome;
	}
	
	public String getDataAdimissao() {

		return dataAdimissao;
	}
	
	public String getRg() {
		return rg;
	}
	
	
	
	
	
	
}
