/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author guilh
 */
import java.util.Scanner;
public class Aula02Ex01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int idade = 10;
        int cont = 0;
        int somaIdade = 0;
        float media = 0f;
        
        while(idade >= 0)
        {
            System.out.println("\nPara sair digite -1");
            System.out.println("\nDigite a idade da criança: ");
            idade = ler.nextInt();
            
            if(idade >=0){
                somaIdade+= idade;
                cont++;
            }
        }
        
        media = somaIdade/cont;
        System.out.println("\nA media das idades é: " + media);
        
    }
    
}
