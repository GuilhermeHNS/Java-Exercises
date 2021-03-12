/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeaula01;

import java.util.Scanner;
public class TesteAula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade;
        String nome;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        
        System.out.println("Digite seu nome: ");
        nome = ler.next();
        
        System.out.println("você se chama "+nome+" e tem "+idade+" anos");
    }
    
}
