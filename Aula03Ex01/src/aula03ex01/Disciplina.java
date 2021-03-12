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
public class Disciplina {
    //atributos
    String nomeDisciplina;
    String descricao;
    double cargaHoraria;
    int codigo;
    
    
    
    //metodos
    
    void escreveDados(){
        System.out.println("Nome: "+nomeDisciplina);
        System.out.println("Codico: "+codigo);
        System.out.println("Carga Horária: "+cargaHoraria);
        System.out.println("Descrição: "+descricao);
    }



    
}
