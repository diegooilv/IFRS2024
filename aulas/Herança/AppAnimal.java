public class AppAnimal {
    public static void main(String[] args) {
        Mamifero leao = new Mamifero();
        leao.nome = "Leão";
        leao.temPelos = true;
        leao.dormir();
        leao.amamentar();

        Herbivoro cavalo = new Herbivoro();
        cavalo.nome = "Cavalo";
        cavalo.idade = 5;
        cavalo.dormir();
        cavalo.emitirSom();
        cavalo.comerPlantas();
    }
}
