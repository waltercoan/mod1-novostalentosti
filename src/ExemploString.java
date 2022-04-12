
import java.util.Arrays;
public class ExemploString {
    public static void main(String[] args) {
        String texto = "Universidade da Região de Joinville";
        char[] textoarray = texto.toCharArray();
        System.out.println(Arrays.toString(textoarray));

        System.out.println(texto.charAt(0));

    }
}
