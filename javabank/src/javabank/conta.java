package javabank;

import cliente.Cliente;

public class conta {
		
		private double saldo;
		private int agencia ;
		private int numero;
		private String Titular;
		String CPF;
		String profissao;
		private Cliente titular;
	
		 public void depositar(double valor) {
			this.saldo += valor;
		}
		 
		 public boolean saca(double valor){
			 if(this.saldo >= valor) {
			 this.saldo -= valor;
			 System.out.println("saque feito com suceso");
			 return true;
			 }else {
			 System.out.println("não há saldo suficiente, saque negado");
			 return false;
			}
		}
		 
		 public boolean transfere(double valor, conta destino) {
			if(this.saldo >= valor ) {
			this.saldo -= valor;
			destino.depositar(valor);
			System.out.println("transferencia feita com suceso");
			return true;
			} else {
			System.out.println("não há saldo suficiente, transferencia negada");
			return false;
		 }
		 } 
		 
		 public double getSaldo() {
			 return this.saldo;
		 }
		public double getNumero() {
		return this.numero;
 
		}
		public void setNumero(int novoNumero) {
			 this.numero = novoNumero;
			 
		}
		public int getagencia() {
			return agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		public void setTitular(Cliente  titular) {
			this.titular = titular;
		}
		public Cliente getTitular() {
			return titular;
		}

		public void setTitular(String string) {
			// TODO Auto-generated method stub
			
		}

}





