package model;
import java.util.Arrays;

public class Lista{
    private String[] lista;
    private int quantidade;

    public Lista(){
        lista = new String[5];
        quantidade = 0;
    }

    public String[] getLista(){
        return Arrays.copyOf(lista,quantidade);
    }

    public int getQuantidade(){
        return quantidade;
    }
    public int getTamanhoVetor(){
        return lista.length;
    }

    public boolean adicionar(String nome){
        if(quantidade >= lista.length){
            aumentarLista();
        }
        lista[quantidade++] = nome;
        return true;
    }

    public void aumentarLista(){
        lista = Arrays.copyOf(lista, quantidade+5);
    }

    public boolean remover(String string){
        int index = buscar(string);
        if(index < 0){
            return false;
        }
        for(int i = index; i < quantidade-1; i++){
            lista[i] = lista[i+1];
        }
        quantidade--;
        return true;
    }

    public int buscar(String nome){
        for(int i = 0; i < quantidade; i++){
            if(lista[i] == nome){
                return i;
            }
        }
        return -1;
    }

}
