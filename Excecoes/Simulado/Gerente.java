package Simulado;

public class Gerente extends Funcionario{
	
	protected double bonus;
	
	public Gerente(String nome) {
		super(nome);
		this.nome = "Adriel";
		this.bonus = 2000.00;
		this.salarioBase = 1500.00;
	}
	
	public void calcularSalario() {
		double salario = this.salarioBase + this.bonus;
		System.out.println("Salário Gerente: R$" + salario);
	}
	
	public void exibirDados() {
		System.out.println("Nome do Gerente: "+ this.nome);
		calcularSalario();
	}


	
}
