package view;
import model.Lista;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
    Lista lista = new Lista();

    lista.adicionar("Banana");
    lista.adicionar("Maçã");
    lista.adicionar("Pera");
    lista.adicionar("Banana");
    lista.adicionar("Maçã");
    lista.adicionar("Banana");
    System.out.println(Arrays.toString(lista.getLista()));
    System.out.println(lista.getQuantidade());
    lista.remover("Banana");
    System.out.println(lista.getQuantidade());
    lista.remover("Banana");
    System.out.println(lista.getQuantidade());
    System.out.println(Arrays.toString(lista.getLista()));
    System.out.println(lista.getTamanhoVetor());

    }
}