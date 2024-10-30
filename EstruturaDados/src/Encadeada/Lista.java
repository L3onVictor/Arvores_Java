package Encadeada;

public class Lista {
	private No ref;

	public Lista() {
		this.ref = null;
	};

	public void insere(int info) {
		No novo = new No(info, ref);
		this.ref = novo;
	};

	public boolean listaVazia() {
		if (this.ref == null)
			return true;
		return false;
	};

	public void imprime() {
		if (listaVazia()) {
			System.out.println("A lista está vazia!");
			return;
		}
		for (No aux = ref; aux != null; aux = aux.getProx()) {
			System.out.print(aux.getInfo() + " ");
		}
		System.out.println();
	}
	public void remove(int info) {
		if (listaVazia()) {
			System.out.println("A lista está vazia!");
			return;
		}
		if(this.ref.getInfo() == info) {
			this.ref = this.ref.getProx();
			return;
		}
		for(No aux = ref; aux.getProx() != null; aux = aux.getProx()) {
			if(aux.getProx().getInfo() == info) {
				aux.setProx(aux.getProx().getProx());
			}
			if(aux.getProx() == null) return;
		}
	}
}
