// Exatamente Igual ao Produto
public class Produto {
    private String nome;
    private float precoCompra;
    private float precoVenda;
    private String descricao;

    public Produto(String nome, float precoCompra){
        setNome(nome);
        setPrecoCompra(precoCompra);
        setPrecoVenda((precoCompra * 1.3f));

    }

    public Produto(String nome, float precoCompra, float precoVenda){
        setNome(nome);
        setPrecoCompra(precoCompra);
        setPrecoVenda(precoVenda);
    }

    public void mostrarProduto(){
        System.out.println("Nome: " + nome + "\nPreco Compra: " + precoCompra + "\nPreco Venda: " + precoVenda + "\nDescricao: " + descricao);
    }


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(nome.length() > 2){
            this.nome = nome;
        }
    }

    public float getPrecoCompra(){
        return precoCompra;
    }
    public void setPrecoCompra(float precoCompra){
        if(precoCompra > 0){
            this.precoCompra = precoCompra;
        }
    }

    public float getPrecoVenda(){
        return precoVenda;
    }
    public void setPrecoVenda(float precoVenda){
        if(precoVenda > 0){
            this.precoVenda = precoVenda;
        }
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}