import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        int idade = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua idade");
        idade = Integer.parseInt(leitor.nextLine());

        if (idade >= 18) {
            //ENTAO SIM (THEN)
            System.out.println("Voce é maior de idade");
        }else{
            //SENAO NÃO (ELSE)
            System.out.println("Voce é menor de idade");
        }
    }
}
