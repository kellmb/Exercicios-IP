public class Triangulo {
    private int base;
    private int altura;

    public int getBase(){
        return this.base;
    }

    public void setBase(int novoValor){
        this.base = novoValor;
    }

     public int getAltura(){
        return this.altura;
    }

    public void setAltura(int novoValor){
        this.altura = novoValor;
    }

    public int areaTriangulo(){
        int temp;
        temp = (this.getBase() * this.getAltura()) / 2;
        return temp;
        
    }
}
