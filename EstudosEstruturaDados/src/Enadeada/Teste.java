package Enadeada;

public class Teste {

	public static void main(String[] args) {
		Lista list = new Lista();
		
		list.insere(5);
		System.out.println(list.imprime());
		list.remove(5, false);
		System.out.println(list.imprime());
	}

}
