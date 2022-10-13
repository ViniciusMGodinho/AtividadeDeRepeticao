import java.util.*;

public class E11 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Calcule um numero elevado ao outro!");

        // Entrada
        int nElevado, nBase, potencia, resposta;

        System.out.println("informe o numero base: ");
        nBase = Entrada.nextInt();
        System.out.println("Informe o numero elevado: ");
        nElevado = Entrada.nextInt();

        resposta = nBase;
        // Repetição
        if (nElevado == 0) {
            System.out.println("---------------------------------------------------");
            System.out.println(nBase + "^" + nElevado + " = 1 ");
            System.out.println("---------------------------------------------------");
        } else {
            for (int i = 1; i <= nElevado; i++) {
                if (i == nElevado) {
                    System.out.println("---------------------------------------------------");
                    System.out.println(nBase + "^" + nElevado + " = " + resposta);
                    System.out.println("---------------------------------------------------");
                } else {
                    potencia = nBase * resposta;
                    resposta = potencia;
                }
            }
        }
    }
}