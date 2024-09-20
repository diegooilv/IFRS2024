# Conceitos de Programação Orientada a Objetos

## Abstração
Abstração consiste em simplificar a complexidade de um sistema, focando apenas nos atributos e comportamentos essenciais de um objeto para a aplicação, deixando de lado detalhes desnecessários para a implementação.
```java
class Cliente {
    // O Cliente possuí uma infinidade de características e comportamentos, porém só usarei o que for conveniente dentro do sistema! 
    // Nesse contexto bancário, apenas o que interessa ao banco!

    // Atributos (Apenas Ilustrativo)
    String cpf;
    String nome;
    String endereco;
    double saldo;

    // Métodos (Apenas Ilustrativo)
    void sacar(){
        [...]
    }
    void depositar(){
        [...]
    }
}
```

## Classe
Classe é um modelo ou molde que define um conjunto de atributos e métodos que os objetos criados a partir dela terão. É usada para representar entidades ou conceitos no código, fornecendo a estrutura para criar objetos com características e comportamentos específicos.

```java
class Pessoa {
    // Atributos
    String nome;
    int idade;
    // Métodos
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void falar(){
        System.out.println("Ola");
    }
}
```
## Objeto
Objeto é uma instância de uma classe, ou seja, é a materialização de um modelo de classe com valores específicos para seus atributos e comportamentos definidos pelos métodos. Cada objeto criado a partir de uma classe possui sua própria identidade e estado.

```java
public class Cidade {
    public static void main(String[] args){
        Pessoa pessoa01 = new Pessoa("João", 30);
        pessoa01.falar();
    }
}
```

## Métodos
Métodos são funções associadas a uma classe ou objeto, que definem comportamentos específicos, permitindo que os objetos realizem ações ou modifiquem seu estado. Eles descrevem as operações que um objeto pode realizar ou como ele interage com outros objetos.
```java
public void semRetorno(){
    System.out.println("Sem Retorno");
}
public String retornaString(){
    return "String Retornada!";
}
public int retornaNumeroVezesDois(int numero){
    return numero * 2;
}
```

## Encapsulamento
Encapsulamento é o princípio que controla o acesso aos atributos e métodos de uma classe, protegendo os dados internos e permitindo que apenas formas específicas de acesso e modificação sejam permitidas. Isso garante a integridade e segurança do objeto, evitando acessos e alterações indesejadas.
```java
class Carro {
    // Private não permite acesso nem alteração direta!!
    private String modelo;
    private int kmRodados;
    // Para isso utilizamos Setters e Getters:
    // Setters: Métodos que servem para definir o valor das variáveis!
    // Getters: Métodos que servem para acessar o valor das variáveis!

    public String getModelo(){
        return modelo;
    }

    // Setters possuem validadores para garantir a funcionalidade do sistema!
    public void setModelo(String modelo){
        // Aqui ocorre a validação do valor! Exemplo abaixo meramente ilustrativo.
        if(modelo in {"hb20", "onix"}){
            this.modelo = modelo.
        }else{
            System.out.println("Diga algum modelo valido");
        }   
    }

    // Exemplo mais fácil de entender.
    public int getKmRodados(){
            return kmRodados;
        }
    
    public void setKmRodados(int kmRodados){
        if(kmRodados >= 0){
            this.kmRodados = kmRodados;
        }
    }
}
```