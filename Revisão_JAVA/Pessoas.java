package meuprojeto;

public class Pessoas {

//	Atributos:
	public String nome;
	public int idade;
	public boolean andando = false;
	
//	Construtor:
	public Pessoas (String nome, int idade) {
		this.nome = nome;		
		this.idade = idade;
	}
	
//	Métodos:
	void andar() {	
		System.out.println(this.nome+" está andando...");
		this.andando = true;
	}
	
	void parar() {
		System.out.println(this.nome +" parou...");
		this.andando = false;
	}

	
//	Métodos especiais GET E SET:
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
















// package meuprojeto;

// public class Pessoas {

// 	public String nome;
// 	public String endereco;
// 	public String cpf;
	
	
// 	void apresentação() {
// 		System.out.println("Olá, eu sou "+nome+" possuo CPF: "+cpf+" e moro no endereço "+endereco);
// 	}
	
// 	public void setnome(String nome) {
// 		this.nome = nome;
// 	}
// 	public void setendereco(String endereco) {
// 		this.endereco = endereco;
// 	}
	
	
// 	public void setcpf(String cpf) {
// 		this.cpf = cpf;
// 	}

// }

