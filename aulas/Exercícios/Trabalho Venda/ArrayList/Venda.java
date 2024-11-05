import java.util.ArrayList;

public class Venda {
    private String nomeCli;
    private ArrayList<Produto> produtos;
    private float total;

    public Venda(String nome){
        nomeCli = nome;
        produtos = new ArrayList<>();
    }
    public void adicionarItem(Produto p){
        produtos.add(p);
        total += p.getPrecoVenda();
        System.out.println("Item adicionado com sucesso!");
    }

    public void imprimirNota(){
        System.out.println("----------------------------------------------------");
        System.out.println("Nome: " + nomeCli);
        System.out.printf("Valor total a ser pago: R$ %.2f\n", total);
        System.out.println("Produtos comprados:");
        for(Produto produto : produtos){
            System.out.printf(produto.getNome() + " -- R$ %.2f", produto.getPrecoVenda());
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
