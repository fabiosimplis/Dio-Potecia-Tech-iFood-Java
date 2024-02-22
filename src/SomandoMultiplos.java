import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o Numero:");
        int A = leitor.nextInt();
        System.out.println("Digite o limite");
        int N = leitor.nextInt();
        int soma = 0;
        int multiplo = 0;
        for (int i = 1 ; multiplo < N ; i++ ){
            multiplo = A * i;
            soma += multiplo;
        }
        System.out.println(soma);
        leitor.close();
    }
}