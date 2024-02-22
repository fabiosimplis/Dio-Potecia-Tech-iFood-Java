import java.util.Scanner;

/*
* Dado um inteiro n, retorne o menor número de números quadrados perfeitos
* cuja soma seja n. Um quadrado perfeito é um inteiro que é o quadrado de um inteiro;
* em outras palavras, é o produto de algum inteiro consigo mesmo.
* Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são.
*
*
* */

public class ClassificandoMatrizes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
        int [] nums = new int[N];
        //int [] nums = {4, 3, 1, 2, 4};
        //int [] nums = {5, 1, 3, 4, 5, 2};
        for (i = 0; i < N; i++)
        {
            nums[i] = input.nextInt();
        }
        //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares

        nums = retiraSeHaIguais(nums);
        nums = colocaParesInicio(nums);

        for (var entry : nums) {
            System.out.println(entry);
        }
    }

    static int[] colocaParesInicio(int[] list){

        for (int i = 0; i < list.length; i++){

            for (int j = i + 1; j < list.length; j++){

                if (list[j] % 2 == 0 && list[i] % 2 != 0){
                    int aux = list[i];
                    list[i] = list[j];
                    list[j] = aux;
                }
            }
        }
        return list;
    }

    static int[] retiraSeHaIguais(int[] list){

        int[] listaCopia = list;

        for (int i = 0; i < listaCopia.length; i++){
            for (int j = i + 1; j < listaCopia.length; j++ ){
                if (listaCopia[i] == listaCopia[j]) {
                    int[] novaLista = new int[(listaCopia.length - 1)];
                    int pos = 0;
                    for (int z = 0; z < listaCopia.length; z++) {
                        if (z != i) {
                            novaLista[pos] = listaCopia[z];
                            pos++;
                        }
                    }
                    listaCopia = novaLista;
                }
            }
        }
        return listaCopia;
    }
}