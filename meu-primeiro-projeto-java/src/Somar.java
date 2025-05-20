public class Somar {
    public static void main(String[] args){
        int valor1=2,valor2=3;
        int ress= somar(valor1,valor2);

        System.out.println(valor1 + " + " + valor2 + " = " + ress);
    }
    public static int somar(int n1, int n2){
        int resultado= n1 + n2;

        return resultado;
    }
}
