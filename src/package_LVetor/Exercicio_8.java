package package_LVetor;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int []vet = new int[6];
        double media = 0;
        int soma = 0;
        int contSoma = 0;

        System.out.print("Quantos Elementos Vai Ter o Vetor?" );
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Digite Um Número: ");
            vet[i] = sc.nextInt();

            if (vet[i] % 2 == 0){
                soma += vet[i];
                contSoma++;   
            }        
    }
    if (soma > 0){
        media = (double) soma / (double) contSoma;
        System.out.print("Média Dos Pares = " + media);
        System.out.println();
    }
    else{
        System.out.println("Nenhum Número Par!");
    }
    sc.close();   
}  
}
