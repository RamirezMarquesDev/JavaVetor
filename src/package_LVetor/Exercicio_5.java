package package_LVetor;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double[]vet = new double[6];

        System.out.print("Quantos numeros você vai Digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um Número: ");
            vet[i] = sc.nextDouble();            
        }
        double test = vet[0];
        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (test < vet[i]) {
                test = vet[i];
                contador = i;
        }        
    }
    System.out.print("Maior Valor = " + test);
        System.out.println();
        System.out.print("Posição do Maior Valor: " + contador);

        sc.close();
    
}
}
