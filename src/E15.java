import java.util.*;
public class E15 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Calcule a média das notas dos alunos ");

        //  Entrada
        int nota1, nota2, media, i;

        //  Repetição
        for (i = 1; i <= 3; i++) {
            System.out.println("Informe a 1 nota: ");
            nota1 = Entrada.nextInt();
            System.out.println("Informe a 2 nota: ");
            nota2 = Entrada.nextInt();
            media = (nota1 + nota2)/2;
            if (i == 1){
                System.out.println("A média do 1 aluno é: " + media);
            }else if(i == 2){
                System.out.println("A média do 2 aluno é: " + media);
            }else{
                System.out.println("A média do 3 aluno é:" + media);
            }
        }
    }
}
