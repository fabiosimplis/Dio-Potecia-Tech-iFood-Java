import java.util.Scanner;

/*
* Uma busca sequencial se caracteriza por percorrermos
* todos os  elementos de uma estrutura em busca do elemento “X” desejado.
* Neste desafio, dada uma estrutura de vetor A [a1, a2...an],
* percorra todo o vetor fazendo as comparações de A[N] = X.
* Caso a condição seja verdadeira,
* “X” existe na estrutura e a busca será concluída com sucesso.
*
*
* */

public class BuscaSequencial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.
        int num = leitor.nextInt();
        System.out.println(buscaSequencial(elementos, num));
        leitor.close();
    }

    /**
     * Método
     */
    static String buscaSequencial(int[] lista, int numeroProcurado) {

        for (int pos = 0 ; pos < lista.length ; pos++){

            if (lista[pos] == numeroProcurado){
                return String.format("Achei %d na posicao %d", numeroProcurado, pos);
            }
        }
        return String.format("Numero %d nao encontrado!", numeroProcurado);

    }
}