package javabank;

public class criaragencias {
	public static void main(String[] args){
		
		conta contaDoMatheus = new conta();
		contaDoMatheus.depositar(0);
		contaDoMatheus.depositar(1000);
		System.out.println(contaDoMatheus.getSaldo());
		
		contaDoMatheus.saca(500);
		System.out.println(contaDoMatheus.getSaldo());
		
		System.out.println("saldo do Matheus antes da transferencia é :" + contaDoMatheus.getSaldo());
		
		conta contaDaMaria = new conta ();
		contaDaMaria.depositar(1000);
		
		System.out.println("saldo da Maria antes da transferencia é : " + contaDaMaria.getSaldo());
		
		contaDaMaria.transfere(500 , contaDoMatheus);
		
		System.out.println("saldo da Maria após a transferencia é :" + contaDaMaria.getSaldo());
		System.out.println("saldo do Matheus após a transferencia é :" + contaDoMatheus.getSaldo());
		
		contaDoMatheus.setTitular("Matheus De Souza");
		System.out.println(contaDoMatheus);
		
		
		
		
	}	
}



