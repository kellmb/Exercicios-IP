//import java.util.Scanner;
//import java.lang.Math;

public class Main{

    public static void  main(String args[]){
        
        //Scanner scan = new Scanner(System.in);

        Quadrado quad;
        quad = new Quadrado();

        Circulo medida;
        medida = new Circulo();

        Triangulo medidas;
        medidas = new Triangulo();

        quad.setLado(9);
        medida.setRaio(10.0f);
        medidas.setAltura(5);
        medidas.setBase(10);
        
        System.out.println("A área do quadrado é:");
        System.out.println(quad.areaQuadrado());
        System.out.println("A área do triangulo é:");
        System.out.println(medidas.areaTriangulo());
        System.out.println("A área do circulo e sua circuferência é:");
        System.out.println(medida.areaCirculo());
        System.out.println(medida.compCirculo());
            
    }    
}
