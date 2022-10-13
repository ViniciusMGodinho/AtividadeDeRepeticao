import java.util.*;
public class E13 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Descubra quantas mulheres tem entre 20 e 40 anos!");

        //  Entrada
        int sexo, idade, resposta = 0;

        //  Processamento
        for (int i = 1; i<=10; i++) {
            System.out.println("Insira o sexo: (1 para H / 2 para M)");
            System.out.println("--------------------------------------");
            sexo = Entrada.nextInt();
            System.out.println("Insira a idade:");
            System.out.println("--------------------------------------");
            idade = Entrada.nextInt();

            if (sexo == 2 && (idade <= 40 && idade >= 20 )){
                resposta = resposta + 1;
            }if (i > 9){
                System.out.println("-----------------------------------------------------------");
                System.out.println("Existem " + resposta + " mulheres entre 20 e 40 anos!");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
}