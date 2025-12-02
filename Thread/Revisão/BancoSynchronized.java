package Thread;

public class BancoSynchronized {
	
	protected String nome;
	protected int saldo;
	
	public BancoSynchronized(String nome) {
		this.nome = nome;
		this.saldo = 100; 
	}
	
	
	
	public synchronized void sacar(int saque) {
		try {
			if(saque <= this.saldo) {
				this.saldo = this.saldo - saque;
				System.out.println("Saque realizado por "+this.nome+" com sucesso!");
				System.out.println("Saldo atual: R$"+ this.saldo);
			}
			
			else {
				System.out.println("Saldo insuficiente!");
				System.out.println("Saldo atual: R$"+ this.saldo);
			}
			Thread.sleep(1000);
		}
		
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
