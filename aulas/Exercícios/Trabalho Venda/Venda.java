public class Venda {
    private String nomeCli;
    private Produto[] produtos;
    private float total;
    private int prox;

    public Venda(String nome){
        nomeCli = nome;
        produtos = new Produto[10];
        prox = 0;
    }
    public void adicionarItem(Produto p){
        if(prox == 10){
            System.out.println("A lista de itens está cheia!");
        }else{
            produtos[prox] = p;
            prox++;
            total += p.getPrecoVenda();
            System.out.println("Item adicionado com sucesso!");
        }
    }

    public void imprimirNota(){
        System.out.println("----------------------------------------------------");
        System.out.println("Nome: " + nomeCli);
        System.out.printf("Valor total a ser pago: R$ %.2f\n", total);
        System.out.println("Produtos comprados:");
        for(int i = 0; i < prox; i++){
            System.out.printf(produtos[i].getNome() + " -- R$ %.2f", produtos[i].getPrecoVenda());
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
    }

    public static void main(String[] args){
        Produto carro = new Produto("Carro", 10000);
        Produto casa = new Produto("Casa", 50000, 100000);
        Produto pacoca = new Produto("Pacoca", 1.5f);
        Venda venda1 = new Venda("Diego");
        venda1.adicionarItem(carro);
        venda1.adicionarItem(casa);
        venda1.adicionarItem(pacoca);
        venda1.imprimirNota();


    }
}
