// Calcula o fatorial de forma recursiva
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num = scan.nextInt();
        System.out.print(Recursivo(num));
    }

    public static int Recursivo(int n){
        if(n == 1){
            return 1;
        } else{
            return n = n * Recursivo(n-1);
        }
    }

}
