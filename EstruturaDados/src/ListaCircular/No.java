package ListaCircular;

public class No {
	private int valor;
	private No prox;

	public No(int valor) {
		this.valor = valor;
		this.prox = null;
	}
	public No(int valor, No prox) {
		this.valor=valor;
		this.prox=prox;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public No getProx() {
		return prox;
	}
	public void setProx(No prox) {
		this.prox = prox;
	}
	
}
