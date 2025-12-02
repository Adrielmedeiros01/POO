package Genericos;


public class Caixa<T> {

	protected T valor;
	
	

	
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	public T getValor() {
		return this.valor;
	}
}
