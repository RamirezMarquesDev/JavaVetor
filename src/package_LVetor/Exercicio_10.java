package package_LVetor;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

        System.out.print("Quantos Alunos Serão Digitados? ");
        int n = sc.nextInt(); 
        
        String []vetNome = new String[n];
        double []vetSemestre1 = new double[n];
        double []vetSemestre2 = new double[n];
        
        for(int i = 0; i < n; i++) {

            sc.nextLine();

            System.out.println("Digite Nome, Primeira e Segunda Nota do " + (i + 1) + "º Aluno: ");        
            vetNome[i] = sc.nextLine();            
            vetSemestre1[i] = sc.nextDouble();          
            vetSemestre2[i] = sc.nextDouble();
                        
        }
        System.out.println("Aluno(s) Aprovado(s): ");
        for(int i = 0; i < n; i++) {
            if (vetSemestre1[i] + vetSemestre2[i] >= 12.0){
                System.out.println(vetNome[i]);
            }
        }
       sc.close();
    }    
}
