// 27/08/24
class App {
	public static void main(String[] args){
		Agenda agenda = new Agenda();
		agenda.addContato("Manoel", "Antonio", "user@teste.com", "555199999");
		agenda.addContato("Pedro", "Silva", "silva@teste.com", "555188888");
		agenda.acessarContatos();
		agenda.acessarContato("Manoel");
	}
}
