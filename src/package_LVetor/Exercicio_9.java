package package_LVetor;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String []vetNome = new String[5];
        int []vetIdade = new int[5];
        int maiorIdade = vetIdade[0];
        String nomeMvelho = "Nome";

        System.out.print("Quantas Pessoas voçê vai Digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "ª Pessoa:" );
            System.out.print("Nome: ");
            vetNome[i] = sc.next();
            System.out.print("Idade: ");
            vetIdade[i] = sc.nextInt();

            if (vetIdade[i] > maiorIdade) {
                maiorIdade = vetIdade[i];
                nomeMvelho = vetNome[i];
            }           
    }
    System.out.print("Pessoa Mais Velha: " + nomeMvelho);

        sc.close();
    
}
}
