package javabank;

public class TesteSaqueNegativo {
 public static void main(String[] args){
	 
	 conta conta = new conta();
	 conta.depositar(200);
	  conta.saca(200);
	  System.out.println(conta.getSaldo());
 }
}

