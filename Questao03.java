// Verifica se o número é um número perfeito
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva um numero inteiro:");
        int numero = scan.nextInt();
        int aux = 0;
        for(int i = 1; i <= numero/2;i++){
            if(numero%i == 0){
                aux+=i;
            }
        }
        if(aux == numero){
            System.out.println("O numero " + numero + " é um número perfeito");
        } else{
            System.out.println("O numero " + numero + " não é um número perfeito");
        }
    }
}
