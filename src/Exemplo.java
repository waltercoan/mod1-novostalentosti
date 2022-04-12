import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numDigitado = 0;
        do{
            System.out.println("Não digite 30000");
            numDigitado = Integer.parseInt(leitor.nextLine());
            if(numDigitado != 30000){
                //aqui dentro voce faz toda a logica do programa
            }

        }while(numDigitado != 30000);
    }
}
    