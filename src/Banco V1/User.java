public class User {
    public static void main(String[] args){
        Banco paulo = new Banco();
        paulo.set_saldo(100);
        System.out.print(paulo.get_saldo());
    }
}