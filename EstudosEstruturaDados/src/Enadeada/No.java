package Enadeada;

public class No {
	private int info;
	private No prox;

	public No(int valor) {
		this.info = valor;
		this.prox = null;
	}
	public No(int valor, No prox) {
		this.info=valor;
		this.prox=prox;
	}
	public int getValor() {
		return info;
	}
	public void setValor(int valor) {
		this.info = valor;
	}
	public No getProx() {
		return prox;
	}
	public void setProx(No prox) {
		this.prox = prox;
	}
	
}