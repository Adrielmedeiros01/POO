package meuprojeto;


public class Funcionarios {

  // Atributos:
	protected String nome; //Tem que ser protected para as subclasses acessarem;
	protected double salario;
	protected String setor;
	
//	Construtor:
	public  Funcionarios(String nome, double salario, String setor) {
		this.nome = nome;
		this.salario = salario;
		this.setor = setor;
	}
	
//	Metodos:
	public void bonus(double valor) {
		this.salario += valor;
	}
	
	public void informacoes() {
		System.out.println("Nome do funcionáro: "+this.nome);
		System.out.println("salario final: "+this.salario);
		System.out.println("setor de atuação: "+this.setor);
		
	}
	
//	GET E SET:
	
	// public String getNome() {
	// 	return this.nome;
	// }
	
	// public void setNome(String nome) {
	// 	this.nome = nome;
	// }
	
	// public double getSalario() {
	// 	return this.salario;
	// }
	// public void setSalario(double salario) {
	// 	this.salario = salario;
	// }


	

}
