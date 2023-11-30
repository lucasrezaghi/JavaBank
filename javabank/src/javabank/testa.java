package javabank;

public class testa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conta contaDoMatheus = new conta();
		contaDoMatheus.depositar(100);
		contaDoMatheus.depositar(600);
		System.out.print(contaDoMatheus.getSaldo());
	}

}
