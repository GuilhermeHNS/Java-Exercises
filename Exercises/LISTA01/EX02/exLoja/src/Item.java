public class Item {
    private int codigo;
    private String desc;
    private int qntdCompraItem;
    private double precoItem;

    public Item(int codigo, String desc, int qntdCompraItem, double precoItem){
        this.codigo = codigo;
        this.desc = desc;
        this.qntdCompraItem = qntdCompraItem;
        this.precoItem = precoItem;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQntdCompraItem() {
        return qntdCompraItem;
    }

    public void setQntdCompraItem(int qntdCompraItem) {
        this.qntdCompraItem = qntdCompraItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public double getTotal() {
        return this.precoItem * this.qntdCompraItem;
    }   

    public void exibeDados(double precoTotal){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Descrição: "+ this.desc);
        System.out.println("Quantidade: "+ this.qntdCompraItem);
        System.out.println("Preço por unidade: "+this.precoItem);
        System.out.println("Preço total da compra: "+precoTotal);
    }

}
