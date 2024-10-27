//Programa que imprime múltiplos de 7 entre 0 e 1000
public class questao01{
    public static void main(String[] args){
        for(int i=0; i<=1000; i++){
            if(i%7==0){
                System.out.println(i);
            }
        }
    }
}