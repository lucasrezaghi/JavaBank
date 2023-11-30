package javabank;

public class criarConta {
  
	public static void main(String[] args) {
		
		conta primeiraConta = new conta();
		primeiraConta.depositar(100);
		 System.out.println("o saldo da primeira conta é " + primeiraConta.getSaldo() + " reais.");
		 
		 primeiraConta.depositar(200);
		 System.out.println(primeiraConta.getSaldo());
		 
		 conta segundaConta = new conta();
		 segundaConta.depositar(50);
		
		 System.out.println("primeira conta = " + primeiraConta.getSaldo());
		 System.out.println("segunda conta = " + segundaConta.getSaldo());
		 
		 System.out.println(segundaConta.getNumero());
		 
		 
	 
	}
}