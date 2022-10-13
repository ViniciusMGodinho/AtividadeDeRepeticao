import java.util.*;
public class E17 {
    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);

        //  Entrada
        int idade, peso, quant = 0,p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0, p7 = 0, media;

        for(int i = 1; i <= 7; i++) {
            System.out.println("Informe sua idade: ");
            idade = Entrada.nextInt();
            System.out.println("-----------------------------------------");
            System.out.println("Informe seu peso(em Kg): ");
            peso = Entrada.nextInt();
            if ( i == 1) {
                p1 = idade;
            }else if ( i == 2){
                p2 = idade;
            }else if(i == 3){
                p3 = idade;
            }else if (i == 4){
                p4 = idade;
            }else if(i == 5){
                p5 = idade;
            }else if (i == 6){
                p6 = idade;
            }else {
                p7 = idade;

            }if (peso > 90){
               quant = quant + 1;

            } if (i > 6){
                System.out.println("-----------------------------------------");
                System.out.println(quant + " pessoas estão acima de 90Kg!");
                media = (p1+p2+p3+p4+p5+p6+p7)/7;
                System.out.println("A média das idades é: " + media);
                System.out.println("                                         -Fim do algoritimo");
            }
        }
    }
}
