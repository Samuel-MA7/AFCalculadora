import java.util.Scanner;

public class Circunferencia {

    public void areaCircunferencia(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Informe o raio da circunferencia:");
        double r = s1.nextDouble();
        System.out.printf("Área da circunferencia é %.2f cm²\n" , 2 * 3.14 * Calculadora.exponencial(r, 2));
    }

}