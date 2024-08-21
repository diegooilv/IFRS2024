class Herbivoro extends Animal {

    void comerPlantas() {
        System.out.println("O herbívoro está comendo plantas");
    }

    @Override
    void emitirSom() {
        System.out.println("O herbívoro está fazendo um som tranquilo");
    }
}
