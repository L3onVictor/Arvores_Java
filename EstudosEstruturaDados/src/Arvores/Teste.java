package Arvores;

public class Teste {

	
	public static void main(String[] args) {
		No a = new No("A");
		No b = new No("B");
		No c = new No("C");
		No d = new No("D");
		No e = new No("E");
		No f = new No("F");
		
		
		a.setEsq(b);
		b.setEsq(c);
		b.setDir(d);
		a.setDir(e);
		e.setDir(f);
	
		a.preOrder();
		System.out.println();
		a.posOrder();
		System.out.println();
		a.emOrder();
		System.out.println();
		
		a.busca("C");
	}
	
}
