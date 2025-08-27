package meuprojeto;

public class Vendendor extends Funcionarios{

//	O construtor é obrigatório para o extends
	public Vendendor(String nome, double salario, String setor) {
//		Sem o super tu teria que construir um contrutor do zero;
		super(nome, salario, setor); //Serve para acessar os atributos e metodos da classe mãe (Funcionarios);]
		
	}
	
}
