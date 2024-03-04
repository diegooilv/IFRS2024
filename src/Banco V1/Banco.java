public class Banco {
    private double saldo;
    private double limite;

    public double get_saldo(){
        return saldo;
    }

    public void set_saldo(double valor){
        if(valor >= 0){
            saldo = valor;
        }else{
            saldo = 0;
        }
        return;
    }

    public double get_limite(){
        return limite;
    }

    public void set_limite(double valor){
        if(valor >= 0 && valor <= (saldo*1.95)){
            limite = valor;
        }else{
            limite = 0;
        }
        return;
    }
}
