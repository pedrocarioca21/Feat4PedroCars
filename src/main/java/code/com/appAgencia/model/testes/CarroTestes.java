package code.com.appAgencia.model.testes;

import code.com.appAgencia.model.domain.Carro;

public class CarroTestes {
	
	public static void main(String[] args) {

		Carro novo = new Carro("KPR-5I28",2014,"Renault","Sandero Stepway");
		
		System.out.println(novo.toString());
		
	}

}
