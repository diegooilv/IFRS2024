import java.time.LocalDate;
public class Data {
    private int dia;
    private int mes;
    private int ano;
    public Data(int dia, int mes, int ano){
        this.dia = setDia(dia);
        this.mes = setMes(mes);
        this.ano = setAno(ano);
    }

    private int setDia(int dia){
        if(dia > 0 && dia < 32){
            return dia;
        }
        return 0;
    }
    private int setMes(int mes){
        if(mes > 0 && mes < 13){
            return mes;
        }
        return 0;
    }
    private int setAno(int ano){
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        if(ano > 1900 && ano <= anoAtual){
            return ano;
            }
        return 0;
    }

    private String msgPrint(){
        String[] meses = {"", "janeiro", "fevereiro", "março", "abril", "maio", "junho", "Julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        String mensagem = "Dia: " + dia + ", mês: " + meses[mes] + ", ano: " + ano;
        return mensagem;
    }

    public void mostrarData(){
        System.out.println(msgPrint());
    }
}
