import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static double x;
    static double y;

    public static double perguntax() throws NumberFormatException, IOException{
        double x;
        System.out.println("Digite o valor de X:");
        x = Double.parseDouble(reader.readLine());
        return x;
    }

    public static double perguntay() throws NumberFormatException, IOException{
        double y;
        System.out.println("Digite o valor de Y:");
        y = Double.parseDouble(reader.readLine());
        return y;
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        x = perguntax();
        y = perguntay();


        System.out.println("A divisao de " + x + " e " + y + " é " + Calculadora.divisao(x, y) + " e o seu resto é " + Resto.resto(x, y));
        System.out.println("A subtraçao do maior número pelo menor é " + maiormenor.tmm(x, y));
        
        
        Quadrado q = new Quadrado();
        q.areaQuadrado(4.25);
        System.out.println();
        Velocidade v = new Velocidade();
        v.velocidadeMedia(200, 0, 60, 0);
    }
}