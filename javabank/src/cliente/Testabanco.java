package cliente;

import javabank.conta;

public class Testabanco {

	 public static void main(String[] args) {
		Cliente matheus = new Cliente();
		matheus.setNome("julia");
		matheus.setCPF("025-811-129-13");
		matheus.setProfissao("PROGAMADOR");
		
		conta contaDoMatheus = new conta();
		contaDoMatheus.depositar(100);

		
	}
}

