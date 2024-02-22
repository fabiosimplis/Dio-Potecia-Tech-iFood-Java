import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Os Numeros sao iguais?");
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o Primeiro valor:");
        int A = leitor.nextInt();
        System.out.println("Digite o Segundo valor:");
        int B = leitor.nextInt();

        if (A == B)
            System.out.println("Sao iguais!");
        else
            System.out.println("Nao sao iguais!");

        leitor.close();
    }
}