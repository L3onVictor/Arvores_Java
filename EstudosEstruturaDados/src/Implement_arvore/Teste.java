package Implement_arvore;

public class Teste {
	
	public static void main(String[] args) {
		
		Arvore a = new Arvore();
	
		a.insere(5);
		a.insere(3);
		a.insere(4);
		a.insere(15);
		a.insere(13);
		a.insere(20);
		a.insere(5);
		a.emOrder();
	System.out.println();
	a.preOrder();
	System.out.println();
	a.posOrder();
	}
	
	
 
}
