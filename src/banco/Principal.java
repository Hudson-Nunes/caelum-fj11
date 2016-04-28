package banco;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Cliente cl = new Cliente("Breno", "Oliveira", "08552242664");
		ContaCorrente c = new ContaCorrente(2000, cl);
		System.out.println(c.deposita(1000));
		
		Cliente cl1 = new Cliente("Roide", "Jorgi", "123321123");
		ContaCorrente c1 = new ContaCorrente(2000, cl1);
		System.out.println(c1.deposita(1000));
		
		Gerente f = new Gerente("Breno", "TI", 3200, "18/03/2018", "08552242664");
		f.imprimeDados();
		
		Gerente f1 = new Gerente("Breeeeeeeeeno", "TI", 5200, "18/03/2018", "08552242664");
		f1.imprimeDados();
		
		System.out.println("---------------------");

		ContaPoupanca cc = new ContaPoupanca(2000, cl);

		cc.deposita(1000);
		System.out.println(cc.getSaldo());
		cc.atualiza(1);
		System.out.println(cc.getSaldo());
		
		Diretor d = new Diretor("Materzao", "TI", 3200, "18/03/2018", "08552242664");
		d.imprimeDados();
		System.out.println(d.getBonificacao());
		System.out.println(f.getBonificacao());
		
		Presidente  p = new Presidente("Materzao REIREIREIREI", "TI", 3200, "18/03/2018", "08552242664");
		System.out.println(p.getBonificacao());
		

	
	}

}
