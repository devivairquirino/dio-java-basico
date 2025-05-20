public class Bhaskara{
    public static void main(String[] args){
        double[] resultado= calcular(3,5,2);
        System.out.println("x1= "+resultado[0]+" x2= "+resultado[1]);
    }
    public static double[] calcular(int a, int b, int c){
        double delta= (Math.pow(b, 2))-4*a*c;
        double x1= ((-b) + Math.sqrt(delta))/(2*a);
        double x2= ((-b) - Math.sqrt(delta))/(2*a);
        double [] ress={x1,x2};
        return ress;
    }
}