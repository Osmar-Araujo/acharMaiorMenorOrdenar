
package ordenamaiormenor;
import java.util.Scanner;

public class OrdenaMaiorMenor {
    int valores [] = new int [5];
    Scanner entrada = new Scanner(System.in);
    
    public void lerValor(){
        for(int i = 0;i < 5; i++) {   
            System.out.println("Entre com os valor "+ (i+1) +":");   
            valores[i] = entrada.nextInt();
        }
        
        System.out.println("\n");
    } 
    public void achaMaior(){
        int maior = 0;
        for (int i = 0; i <5;i++){
            if (valores[i] > maior){
                maior = valores[i];
            }
        }
        System.out.println("O maior valor digitado é: " + maior);
    }
    
    public void achaMenor(){
       int menor = Integer.MAX_VALUE;
        for (int i = 0; i <5;i++){
            if (menor > valores[i]){
                menor = valores[i];
            }
        }
        System.out.println("O menor valor digitado é: " + menor);
    }
    
    public void selectionSort(){
        int it,i, temp;
        int posMenorInicial;
        int posMenor;
        
        for (it = 0; it < valores.length-1; it++ ){
            posMenorInicial = it;
            posMenor = it + 1;
            for (i = posMenorInicial +1; i < valores.length; i++){
                if (valores[i] < valores[posMenor]){
                    posMenor = i;                    
                }  
            }
            if (valores[posMenor] < valores[posMenorInicial]){
                    //troca
                    temp = valores[posMenorInicial];
                    valores[posMenorInicial] = valores[posMenor];
                    valores[posMenor] = temp;
            }            
        }
       System.out.println("\n");
    }
    
    public void mostraVetor(){
        for (int i = 0; i < valores.length; i++){            
            System.out.print (valores[i] + " ");
        }
        System.out.println(" ");
    }  
    
    public void somaVetor(){
        int soma = 0;
        for (int i = 0; i < 5; i++){
            soma = soma + valores[i];
        }
        System.out.println("O resultado da soma é: " + soma);
    }
    public static void main(String[] args) {
       OrdenaMaiorMenor mmo = new OrdenaMaiorMenor();
       mmo.lerValor();
       mmo.achaMaior();
       mmo.achaMenor();
       mmo.selectionSort();
       mmo.mostraVetor();
       mmo.somaVetor();
    }
    
}  