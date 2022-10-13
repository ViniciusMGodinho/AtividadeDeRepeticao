import java.util.*;

public class E09 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Informe 10 numeros e descubra o maior e o menor");

        // Entrada
        int numero, maior, menor;

        System.out.println("informe o 1° número");
        numero = Entrada.nextInt();
        maior = numero;
        menor = numero;

        for(int i=2; i<=10; i++) {
            System.out.println("informe o " + i  + "° número");
            numero = Entrada.nextInt();
            if (numero > maior){
                maior = numero;
            } else if(numero < menor) {
                menor = numero;
            }
        }
        System.out.println("maior = " + maior);
        System.out.println("menor = " + menor);
        System.out.print("cabô");

    }
}