public class Contato{
	private String nome;
	private String sobrenome;
	private String email;
	private String numero;

	public Contato(String nome, String sobrenome, String email, String numero){
		setNome(nome);
		setSobrenome(sobrenome);
		setEmail(email);
		setNumero(numero);
	}
	
	public String getNome(){
		return nome;
	}
	public String getSobrenome(){
		return sobrenome;
	}
	public String getEmail(){
		return email;
	}
	public String getNumero(){
		return numero;
	}
	//
	public void setNome(String nome){
		if(! nome.trim().isEmpty()){
			this.nome = nome;
		}else{
			System.out.println("Nome Inválido");
		}
	}
	public void setSobrenome(String sobrenome){
		if(!sobrenome.trim().isEmpty()){
			this.sobrenome = sobrenome;
		}else{
			System.out.println("Sobrenome Inválido");
		}
	}
	public void setEmail(String email){
		if(email.contains("@")){
			this.email = email;
		}else{
			System.out.println("Email Inválido");
		}
	}
	
	public void setNumero(String numero){
		System.out.println(numero);
		for(int i = 0; i < numero.length(); i++){
			char letra = numero.charAt(i);
			if(!"0123456789-".contains(String.valueOf(letra))){
				System.out.println("Numero Inválido");
				return;
			}
		}
		if(!(numero.length() >= 9 && numero.length() <= 15)){
			System.out.println("Numero Inválido");
				return;
		}

		this.numero = numero;
	}

}
