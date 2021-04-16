public class Pessoa {
    private String nome;
    private int idade;
    private int dia;
    private int mes;
    private int ano;

    
    public Pessoa(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }   
    //SOBRECARGA
    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    } 

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public int getDia() {
        return dia;
    }


    public void setDia(int dia) {
        this.dia = dia;
    }


    public int getMes() {
        return mes;
    }


    public void setMes(int mes) {
        this.mes = mes;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }

    public void calculaIdade(int anoAtual) {
        int idade = anoAtual-this.ano;
        this.setIdade(idade);
    }

    public void informaIdade(){
        System.out.println("Idade: "+this.idade);
    }

    public void informaNome(){
        System.out.println("Nome: "+this.nome);
    }

    public boolean validaData(int dia, int mes, int ano){
        if(dia>=1 && dia<=31 && mes>=1 && mes<=12 && ano >= 1000){
            return true;
        }
        else{
            return false;
        }
    }



  
    
}
