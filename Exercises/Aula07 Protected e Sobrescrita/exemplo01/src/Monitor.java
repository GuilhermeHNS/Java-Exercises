public class Monitor extends Aluno{
    private double bolsa;

    public Monitor(double bolsa, int ra, String nome, int idade){
        super(ra,nome,idade);
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    @Override

    public void mostraDados(){
        super.mostraDados();
        System.out.println("Bolsa: R$"+this.bolsa);
    }
}
