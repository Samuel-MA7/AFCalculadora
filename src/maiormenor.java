public class maiormenor {
    
    public static double tmm(double x, double y){
        double z = 0;
        if (x > y){
            z = x - y;
        }else if(x < y){
            z = y - x;
        }else{
            z = 0;
        }
        return z; 
    }


}
