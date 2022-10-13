import java.util.*;

 public class E12 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        // Entrada
        int numero, imp;

        System.out.println("Informe um número");
        numero = Entrada.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Os números impares até " + numero + " são: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //  Repetição
        for (int i = 1; i <= numero; i++) {
            if(i % 2 != 0){
                System.out.println("|" + i + "|");
            }
        }
    }
}