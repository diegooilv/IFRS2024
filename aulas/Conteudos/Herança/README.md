# Herança em Java

## Introdução

A herança é um dos quatro pilares da Programação Orientada a Objetos (POO), juntamente com encapsulamento, polimorfismo e abstração. Em Java, a herança permite que uma classe (`subclasse`) herde os atributos e métodos de outra classe (`superclasse`), promovendo a reutilização de código e a criação de hierarquias de classes.

## Como Funciona a Herança

### Definindo a Superclasse

A superclasse é a classe base da qual outras classes podem herdar. Ela pode conter atributos e métodos comuns a várias classes.

```java
class Animal {
    String nome;
    int idade;

    void dormir() {
        System.out.println("O animal está dormindo");
    }

    void som() {
        System.out.println("O animal está emitindo um som");
    }
}
```

### Definindo a Subclasse

A subclasse é uma classe que herda os atributos e métodos da superclasse. Para definir uma subclasse, usamos a palavra-chave `extends`.

```java
class Cachorro extends Animal {

    void latir() {
        System.out.println("O cachorro está latindo");
    }

    // Sobrescrita do método som()
    @Override
    void som() {
        System.out.println("O cachorro está latindo");
    }
}
```

### Usando a Herança

Quando uma subclasse herda de uma superclasse, ela pode acessar diretamente os métodos e atributos da superclasse, exceto se esses forem `private`.

```java
public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.nome = "Rex";
        dog.idade = 5;

        dog.dormir();  // Acessa o método da superclasse
        dog.som();     // Acessa o método sobrescrito na subclasse
        dog.latir();   // Acessa o método da subclasse
    }
}
```

## Sobrescrita de Métodos

A sobrescrita de métodos (ou overriding) permite que uma subclasse forneça uma implementação específica para um método que já foi definido na superclasse.

- **@Override**: Esta anotação é usada para indicar que um método na subclasse está sobrescrevendo um método na superclasse.

### Exemplo de Sobrescrita

```java
class Gato extends Animal {

    @Override
    void som() {
        System.out.println("O gato está miando");
    }
}
```

## Construtores e Herança

Os construtores não são herdados pela subclasse, mas a subclasse pode chamar o construtor da superclasse usando a palavra-chave `super`.

### Exemplo de Construtor

```java
class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }
}

class Cachorro extends Animal {

    Cachorro(String nome) {
        super(nome);
    }
}
```

## Herança Múltipla e Interfaces

Java não suporta herança múltipla direta (uma classe não pode herdar de mais de uma classe ao mesmo tempo). No entanto, isso pode ser contornado usando interfaces, que permitem que uma classe implemente múltiplas interfaces.

### Exemplo com Interface

```java
interface Mamifero {
    void mamar();
}

class Baleia extends Animal implements Mamifero {

    @Override
    public void mamar() {
        System.out.println("A baleia está mamando");
    }
}
```

## Hierarquia de Classes

Em um sistema grande, as classes podem ser organizadas em uma hierarquia, onde subclasses herdam de outras subclasses ou superclasses.

### Exemplo de Hierarquia

```java
class Animal {
    // Atributos e métodos comuns a todos os animais
}

class Mamifero extends Animal {
    // Atributos e métodos específicos de mamíferos
}

class Cachorro extends Mamifero {
    // Atributos e métodos específicos de cachorros
}
```