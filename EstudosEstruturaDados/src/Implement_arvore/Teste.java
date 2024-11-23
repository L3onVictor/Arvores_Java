package Implement_arvore;

public class Teste {
	
	public static void main(String[] args) {
		
		Arvore a = new Arvore();
	
		a.insere(5);
		a.insere(3);
		a.insere(4);
		a.insere(1);
		a.insere(2);
		a.insere(8);
		a.insere(6);
		a.insere(7);
		a.insere(9);
		a.insere(10);
		a.preOrder();
	System.out.println();
	a.emOrder();
	System.out.println();
	a.posOrder();
	System.out.println();
	a.buscar(8);
	
	a.minimo();
	System.out.println();
	a.maximo();
	}
	
	
 
}
