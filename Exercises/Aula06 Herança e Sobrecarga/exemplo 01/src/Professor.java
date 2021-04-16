public class Professor extends Pessoa{
    private double salario;

    public Professor(double salario, String nome, int idade){
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
