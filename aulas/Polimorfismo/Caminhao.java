public class Caminhao implements Veiculo {
    @Override
    public void estacionar(){
        System.out.println("O caminhão foi estacionado.");
    }

    @Override
    public double calcularValorEstadia(int horas){
        return horas * 15;
    }
}
