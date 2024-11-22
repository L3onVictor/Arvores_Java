package Enadeada;

public class Lista {
	No ref;

	public Lista() {
		this.ref = null;
	}

	public boolean listaVazia() {
		if (ref == null)
			return true;
		return false;
	}

	public void insere(int info) {
		No novo = new No(info);
		if (listaVazia()) {
			this.ref = novo;
			ref.setProx(ref);
			return;
		}
		if (info < ref.getProx().getValor()) {
			novo.setProx(ref.getProx());
			ref.setProx(novo);
			return;
		}

		if (info >= ref.getValor()) {
			novo.setProx(ref.getProx());
			ref.setProx(novo);
			ref = novo;
			return;
		}

		for (No aux = ref.getProx(); aux != ref; aux = aux.getProx()) {
			if (info < aux.getProx().getValor()) {
				novo.setProx(aux.getProx());
				aux.setProx(novo);
				return;
			}
		}
	}

	public void remove(int info, boolean duplicados) {
		if (listaVazia()) {
			System.out.println("lista vazia");
			return;
		}

		No auxAnt = ref;
		No aux = ref.getProx();
		
		while (aux != ref) {

			if (info == aux.getValor()) {

				auxAnt.setProx(aux.getProx());
			if(!duplicados) {
				return;
			}
	}else {
			auxAnt = aux;
		}
			aux = aux.getProx();
		}

		if (info == ref.getValor()) {
	        auxAnt.setProx(ref.getProx());
	        ref = auxAnt;
	    }
		
		if(ref == ref.getProx() && info == ref.getValor()) {
			this.ref = null;
		}
	}

	public String imprime() {

		if (listaVazia()) {
			return "lista vazia";
		}
		if (ref.getProx() == ref) {
			return String.valueOf(ref.getValor());
		}

		StringBuilder sb = new StringBuilder();
		No aux = ref.getProx();
		while (true) {
			sb.append(aux.getValor()).append(" ");
			aux = aux.getProx();
			if (aux == ref.getProx()) {
				break;
			}
		}
		return sb.toString().trim();
	}
}