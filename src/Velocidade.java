public class Velocidade {
    
    public void velocidadeMedia(double sFinal, double sInicial, double tFinal, double tInicial){
        double deltaS = Calculadora.subtracao(sFinal, sInicial);
        double deltaT = Calculadora.subtracao(tFinal, tInicial);
        System.out.printf("A velocidade média é %.2f m/s" , Calculadora.divisao(deltaS, deltaT));
    }

}
