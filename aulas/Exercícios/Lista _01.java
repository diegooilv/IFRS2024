// Lista de exercícios da aula de 09/04/24.

import java.util.Scanner;
class Lista_01 {
    public static void  main(String[] args){
        Lista();
    }

    static void Exercicio_01(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite seu sexo: [M ou F]");
        String sexo = sc.nextLine().toLowerCase();

        if(sexo.equals("m") || sexo.contains("masculino")){
            double pesoIdeal =  (72.7 * altura) - 58;
            System.out.printf("Peso ideal: %.1f kg!\n", pesoIdeal);
        }else if(sexo.equals("f") || sexo.contains("feminino")){
            double pesoIdeal =  (62.1 * altura) - 44.7;
            System.out.printf("Peso ideal: %.1f kg!\n", pesoIdeal);
        }else{
            System.out.println("Use o programa corretamente!");
        }
    }

    static void Exercicio_02(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso");
        double peso = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();

        double imc = peso / (altura*altura);
        if(imc <= 18.5){
            System.out.println("Classificação: Magreza");
            return;
        }else if(imc <= 24.9){
            System.out.println("Classificação: Normal");
            return;
        }else if(imc <= 29.9){
            System.out.println("Classificação: Sobrepeso (Obesidade I)");
            return;
        }else if(imc <= 39.9){
            System.out.println("Classificação: Obesidade (Obesidade II)");
            return;
        }else{
            System.out.println("Classificação: Obesidade Grave (Obesidade III)");
            return;
        }
    }

    static void Exercicio_03(){
        for(int i = 1; i <= 500; i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }
        }
    }

    static void Exercicio_04(){
        double juca = 0.6;
        double chico = 0.8;
        int i = 0;
        while(true){
            juca += 0.09;
            chico += 0.06;
            i++;
            if(juca > chico){
                System.out.printf("Levaram %d anos!\n", i);
                return;
            }
        }
    }

    static void Lista(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Deseja acessar qual exercício? [1 | 2 | 3 | 4]");
            int escolha = sc.nextInt();
            switch(escolha) {
                case 1:
                    Exercicio_01();
                    break;
                case 2:
                    Exercicio_02();
                    break;

                case 3:
                    Exercicio_03();
                    break;

                case 4:
                    Exercicio_04();
                    break;
            
                default:
                    System.out.println("Exercício inválido... Programa finalizado!");
                    return;
            }
        }
    }
}