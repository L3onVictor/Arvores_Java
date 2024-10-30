package Pilha;

public class Teste {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		pilha.imprimir();
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.imprimir();
		pilha.pop();
		pilha.imprimir();
		pilha.pop();
		pilha.imprimir();
		pilha.pop();
		pilha.imprimir();
		pilha.push(10);
		pilha.imprimir();
	}
}
