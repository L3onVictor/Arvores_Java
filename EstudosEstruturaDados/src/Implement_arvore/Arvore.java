package Implement_arvore;

public class Arvore {
	private No ref;

	public void insere(int info) {
		
		No novo = new No(info);
		
		if (this.ref == null) {
			this.ref = novo;
			
			return;
		}
		
		No aux = ref;
		
		while(true) {
			if(info < aux.getInfo()) {
				if(aux.getLeft() == null) {
					
					aux.setLeft(novo);
					
					return;
					
				}aux = aux.getLeft();
			}
			if(info >= aux.getInfo()) {
				if(aux.getRight() == null) {
					
					aux.setRight(novo);
					
					return;
					
				} aux = aux.getRight();
				
			}
		}
		/*
		if(info < ref.getInfo()) {
			if (ref.getLeft() == null) {				
				ref.setLeft(novo);
			}
		}
		if(info >= ref.getInfo()) {
			if(ref.getRight()== null) {
			ref.setRight(novo);
			}
			
		}*/
	}
	
	public void preOrder() {
		if (ref != null) {
			ref.preOrder();
		}
	}
	
	public void emOrder() {
		if (ref != null) {
			ref.emOrder();
		}
	}
	
	public void posOrder() {
		if (ref != null) {
			ref.posOrder();
		}
	}
	
	public void buscar(int valor) {
		
		if(ref != null) {
			ref.buscar(valor);
		}
		
	}
	public void minimo() {
		No aux = ref;
		No min = null;
		while(aux != null) {
			min = aux;
			aux = aux.getLeft();
		}
		System.out.println("O menor valor é: "+ min.getInfo());
	}
	
	public void maximo() {
		No aux = ref;
		No max = null;
		while(aux != null) {
			max = aux;
			aux = aux.getRight();
		}
		System.out.println("O maior valor é: "+ max.getInfo());
	}
	
	

}

