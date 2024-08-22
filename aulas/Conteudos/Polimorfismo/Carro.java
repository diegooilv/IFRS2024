public class Carro implements Veiculo {
    @Override
    public void estacionar(){
        System.out.println("O carro foi estacionado.");
    }

    @Override
    public double calcularValorEstadia(int horas){
        return horas * 5.5;
    }
}
