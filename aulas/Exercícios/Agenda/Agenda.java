import java.util.ArrayList;
public class Agenda{
	private ArrayList<Contato> contatos = new ArrayList<Contato>();
	public Agenda(){
		contatos = new ArrayList<>();
	}
	

	public void addContato(String nome, String sobrenome, String email, String numero){
		Contato contato = new Contato(nome, sobrenome, email, numero);
		contatos.add(contato);	
	}

	public void removeContato(String numero){
		for(Contato contato : contatos){
			if(contato.getNumero().equals(numero)){
				contatos.remove(contato);
			}else{
				System.out.println("Contato Inexistente");
			}
		}

	}

	public void acessarContatos(){
		for(Contato contato : contatos){
			System.out.printf("\nNome: %s %s\nEmail: %s\nNumero: %s\n", contato.getNome(), contato.getSobrenome(), contato.getEmail(), contato.getNumero());
		}
	}

	public void acessarContato(String nome){
		System.out.println();
		for(Contato contato : contatos){
			if(contato.getNome().equals(nome.trim())){
				System.out.println("Contato Encontrado!!");
				System.out.printf("Nome: %s %s\nEmail: %s\nNumero: %s\n", contato.getNome(), contato.getSobrenome(), contato.getEmail(), contato.getNumero());
				return;
			}
		}
		System.out.println("Contato Inexistente");

	}


}
