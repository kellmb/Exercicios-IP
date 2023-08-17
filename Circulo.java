//import java.lang.Math.*;
public class Circulo {
	private float raio;

	public float getRaio(){
		return this.raio;
	}

	public void setRaio(float novoValor){
		this.raio = novoValor;
	}

	public float  compCirculo(){
		float comp ;

		comp = 20.0f * (float)Math.PI * this.getRaio();
		return comp;
		
	}
		public float  areaCirculo(){
		float area ;

		area = (float)Math.PI* (this.getRaio() * this.getRaio());
		return area;
	}
}