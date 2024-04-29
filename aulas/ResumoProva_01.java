// Importação da Classe "Scanner" (Para ser possível a utilização do 'input')
import java.util.Scanner;
class ResumoProva_01 {
    // Método Main: Raiz da Classe (O que irá ser executado de fato)
    public static void main(String[] args){
        // Definição de Variáveis: 
        // -> TipoDaVariável nomeDaVariável = valor; (O valor deve corresponder ao tipo!!!);
        String varString = "Valor Literal";
        int varInteiro = 1; // Valor Inteiro (...-1, 0, 1, 2...)
        float varFlutuante = 1.89f; // Valor "quebrado"/com vírgula. (Usado em casos de poucas casas decimais e é necessário terminar o valor com um "f")
        double varDuplo = 1.9929198292929; // Valor com várias casas decimais!

        Scanner sc = new Scanner(System.in);
        String scString = sc.nextLine(); // Recebe valores literais.
        int scInt = sc.nextInt(); // Recebe valores inteiros;
        sc.nextLine(); // "Limpa" o terminal.
        float scFloat = sc.nextFloat(); // Recebe valores flutuantes.
        sc.nextLine(); // "Limpa" o terminal.
        double scDouble = sc.nextDouble(); // Recebe valores double.
        sc.nextLine(); // "Limpa" o terminal.

        // Operações Aritméticas 
        double valor01 = 5.5;
        double valor02 = 2.2;
        System.out.println("Adição: " + (valor01 + valor02)); // 5,5 + 2,2 = 7,7! Operador: "+";
        System.out.println("Subtração " + (valor01 - valor02)); // 5,5 - 2,2 = 3,3! Operador: "-";
        System.out.println("Multiplicação " + (valor01 * valor02)); // 5,5 * 2,2 = 12,1! Operador: "*";
        System.out.println("Divisão " + (valor01 / valor02)); // 5,5 / 2,2 = 2,5; Operador: "/";
        System.out.println("Resto de Divisão: " + (5%2)); // 5 / 2 = 4, sobra **1** (Resposta do operador "%" nesse caso); 
        // -> O Módulo ou Resto de Divisão é para ser utilizado em casos de números Inteiros, em valores decimais pode ser não intuitivo! (Pouca Precisão);

        // Operadores Lógicos + Estrutura de Decisão:
        // .equals() equivale ao "==" em python!
        // && = and do Python; "e"
        // || = or do Python; "ou"
        // ! = not do Python; "não"
        String var = "Ola";
        String varz = "Bom dia";
        if(var.equals("Ola") && varz.equals("Moça")) {
            // Verifica se a variável "var" é igual a "Ola" e se a variável "varz" é igual a "Moça".
            // Se ambas as condições forem verdadeiras, o bloco de código dentro deste if será executado.
            // Caso contrário, o fluxo de controle passará para o próximo bloco else if.
        }else if (var.equals("Ol") || var.equals("O")) {
            // Verifica se "var" tem valor igual a "Ol" ou se ela tem valor igual a "O".
            // Se uma das condições for verdadeira, o bloco de código dentro deste else if será executado.
            // Como é impossível uma variável ter dois valores simultaneamente, esta condição provavelmente não será verdadeira.
            // Se nenhum dos blocos if ou else if anteriores for executado, o fluxo de controle passará para este bloco.
        }else if (var.equals("Ola") || varz.equals("Moça")) {
            // Aqui você pode adicionar o código que deseja executar se uma das condições for verdadeira.
            // Se a primeira condição não for verdadeira, mas pelo menos uma das variáveis for igual a "Ola" ou "Moça",
            // o bloco de código dentro deste else if será executado.
        }else {
            // Este bloco é executado quando nenhuma das condições anteriores for verdadeira.
        }

        // Switch Case
        String mes = "Setembro";
        // switch (variável que deseja ser utilizada para as comparações)
        switch(mes) {
            case "Janeiro":
            // case "valor desejado"
                // Bloco de comando a ser executado.
                System.out.println("O mês é janeiro");
                break;
                // No final de cada caso (case) é necessário usar um "break" (encerrar";)
            // [...]
            case "Setembro":
                System.out.println("O mês é setembro");
                break;

            default:
            // Se nenhum caso der verdadeiro, será executado o bloco de código dentro do "default".
                System.err.println("Mês inválido");
                break;
        }

        // Estrutura de repetição: (For we While)
        for(int i = 0; i <= 100; i++){
            // i++ significa que a cada repetição do laço, será adicionado 1 ao valor da variável.
            // equivalente a "i = i +1";
            System.out.println(i);
        }

        int i = 0;
        while(i <= 100){
            // Enquanto essa condição for verdadeira, o laço será executado!
            System.out.println(i);
            i++;
        }
        // -> Nesses casos acima, os dois laços fazem a mesma coisa!! É importante entender quando utilizar cada um.
        // Use o laço 'for' quando você souber exatamente quantas iterações serão necessárias, como percorrer uma coleção de tamanho conhecido.
        // Use o laço 'while' quando você não souber antecipadamente quantas iterações serão necessárias e desejar que o loop seja executado enquanto uma condição específica for verdadeira.


        // Extra
        // Use o loop 'do-while' quando você desejar que o bloco de código seja executado pelo menos uma vez, independentemente da condição, e depois repetido enquanto a condição especificada for verdadeira.

        do {
            // Será executado apenas uma vez.
            System.out.println("Uma vez");
        } while (false);
    }

}