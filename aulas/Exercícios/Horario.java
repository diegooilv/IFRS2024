// 18/06/24
public class Horario {
    private int hora;
    private int minuto;

    public Horario(int hora, int minuto) {
        if ((hora >= 0 && hora < 24) && (minuto >= 0 && minuto < 60)) {
            this.hora = hora;
            this.minuto = minuto;
        } else {
            this.hora = 0;
            this.minuto = 0;
        }
    }

    public void escreverHorario() {
        imprimirHorario(hora, minuto);
    }

    private void imprimirHorario(int hora, int minuto) {
        System.out.println(formatarHorario(hora, minuto));
    }

    private static String formatarHorario(int hora, int minuto) {
        String min;
        String hor;
        if(hora < 10){
            hor = "0" + hora;
        }else{
            hor = "" + hora;
        }
        if(minuto < 10){
            min = "0" + minuto;
        }else{
            min = "" + minuto;
        }
        return hor + ":" + min;
    }

    public static void main(String[] args) {
        Horario sair = new Horario(5, 55);
        Horario chegar = new Horario(12, 5);

        sair.escreverHorario();
        chegar.escreverHorario();
    }
}
