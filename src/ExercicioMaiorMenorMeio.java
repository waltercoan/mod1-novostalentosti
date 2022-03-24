import java.util.Scanner;

public class ExercicioMaiorMenorMeio {
    public static void main(String[] args) {
        int num1=0, num2=0, num3=0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        num1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o segundo numero");
        num2 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o terceiro numero");
        num3 = Integer.parseInt(leitor.nextLine());

        if (num1 > num2){
            //aqui1
            if (num1 > num3){
                //aqui2 ||||||||||||||||||
            }else{
                //aqui3 |
            }
        }else{
            //aqui4

        }
    }
}
