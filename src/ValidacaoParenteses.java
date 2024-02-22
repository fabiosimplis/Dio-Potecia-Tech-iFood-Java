import java.util.Scanner;

/*
* Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma determinada string é válida.
* Entrada
* Uma string é considerada válida se:
* Caracteres de abertura devem ser fechadas pelo mesmo tipo.
* Abertura devem ser fechados com uma chave correspondente.
* Uma string vazia é considerada válida.
*
* */

public class ValidacaoParenteses {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
        scanner.close();
    }

    /**
     * Método
     */
    static boolean ehValido(String s) {
        int tam = s.length()-1;

        if ((s.charAt(0) == '(') && (s.charAt(tam) == ')'))
            return true;
        if ((s.charAt(0) == '[') && (s.charAt(tam) == ']'))
            return true;
        if ((s.charAt(0) == '{') && (s.charAt(tam) == '}'))
            return true;

        return false;
    }
}