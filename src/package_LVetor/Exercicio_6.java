package package_LVetor;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int []vetA = new int[6];
        int []vetB = new int[6];
        int []vetC = new int[6];

        System.out.print("Quantos Valores vai ter cada Vetor? ");
        int n = sc.nextInt();

        System.out.println("Digite os Valores do Vetor A: ");
        for (int i = 0; i < n; i++) {

            
            vetA[i] = sc.nextInt();          
        }
        System.out.println("Digite os Valores do Vetor B: ");
        for (int i = 0; i < n;i++) {
            
            vetB[i] = sc.nextInt();
            
            vetC[i] = vetA[i]+vetB[i];
            
        }
        System.out.println("Vetor Resultante: ");
        for (int i = 0; i < n;i++){

        System.out.println(vetC[i]);
        sc.close();
    }
    }
    
}
