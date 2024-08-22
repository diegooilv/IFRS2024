public class Estacionamento {
    public void gerenciarVeiculo(Veiculo veiculo, int horas) {
        veiculo.estacionar();
        double valor = veiculo.calcularValorEstadia(horas);
        System.out.println("Valor da estadia: R$ " + valor);
    }

    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        Veiculo caminhao = new Caminhao();
        
        estacionamento.gerenciarVeiculo(carro, 2); 
        estacionamento.gerenciarVeiculo(moto, 3); 
        estacionamento.gerenciarVeiculo(caminhao, 1); 
    }
}
