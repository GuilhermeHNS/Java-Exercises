public class App {
    public static void main(String[] args) throws Exception {
        Estoque produto01 = new Estoque("Impressora", 13, 6);
        Estoque produto02 = new Estoque("Monitor", 11, 13);
        Estoque produto03 = new Estoque("Mouse", 6, 2);

        produto01.darBaixa(5);

        produto02.repor(7);

        produto03.darBaixa(4);

        if(produto01.precisaRepor()){
            System.out.println("Estoque abaixo da quantidade minima");
        }
        else{
            System.out.println("Estoque acima da quantidade minima!");
        }

        if(produto02.precisaRepor()){
            System.out.println("Estoque abaixo da quantidade minima");
        }
        else{
            System.out.println("Estoque acima da quantidade minima!");
        }

        if(produto03.precisaRepor()){
            System.out.println("Estoque abaixo da quantidade minima");
        }
        else{
            System.out.println("Estoque acima da quantidade minima!");
        }

        produto01.mostra();

        produto02.mostra();

        produto03.mostra();

    }
}
