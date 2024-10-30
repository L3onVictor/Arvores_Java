package Pilha;

public class Pilha {
	private No topo;

	public Pilha() {
		this.topo = null;
	};

	public void push(int info) {
		No novo = new No(info, this.topo);
		this.topo = novo;
	};

	public void pop() {
		if (this.topo != null) {
			this.topo = this.topo.prox;
		}
	};

	public void imprimir() {
		if (this.topo == null) {
			System.out.println("Lista vazia!");
		}

		for (No aux = this.topo; aux != null; aux = aux.prox) {
			System.out.print(aux.getInfo() + " ");
		}
		System.out.println();
	};
}
