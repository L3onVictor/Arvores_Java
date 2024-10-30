package Pilha;

public class No {
	public No prox;
	private int info;
	
	public No(int info, No prox) {
		this.info=info;
		this.prox=prox;
	};
	public No(int info) {
		this.info=info;
		this.prox=null;
	}
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	};
}
