package Arvores;

public class No {
	private String info;
	private No dir;
	private No esq;

	public No(String info) {
		this.info = info;
		this.dir = null;
		this.esq = null;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public No getDir() {
		return dir;
	}

	public void setDir(No dir) {
		this.dir = dir;
	}

	public No getEsq() {
		return esq;
	}

	public void setEsq(No esq) {
		this.esq = esq;
	}

	public void preOrder() {
		System.out.print(this.info + " ");

		if (this.esq != null) {
			this.esq.preOrder();
		}

		if (this.dir != null)
			this.dir.preOrder();
	}

	public void emOrder() {
		if (this.esq != null) {
			this.esq.emOrder();
		}
		System.out.print(this.info + " ");

		if (this.dir != null) {
			this.dir.emOrder();
		}
	}

	public void posOrder() {

		if (this.esq != null) {
			this.esq.posOrder();
		}

		if (this.dir != null) {
			this.dir.posOrder();
		}
		System.out.print(this.info + " ");
	}

	public void busca(String valor) {
		if (this.info.equals(valor)) {
			System.out.println("Valor encontrado: " + this.info);
			return;
		}

		// while(!(this.info.equals(valor))){
		if (this.esq != null) {
			this.esq.busca(valor);
		}
		if (this.dir != null) {
			this.dir.busca(valor);
		}
		if (this.esq == null && this.dir == null) {
			System.out.println("Valor não encontrado");
		}    
	}
}
