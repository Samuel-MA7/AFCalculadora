public class Calculadora {
    public double soma(double x, double y){
        return x + y;
    }

    public double subtracao(double x, double y){
        return x - y;
    }

    public double divisao(double x, double y){
        return x / y;
    }

    public double multiplicacao(double x, double y){
        return x * y;
    }

    public static double exponencial(double x, double y){
        return Math.pow(x, y);
    }

    public double raizQuadrada(double x){
        return Math.sqrt(x);
    }

    public double piso(double x){
        return Math.floor(x);
    }

    public double teto(double x){
        return Math.ceil(x);
    }

}
