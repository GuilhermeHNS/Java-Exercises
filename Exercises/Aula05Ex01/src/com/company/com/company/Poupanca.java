package com.company;

public class Poupanca {
    private static double taxaJurosAnual;
    private double saldo;


    public Poupanca(double taxaJurosAnual, double saldo){
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = saldo;
    }


    public static double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }


    public static void setTaxaJurosAnual(double taxaJurosAnual) {
        Poupanca.taxaJurosAnual = taxaJurosAnual;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    



}

