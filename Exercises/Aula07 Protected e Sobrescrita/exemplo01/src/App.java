public class App {
    public static void main(String[] args) throws Exception {
        Aluno al1 = new Aluno(1234, "Tania", 23);
        Pessoa p1 = new Pessoa("Sabrina", 17);
        Monitor mn1 = new Monitor(600, 1234, "Palmira", 18);
        p1.mostraDados();
        System.out.println("=====================");
        al1.mostraDados();
        System.out.println("=====================");
        mn1.mostraDados();
    }
}