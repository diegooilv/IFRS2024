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
    void sacar() {
        // Implementação do saque
    }

    void depositar() {
        // Implementação do depósito
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

    // Construtor inicializando os atributos
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método falar
    public void falar() {
        System.out.println("Olá");
    }

    // Método apresentar
    public void apresentar() {
        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
```

## Objeto
Objeto é uma instância de uma classe, ou seja, é a materialização de um modelo de classe com valores específicos para seus atributos e comportamentos definidos pelos métodos. Cada objeto criado a partir de uma classe possui sua própria identidade e estado.

```java
public class Cidade {
    public static void main(String[] args) {
        // Criação de um objeto a partir da classe Pessoa
        Pessoa pessoa01 = new Pessoa("João", 30);
        pessoa01.falar();
        pessoa01.apresentar();
    }
}
```

## Métodos
Métodos são funções associadas a uma classe ou objeto, que definem comportamentos específicos, permitindo que os objetos realizem ações ou modifiquem seu estado. Eles descrevem as operações que um objeto pode realizar ou como ele interage com outros objetos.

```java
public class ExemplosDeMetodos {
    
    // Método sem retorno
    public void semRetorno() {
        System.out.println("Sem Retorno");
    }

    // Método que retorna uma string
    public String retornaString() {
        return "String Retornada!";
    }

    // Método que retorna o número multiplicado por dois
    public int retornaNumeroVezesDois(int numero) {
        return numero * 2;
    }

    // Método estático que não depende de uma instância da classe
    public static void metodoEstatico() {
        System.out.println("Método Estático");
    }
}
```

## Encapsulamento
Encapsulamento é o princípio que controla o acesso aos atributos e métodos de uma classe, protegendo os dados internos e permitindo que apenas formas específicas de acesso e modificação sejam permitidas. Isso garante a integridade e segurança do objeto, evitando acessos e alterações indesejadas.

```java
class Carro {
    // Atributos privados para proteger os dados internos
    private String modelo;
    private int kmRodados;

    // Getter para o atributo modelo
    public String getModelo() {
        return modelo;
    }

    // Setter para o atributo modelo com validação
    public void setModelo(String modelo) {
        // Validação simples dos modelos permitidos
        if (modelo.equals("hb20") || modelo.equals("onix")) {
            this.modelo = modelo;
        } else {
            System.out.println("Modelo inválido. Diga algum modelo válido.");
        }
    }

    // Getter para o atributo kmRodados
    public int getKmRodados() {
        return kmRodados;
    }

    // Setter para o atributo kmRodados com validação
    public void setKmRodados(int kmRodados) {
        if (kmRodados >= 0) {
            this.kmRodados = kmRodados;
        } else {
            System.out.println("Quilometragem não pode ser negativa.");
        }
    }
}
```
