public class Moto implements Veiculo {
    @Override
    public void estacionar(){
        System.out.println("A moto foi estacionada.");
    }

    @Override
    public double calcularValorEstadia(int hora){
        return hora * 2.5;
    }
}