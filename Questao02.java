//Programa que calcula as raízes de uma equação de segundo grau

import java.util.Scanner; // Importa lib de scanner
import java.lang.Math; // lib de operações matemáticas

public class Questao02{

    public static void main(String[] args){
        double discriminante, raiz1, raiz2;
        Scanner scanner = new Scanner(System.in); // Define a variável scanner do tipo Scanner e invoca uma função de "novo scanner" KKKKKKKKKKKKK
        System.out.println("Digite os coeficientes de a:");
        double a = scanner.nextInt();
        System.out.println("Digite os coeficientes de b:");
        double b = scanner.nextInt();
        System.out.println("Digite os coeficientes de c:");
        double c = scanner.nextInt();

        if(a == 0){
            System.out.println("O coeficiente \"a\" deve ser diferente de zero.");
            return;
        }

        discriminante = b * b - 4 * a * c;

        if(discriminante > 0){
            raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("As raízes são: " + raiz1 + " e " + raiz2);
        }
        else if(discriminante == 0){
            raiz1 = -b / (2 * a);
            System.out.println("A raiz é: " + raiz1);
        }
        else {
            double pt_real = -b / (2* a);
            double pt_imaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("As raízes são: " + pt_real + " + " + pt_imaginaria + " e " + pt_real + " - " + pt_imaginaria);
        }
    }
}