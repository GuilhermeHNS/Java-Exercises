import java.util.Calendar;
public class App {
    public static void main(String[] args) throws Exception {
        Calendar calendario = Calendar.getInstance();
        Pessoa pessoa01 = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa pessoa02 = new Pessoa(04,01,1643);

        int diaAtual = (int)calendario.get(Calendar.DAY_OF_MONTH);
        int mesAtual = (int)calendario.get(Calendar.MONTH);
        int anoAtual = (int)calendario.get(Calendar.YEAR);
        //Albert Einstein
        if(pessoa01.validaData(diaAtual, mesAtual, anoAtual)){
            
            pessoa01.calculaIdade(anoAtual);
            pessoa01.informaNome();
            pessoa01.informaIdade();

        }
        else{
            System.out.println("Data invalida");
        }

        //Isaac Newton
        pessoa02.setNome("Isaac Newton");
        if(pessoa02.validaData(diaAtual, mesAtual, anoAtual)){
            
            pessoa02.calculaIdade(anoAtual);
            pessoa02.informaNome();
            pessoa02.informaIdade();

        }
        else{
            System.out.println("Data invalida");
        }
        
    }
}
