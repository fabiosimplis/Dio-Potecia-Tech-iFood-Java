import java.util.Arrays;
import java.util.Scanner;

/*
* Dado um inteiro n, retorne o menor número de números quadrados perfeitos
* cuja soma seja n. Um quadrado perfeito é um inteiro que é o quadrado de um inteiro;
* em outras palavras, é o produto de algum inteiro consigo mesmo.
* Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são.
*
*
* */

public class QuadradosPerfeitos {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int[] d = new int[n];

        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.
        int tam = 0;
        for (int i = 1 ; (i * i < n) ; i++){
            d[i] = i * i;
            tam++;
        }

        int qdt = n;
        for (int i = tam ; i > 0 ; i--) {
            int pos = i;
            int result = n;
            int count = 0;
            while (result != 0) {

                if ((result - d[pos]) >= 0) {
                    result = result - d[pos];
                    count++;
                } else {
                    pos--;
                    if (pos < 0)
                        break;
                }
            }

            if (count < qdt)
                qdt = count;
        }

        System.out.println(qdt);
    }


}