public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    //CONSTRUTORES
    public Estoque() {

    }

    public Estoque(String nome, int qtdAtual, int qtdMinima){
        this.nome = nome;
        //verifica se a quantidade não é negativa
        if(verificaQtdAtual(qtdAtual))
        {
            this.qtdAtual = qtdAtual;
        }
        else{
            this.qtdAtual = 0;
            System.out.println("Valor invalido. O valor armazenado foi 0");
        }

        if(verificaQtdMinima(qtdMinima)){
            this.qtdMinima = qtdMinima;
        }
        else{
            this.qtdMinima = 0;
            System.out.println("Valor invalido. O valor armazenado foi 0");
        }

    }

    //GETS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    //METODOS
    public void repor(int qtd){
        this.qtdAtual += qtd;
    }

    public void darBaixa(int qtd){
        this.qtdAtual -= qtd;
    }

    public boolean verificaQtdAtual(int qtdAtual){
        if(qtdAtual > 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean verificaQtdMinima(int qtdMinima){
        if(qtdMinima > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean precisaRepor(){
        if(this.qtdAtual < this.qtdMinima){
            return true;
        }
        else{
            return false;
        }
    }

    public void mostra(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Quantidade minima: "+this.qtdMinima);
        System.out.println("Quantidade atual "+this.qtdAtual );
        if(precisaRepor()){
            System.out.println("Estoque atual abaixo da quantidade minima!");
        }
        else{
            System.out.println("Estoque OK");
        }
    }
    


}
