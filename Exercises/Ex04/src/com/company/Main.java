package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Aluno al1 = new Aluno();

        al1.setNome("Guilherme");
        al1.setRa(19239);
        al1.setAltura(1.82);


        System.out.println("Nome: " + al1.getNome());
        System.out.println("RA: " + al1.getRa());
        System.out.println("Altura: "+ al1.getAltura());

    }
}
