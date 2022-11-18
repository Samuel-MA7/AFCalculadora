import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static double x;
    static double y;
    static double z;

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

    public static double perguntaz() throws NumberFormatException, IOException{
        double z;
        System.out.println("Digite o valor de Z:");
        z = Double.parseDouble(reader.readLine());
        return z;
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        x = perguntax();
        y = perguntay();
        z = perguntaz();

        Bhaskara.bhaskara(x, y, z);
        String result[] = Bhaskara.bhaskara(x, y, z);
        System.out.println("X1 = " + result[0] + "\nX2 = " + result[1]);

        x = Double.parseDouble(result[0]);
        y = Double.parseDouble(result[1]);

        System.out.println("Somando X1 e X2 temos: " + BCalc.bcalc_soma(x, y));
        System.out.println("Dividindo X1 e X2 temos: " + BCalc.bcalc_divi(x, y));


        Quadrado q = new Quadrado();
        q.areaQuadrado(4.25);
        System.out.println();
        Velocidade v = new Velocidade();
        v.velocidadeMedia(200, 0, 60, 0);

        // EXECUÇÃO NO TERMINAL
        // A depender da versão do Java e do SDK, colocar vírgula ao "," de "."
        CalculoMedia cm = new CalculoMedia();
        cm.calcularMedia();

        CalculoGorjeta cg = new CalculoGorjeta();
        cg.calcularGorjeta();
    }
}