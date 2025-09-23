package poo;

public class Funcionario {
//	Atributos:
	private String nome;
	private String cargo;
	private double salario;
	private int idade;
	
//	Construtor:
//	public Main(String nome, String cargo, double salario, int idade) {
//		this.nome = nome;
//		this.cargo = cargo;
//		this.salario = salario;
//		this.idade = idade;
//	}
	
	public void exibirInfo() {
		System.out.println("===========================================");
		System.out.println("Informações do funcionário: ");
		System.out.println("Nome: "+this.nome);
		System.out.println("Cargo: "+this.cargo);
		System.out.println("Salário: "+this.salario);
		System.out.println("Idade: "+this.idade);
		System.out.println("===========================================");
	}
	
//	Get:
	public String getnome() {
		return this.nome;
	}
	public String getcargo() {
		return this.cargo;
	}
	public double getsalario() {
		return this.salario;
	}
	public int getidade() {
		return this.idade;
	}
	
//	Set:
	public void setnome( String nome) {
		this.nome = nome;
	}
	public void setcargo( String cargo) {
		if (!cargo.isEmpty()) {	
			this.cargo = cargo;	
		}
		else {
			System.out.println("Cargo inválido!");
		}
	}
	
	public void setsalario( double salario) {
		if (salario >= 0) {
			this.salario = salario;
		}
		else {
			System.out.println("Salário inválido!");
		}
		
	}
	
	public void setidade(int idade) {
		
		if (idade <= 100) {
			this.idade = idade;
		}
		else {
			System.out.println("Idade inválida!");
		}
	}


  public static void main(String[] args) {
  		
  		Funcionario f1 = new Funcionario();
  		f1.setcargo("");
  		f1.setsalario(-500);
  		f1.setidade(200);
  		f1.exibirInfo();
  		
  	}

	
}
