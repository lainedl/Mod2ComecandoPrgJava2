package C_EntendendoMetodosJava.Ex2Quadrilateros; //Sobrecarga de métodos

public class Quadrilatero {

    public static double area(double lado){
        System.out.println(" Área do quadrado: " + lado * lado);
        return lado;
    }

    public static void area(double lado1, double lado2){
        System.out.println(" Área do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println(" Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void area(float diagoanl1, float diagoanl2){
        System.out.println(" Área do losango: " + (diagoanl1 * diagoanl2)/2);
    }



}
