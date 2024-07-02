class ContaCorrente {
    String nomeCliente;
    int numero;
    double saldo;

    ContaCorrente(String nomeCliente, int numero, double saldo){
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.saldo = saldo;
    }

    void depositar(double deposito){
        if(deposito > 0){
            saldo += deposito;
        }else{
            System.out.println("Usa o sistema de maneira correta parceiro!");
        }
    }

    void sacar(double saque){
        if(saque > 0 && saque <= saldo){
            saldo -= saque;
        }else if(saque > 0){
            System.out.printf("Falta dinheiro na conta parceiro! (R$ %.2f)", (saque - saldo));
        }else {
            System.out.println("Usa o sistema de maneira correta parceiro!");  
        }
    }

    void imprimirExtrato(){
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Numero: " + numero);
        System.out.printf("Saldo: %.2f reais\n", saldo);
        System.out.println("------------------------------------");
    }

    public static void main(String[] args){
        ContaCorrente conta01 = new ContaCorrente("Carolina", 40028922, 10000.9);
        ContaCorrente conta02 = new ContaCorrente("Ana Clara", 89763733, 2000);

        conta01.depositar(100);
        conta01.sacar(50);
        conta01.imprimirExtrato();

        conta02.depositar(20);
        conta02.sacar(500);
        conta02.imprimirExtrato();
    }
}