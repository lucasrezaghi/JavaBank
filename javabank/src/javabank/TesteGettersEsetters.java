package javabank;

import cliente.Cliente;

public class TesteGettersEsetters {
	public static void main(String[] args) {
		conta conta = new conta();
		conta.setNumero(1);
		System.out.println(conta.getNumero());
		
		Cliente cliente = new Cliente();
		conta.setTitular(cliente);
		cliente.setCPF("111.111.111-11");
		
		System.out.println(conta.getTitular().getCPF());
	}
}

