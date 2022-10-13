import java.util.*;
public class E14 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("How many men weigh between 60 - 80 Kg and Women between 50 - 7o Kg? ");

        //  Entry
        int sexo, peso, countH = 0, countM = 0;

        //  Process
        for (int i = 1; i<=10; i++) {
            System.out.println("Insira o sexo: (1 para H / 2 para M)");
            System.out.println("--------------------------------------");
            sexo = Entrada.nextInt();
            System.out.println("Insira o peso (em Kg):");
            System.out.println("--------------------------------------");
            peso = Entrada.nextInt();

            if (sexo == 1 && (peso <= 80 && peso >= 60 )){
                countH = countH + 1;
            }else if(sexo == 2 && (peso <=70 && peso >= 50)){
                countM = countM + 1;
            }if (i > 9){
                System.out.println("-----------------------------------------------------------");
                System.out.println("Existem " + countH + " homens entre 60Kg e 80Kg!");
                System.out.println("Existem " + countM + " mulheres entre 60Kg e 80Kg!");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
}