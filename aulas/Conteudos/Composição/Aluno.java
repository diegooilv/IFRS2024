public class Aluno {
    private Data nascimento;
    private String nome;

    // Construtor
    public Aluno(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    // Método para mostrar as informações do aluno
    public void mostrarAluno() {
        System.out.println("Nome: " + nome);
        nascimento.mostrarData();
    }
    
    public static void main(String[] args) {
        // Exemplo de uso
        Data dataNascimento = new Data(15, 8, 2005); // Data válida
        Aluno aluno = new Aluno("João Silva", dataNascimento);
        
        // Exibindo as informações do aluno
        aluno.mostrarAluno();
    }
}
