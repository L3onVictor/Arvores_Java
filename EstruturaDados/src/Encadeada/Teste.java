package Encadeada;

public class Teste {

	public static void main(String[] args) {
		
	Lista lista = new Lista();
	lista.insere(0);
	lista.insere(1);
	lista.insere(2);
	lista.insere(3);
	lista.insere(4);
	lista.insere(5);
	lista.imprime();
	
	lista.remove(0);
	lista.imprime();
	
	lista.remove(5);
	lista.imprime();
	
	lista.remove(2);
	lista.imprime();
	
	lista.remove(3);
	lista.imprime();
	
	lista.remove(4);
	
	lista.remove(1);
	lista.imprime();
	}
}
