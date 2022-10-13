import java.util.*;

class E10 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Calcule a fatorial de um número:");

        // Entrada
        int numero, fatorial;

        System.out.println("informe um número");
        numero = Entrada.nextInt();
        fatorial = numero;

        System.out.print(numero + "!= ");
        // Repetição
        for (int i = fatorial; i >= 1; i--) {
            if (i == 1) {
                System.out.println(i);
            } else {
                System.out.print(i + " x ");
            }
        }
    }
}