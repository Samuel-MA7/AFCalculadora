import java.util.Scanner;

public class CalculoMedia {
    public static void calcularMedia() {
        Scanner s = new Scanner(System.in);
        double n1, n2;
        System.out.println("Informe a primeira nota: \n");
        n1 = s.nextDouble();
        System.out.println("Informe a segunda nota: \n");
        n2 = s.nextDouble();

        Calculadora c = new Calculadora();
        double somaNotas = c.soma(n1, n2);
        double media = c.divisao(somaNotas, 2);
        System.out.println("A média das notas do aluno é de: " + media);
        if(media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media <= 6.9) {
            System.out.println("Aluno de recuperação");
        }

    }

}
