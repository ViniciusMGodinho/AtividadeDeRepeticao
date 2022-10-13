import java.util.*;
public class E16 {
    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Descubra a maior e a menor nota!");

        //  Entrada
        int maior, menor, nota;

        System.out.println("Insira a 1 nota:");
        nota = Entrada.nextInt();

        maior = nota;
        menor = nota;
        // processamento
        for (int i = 1; i <= 4; i++){
            System.out.println("Informe outra nota: ");
            nota = Entrada.nextInt();
            if (nota > maior){
                maior = nota;
            }else if(nota < menor){
                menor = nota;
            }
            if(i > 3){
                System.out.println("A maior nota é: " + maior + " E a menor nota é: " + menor);
            }
        }
    }
}
