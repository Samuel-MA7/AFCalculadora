import java.util.Scanner;

public class CalculoGorjeta {
    public static void calcularGorjeta() {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o total da conta:\n");
        double totalConta = s.nextDouble();
        Calculadora c = new Calculadora();
        double gorjeta = c.multiplicacao(totalConta, 0.1);
        double novoTotal = c.soma(totalConta, gorjeta);
        System.out.println("Você vai receber de gorjeta: R$ " + gorjeta);
        System.out.println("O novo total da conta é de: R$ " + novoTotal);
    }
}
