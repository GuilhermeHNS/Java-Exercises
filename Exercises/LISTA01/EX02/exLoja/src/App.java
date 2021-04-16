import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner ler = new Scanner(System.in);
        Item bolaFutebol = new Item(1, "Bola de futebol", 0, 50);
        Item luvaGoleiro = new Item(2, "Luva para goleiro", 0, 75);
        Item chuteiraJogador = new Item(3, "chuteira para jogar futebol", 0, 100);
        Item itens[] = new Item[3];

        itens[0] = bolaFutebol;
        itens[1] = luvaGoleiro;
        itens[2] = chuteiraJogador;


        while(true){
            int i = 0;
            System.out.println("Digite o codigo do produto: ");
            int codigo = ler.nextInt();

            if(codigo == itens[i].getCodigo()){
                System.out.println("Digite a quantidade de produdos que você deseja: ");
                itens[i].setQntdCompraItem(ler.nextInt());
                double precoTotal = itens[i].getTotal();
                itens[i].exibeDados(precoTotal);
                break;
            }
            i++;
        }


    }
}
