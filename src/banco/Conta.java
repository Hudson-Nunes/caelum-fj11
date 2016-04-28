package banco;

public abstract class Conta {
	
	private static int contasCriadas=1;
	private  int numero;
	private double saldo;
	private double limite;
	Cliente titular;
	
	
	public Conta (double limite, Cliente c)
	{
		this.numero = contasCriadas;
		this.limite = limite;
		titular = c;
		contasCriadas++;
	}

	public abstract void atualiza (double taxa);
	
	public boolean saca(double valor)
	{
		if (saldo >= valor && saldo - valor >= 0)
		{
			saldo-=valor;
			return true;
		}
		return false;
	}
	
	public boolean deposita(double valor)
	{
		if (saldo+valor <= limite)
		{
			saldo+= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferePara (Conta destino, double valor)
	{
		if (getSaldo() >= valor && destino.getLimite() >= destino.getSaldo()+valor)
		{
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public void setNumero (int numero)
	{
		this.numero = numero;
	}
	
	public int getNumero ()
	{
		return numero;
	}
	
	public double getSaldo()
	{
		return saldo;
	}
	
	public void setLimite(double limite)
	{
		this.limite = limite;
	}

	public double getLimite ()
	{
		return limite;
	}

	public static int getContasCriadas()
	{
		return contasCriadas-1;
	}




}
