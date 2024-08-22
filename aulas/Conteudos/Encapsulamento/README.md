# Encapsulamento em Java

Encapsulamento é um dos pilares da Programação Orientada a Objetos (POO). Ele envolve a restrição do acesso direto a alguns dos componentes de um objeto e o controle sobre como esses componentes são acessados ou modificados. Em Java, isso é implementado usando modificadores de acesso como `private`, `protected`, e `public`.

## O Que é Encapsulamento?

Encapsulamento é a técnica de esconder os dados internos de um objeto e expor apenas os métodos que são necessários para a interação com esse objeto. Ele ajuda a proteger os dados de alterações indesejadas e mantém a integridade dos objetos.

### Benefícios do Encapsulamento

1. **Segurança**: Protege os dados internos do objeto contra modificações indesejadas e acessos não autorizados.
2. **Modularidade**: Cada classe é responsável por gerenciar seu próprio estado, facilitando a manutenção e a atualização do código.
3. **Controle**: Permite adicionar lógica de validação dentro dos métodos `set`, garantindo que os dados do objeto sejam sempre válidos.

## Implementação do Encapsulamento em Java

### Atributos Privados

Em Java, os atributos de uma classe são geralmente definidos como `private` para restringir o acesso direto a eles. Isso significa que esses atributos só podem ser acessados ou modificados através de métodos da mesma classe.

```java
public class Pessoa {
    private String nome;
    private int idade;
}
```

### Métodos Getters e Setters

Para permitir o acesso controlado aos atributos privados, usamos métodos `public` chamados getters e setters.

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para idade
    public int getIdade() {
        return idade;
    }

    // Setter para idade com validação
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade não pode ser negativa.");
        }
    }
}
```

### Construtor

O construtor é usado para inicializar os atributos da classe quando um objeto é criado.

```java
public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
}
```

### Método de Exibição

Um método pode ser usado para exibir as informações do objeto.

```java
public void mostrarInfo() {
    System.out.println("Nome: " + nome + ", Idade: " + idade);
}
```

## Exemplo Completo

Aqui está um exemplo completo de uma classe `Pessoa` com encapsulamento:

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para idade
    public int getIdade() {
        return idade;
    }

    // Setter para idade com validação
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade não pode ser negativa.");
        }
    }

    // Método para exibir informações da pessoa
    public void mostrarInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
```

### Uso da Classe `Pessoa`

Aqui está um exemplo de como usar a classe `Pessoa`:

```java
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);
        pessoa.mostrarInfo(); // Exibe: Nome: João, Idade: 25

        pessoa.setIdade(30);
        System.out.println("Nova idade: " + pessoa.getIdade()); // Exibe: Nova idade: 30

        pessoa.setIdade(-5); // Tentativa de definir uma idade negativa, exibe: Idade não pode ser negativa.
    }
}
```