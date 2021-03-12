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
public class Aula03Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        aluno01.altura = 1.82;
        aluno01.nome = "Guilherme";
        aluno01.ra = 19239;
        aluno01.escrever();

        
        
        Disciplina disciplina01 = new Disciplina();
        disciplina01.escreveDados();
        
        
    }
    
}
