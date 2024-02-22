import java.util.Scanner;

/*
* Neste desafio, você terá que criar uma função que faça um número como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz".
*
* Entrada
* Você receberá um número onde:
* Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ;
* Se o número for apenas múltiplo de 3 -> "Fizz" ;
* Se o número for apenas múltiplo de 5 -> "Buzz";
* Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido;
*
*
* */

public class FizzBUZZ {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num".
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.
        System.out.println(funcFizzBuzz(num));
        number.close();
    }

    /**
     * Método
     */
    static String funcFizzBuzz(int numero) {

        if ((numero % 3 == 0) && (numero % 5 == 0))
            return "FizzBuzz";
        else if (numero % 3 == 0)
            return "Fizz";
        else if (numero % 5 == 0)
            return  "Buzz";

        return String.valueOf(numero);

    }
}