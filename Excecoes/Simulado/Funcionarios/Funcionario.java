package Simulado;

public abstract class Funcionario {
	
	protected String nome;
	protected double salarioBase;
	
	public Funcionario(String nome) {
		this.nome = nome;
		this.salarioBase = 1500;
		
	}
	
	public abstract void calcularSalario();
	public abstract void exibirDados();
	
}
