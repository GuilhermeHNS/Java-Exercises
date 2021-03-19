package com.company;

public class Aluno {

    private String nome;
    private int ra;
    private double altura;


    public Aluno(String nome, int ra, double altura){
        this.nome = nome;
        this.ra = ra;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
