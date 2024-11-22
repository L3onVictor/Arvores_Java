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
	
	

}

