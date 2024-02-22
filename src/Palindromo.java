import java.util.Scanner;

/*
* Neste desafio você deverá construir uma função que recebe uma String
* e identifique se a mesma é um palíndromo, ou seja,
* se a String é igual a ela mesma invertida.
* Dado que temos a String "digital" uma vez invertida temos "latigid" que são diferentes.
*
* Logo, NÃO é um Palíndromo.
*
* Já se recebemos a string "radar" uma vez invertida temos "radar" que são iguais.
*
*
* */

public class Palindromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.
        System.out.println(ehPalindromo(palavra));
        sc.close();
    }

    /**
     * Método
     */
    static String ehPalindromo(String palavra) {

        for (int i = 0,  j = (palavra.length() - 1) ;
             (i <= palavra.length() && j >= 0) ;
             i++, j--){

            if (palavra.toLowerCase().charAt(i) != palavra.toLowerCase().charAt(j))
                return "FALSE";
        }
        return "TRUE";
    }
}