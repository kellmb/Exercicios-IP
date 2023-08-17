public class Quadrado {
	private int lado;

	public int getLado(){
		return this.lado;
	}

	public void setLado(int novoLado){
		this.lado = novoLado;
	}

	public int areaQuadrado(){
		int temp;
		temp = this.getLado() * this.getLado();
		return temp;
		
	}

	public int retornaArea(){
		int temp;
		temp = this.getLado() * this.getLado();
		return temp;	
	}
}