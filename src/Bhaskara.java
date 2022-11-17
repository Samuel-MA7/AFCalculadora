public class Bhaskara {
    static double x1;
    static double x2;
    
    public static String[] bhaskara(double valorx, double valory, double valorz){
        double delta = 0;
        delta = (valory*valory - 4 * valorx * valorz);
        Calculadora.raizQuadrada(delta);
        
        x1 = (((-valory) + delta) / 2 * valorx );
        x2 = (((-valory) - delta) / 2 * valorx );

        return new String[] {Double.toString(x1), Double.toString(x2)};
    }

}
