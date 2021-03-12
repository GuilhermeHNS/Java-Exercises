/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02ex02;
import java.util.Scanner;
/**
 *
 * @author guilh
 */
public class Aula02Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int cont = 0;
        double preco = 0;
        double lucro = 0;
        
        for(cont = 0; cont<=20; cont++){
            System.out.println("\nDigite o valor do produto ");
            preco = ler.nextDouble();
            
            if(preco<100)
            {
                lucro = 20;
            }
            else
            {
                lucro = 50;
            }
            
            System.out.println("\nO preço do produto é: " + preco);
            System.out.println("\nO lucro é de: R$" + lucro);
        }
    }
    
}
