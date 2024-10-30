package Encadeada;

public class No {
	int valor;
	No prox;

	public No(int valor) {
		this.valor = valor;
		this.prox = null;
	}
		public No(int valor, No prox) {
			this.valor=valor;
			this.prox=prox;
		}
}
