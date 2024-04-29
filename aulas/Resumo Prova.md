## Variáveis

As variáveis em Java são utilizadas para armazenar dados que podem ser manipulados pelo programa. Cada variável possui um tipo de dado e um nome. Alguns dos tipos de dados primitivos em Java incluem:

- `int`: para armazenar números inteiros.
- `float` e `double`: para armazenar números de ponto flutuante.
- `String`: para armazenar sequências de caracteres.

Exemplo de declaração de variáveis em Java:

```java
int idade = 25;
float altura = 1.75f;
double pi = 3.14159265358979;
String nome = "João";
```

## Scanner

O `Scanner` é uma classe em Java que permite a leitura de entrada do usuário a partir do console. Ele é muito útil para interagir com o usuário e receber dados durante a execução do programa.

Exemplo de uso do Scanner em Java:

```java
import java.util.Scanner;
class ResumoProva_01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
```


## Estruturas de Repetição

As estruturas de repetição são utilizadas para executar um bloco de código repetidamente até que uma condição seja satisfeita. Em Java, existem três tipos principais de estruturas de repetição:

1. `for`: utilizado quando o número de iterações é conhecido antecipadamente.
2. `while`: utilizado quando a condição de término não é conhecida antecipadamente.
3. `do-while`: similar ao `while`, mas garante que o bloco de código seja executado pelo menos uma vez, mesmo que a condição seja falsa inicialmente.

Exemplo de uso do `for` em Java:

```java
for (int i = 0; i < 10; i++) {
    System.out.println("Número: " + i);
}
```

Exemplo de uso do `while` em Java:

```java
int i = 0;
while (i < 10) {
    System.out.println("Número: " + i);
    i++;
}
```

Exemplo de uso do `do-while` em Java:

```java
int i = 0;
do {
    System.out.println("Número: " + i);
    i++;
} while (i < 10);
```

## Condições

As estruturas de decisão em Java são utilizadas para controlar o fluxo do programa com base em condições específicas. As principais estruturas de decisão em Java são `if`, `else if` e `else`.

Exemplo de uso do `if` em Java:

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Você é maior de idade.");
} else {
    System.out.println("Você é menor de idade.");
}
```

Exemplo de uso do `else if` em Java:

```java
int nota = 80;

if (nota >= 90) {
    System.out.println("Aprovado com A");
} else if (nota >= 80) {
    System.out.println("Aprovado com B");
} else {
    System.out.println("Reprovado");
}
```
Você está correto, o `switch case` é outra estrutura de controle importante em Java. Vou adicionar essa parte ao README.md:

## Switch Case

O `switch case` é uma estrutura de controle de fluxo que permite avaliar uma expressão e executar diferentes blocos de código com base no valor dessa expressão. É útil quando há múltiplas condições a serem verificadas.

Exemplo de uso do `switch case` em Java:

```java
int codigoTransporte = 2;
String tipoTransporte;

switch (codigoTransporte) {
    case 1:
        tipoTransporte = "Carro";
        break;
    case 2:
        tipoTransporte = "Ônibus";
        break;
    case 3:
        tipoTransporte = "Trem";
        break;
    case 4:
        tipoTransporte = "Avião";
        break;
    default:
        tipoTransporte = "Meio de transporte não reconhecido";
        break;
}

System.out.println("Você está viajando de " + tipoTransporte);
```
# 
Resumo feito dia 29/04/24. Com auxílio de fontes educacionais!