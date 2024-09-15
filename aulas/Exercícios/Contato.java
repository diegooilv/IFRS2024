public class Contato {
    private String nome;
    private String numero;
    private String email;

    public Contato(String nome, String numero, String email){
        setNome(nome);
        setNumero(numero);
        setEmail(email);
    }
    //
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if((!nome.isEmpty()) && nome.length() >= 3){
            this.nome = nome;
        }else{
            System.out.println("Escolha um nome válido!");
        }
    }
    //
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        if(numero.length() >= 3 && numero.length() <= 16){
            this.numero = numero;
        }else{
            System.out.println("Escolha um numero válido!");
        }
    }
    //
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        if(email.contains("@")){
            this.email = email;
        }else{
            System.out.println("Escolha um email válido!");
        }
    }

    public String mostrarContato(){
        return "| Nome: " + nome + " | Numero: " + numero + " | Email: " + email + " |\n";
    }

    // -> Método main apenas para testes!! <-
    public static void main(String[] args){
        System.out.println();
        // Exemplo sem erros!
        Contato professor = new Contato("Marco", "(51) 9 9999-9999", "marcoprofessor@teste.com");
        System.out.println(professor.mostrarContato());
        // Exemplo com erros!
        Contato aluno = new Contato("#", "12", "emailinexistente");
        System.out.println(aluno.mostrarContato());
    }
}