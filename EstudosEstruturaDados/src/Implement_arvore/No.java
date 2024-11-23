package Implement_arvore;

public class No {
	private int info;
	private No right;
	private No left;
	
	public No (int info) {
		this.info = info;
		this.left = null;
		this.right = null;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public No getRight() {
		return right;
	}

	public void setRight(No right) {
		this.right = right;
	}

	public No getLeft() {
		return left;
	}

	public void setLeft(No left) {
		this.left = left;
	}
	
	/*public void emOrder() {
		if (this.left != null) {
			this.left.emOrder();
		}
		System.out.print(this.info + " ");

		if (this.right != null) {
			this.right.emOrder();
		}
	}
	*/
	
	public void preOrder() {
		System.out.print(this.info + " ");

		if (this.left != null) {
			this.left.preOrder();
		}

		if (this.right != null) {
			this.right.preOrder();
		}
	}
	
	public void emOrder() {
		if (this.left != null) {
			this.left.emOrder();
		}
		System.out.print(this.info + " ");

		if (this.right != null) {
			this.right.emOrder();
		}
	}
	
	public void posOrder() {

		if (this.left != null) {
			this.left.posOrder();
		}

		if (this.right != null) {
			this.right.posOrder();
		}
		System.out.print(this.info + " ");
	}
	
	public void buscar(int valor) {
		
			boolean find = false; 
		if(info == valor) {
			System.out.println("Valor encontrado: " + valor);
			find = true;
			return;
		}
		if (this.left != null) {
			this.left.buscar(valor);
		}

		if (this.right != null) {
			this.right.buscar(valor);
		}
		
	}
	
	
}
