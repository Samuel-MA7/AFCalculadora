import java.util.Scanner;

public class Triângulo {
    public void areaTriangulo(){
        Scanner s2 = new Scanner(System.in);
        System.out.println("base do triangulo:");
        double b = s2.nextDouble();
        System.out.println("altura do triangulo:");
        double h = s2.nextDouble();
        System.out.printf("Área do triângulo é %.2f cm²" , Calculadora.divisao(Calculadora.multiplicacao(b, h), 2));
    }
}
