import java.util.Scanner;

public class App {

    public static void print(Funcionario funcionario){

        System.out.println("/////////////////////////////////////");
        System.out.println("Dados do funcionario: ");
        System.out.println("Nome: "+ funcionario.getNome());
        System.out.println("Sobrenome: "+ funcionario.getSobrenome());
        System.out.println("Salário: "+ funcionario.getSalarioMensal());
        System.out.println("/////////////////////////////////////");
    }

    public static boolean verificaSalario(Funcionario funcionario){
        if(funcionario.getSalarioMensal() < 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static double retornaAumento(Funcionario funcionario){
        double aumento = funcionario.getSalarioMensal() * 0.1;
        return aumento;
    }


    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        Funcionario fn1 = new Funcionario(" ", " ", 0);
        Funcionario fn2 = new Funcionario(" ", " ", 0);

        //Entradas do primeiro funcionário
        System.out.println("Digite o nome do primeiro funcionario: ");
        fn1.setNome(teclado.next());
        System.out.println("Digite o sobrenome do primeiro funcionario:");
        fn1.setSobrenome(teclado.next());
        System.out.println("Digite o salario do primeiro funcionario");
        fn1.setSalarioMensal(teclado.nextDouble());

        //Verificando se o salario é maior que 0
        if(verificaSalario(fn1)){
            fn1.setSalarioMensal(0);
        }

        //Exibindo os dados do primeiro funcionario
        print(fn1);

        //Entradas do segundo funcionario
        System.out.println("Digite o nome do segundo funcionario: ");
        fn2.setNome(teclado.next());
        System.out.println("Digite o sobrenome do segundo funcionario:");
        fn2.setSobrenome(teclado.next());
        System.out.println("Digite o salario do segundo funcionario");
        fn2.setSalarioMensal(teclado.nextDouble());

        //Verificando se o salario é maior que 0
        if(verificaSalario(fn2)){
            fn2.setSalarioMensal(0);
        }
        //Exibindo os dados do segundo funcionário
        print(fn2);

        //Aplicando aumento aos funcionarios
        fn1.setSalarioMensal(fn1.getSalarioMensal() + retornaAumento(fn1));
        fn2.setSalarioMensal(fn2.getSalarioMensal() + retornaAumento(fn2));

        //Exibindo dos dados novamente mas agora com aumento
        print(fn1);
        print(fn2);
    }
}
