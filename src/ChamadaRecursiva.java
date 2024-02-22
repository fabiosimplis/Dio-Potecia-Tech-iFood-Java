import java.util.Scanner;

public class ChamadaRecursiva {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int n = numero.nextInt();
        //TODO: Imprima o somatório de N (utilize o método "somatorio").
        int resultado = somatorio(n);
        System.out.println(resultado);
        numero.close();
    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}