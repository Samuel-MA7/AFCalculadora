import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        double x;
        double y;
        
        System.out.println("Digite o valor de X:");
        x = Double.parseDouble(reader.readLine());
        System.out.println("Digite o valor de Y:");
        y = Double.parseDouble(reader.readLine());
        
        Resto r = new Resto();
        System.out.println(r.resto(x, y));
         
        
        Quadrado q = new Quadrado();
        q.areaQuadrado(4.25);
        System.out.println();
        Velocidade v = new Velocidade();
        v.velocidadeMedia(200, 0, 60, 0);
    }
}
