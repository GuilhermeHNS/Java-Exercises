/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03ex01;

/**
 *
 * @author guilh
 */
public class Aluno {
    //Atributos
    String nome;
    double altura;
    int ra;
    
    //Metodos
    public boolean estaAtivo(){
        if(ra>1000){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void escrever(){
        System.out.println("Nome do aluno: "+ nome);
    }
}
