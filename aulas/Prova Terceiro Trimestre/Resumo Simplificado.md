
---

# Polimorfismo

## Definição
O polimorfismo é uma das principais características da Programação Orientada a Objetos (POO). Refere-se à capacidade de diferentes classes relacionadas por herança responderem de forma distinta a um mesmo método. 

O polimorfismo pode ser dividido em dois tipos principais:
- **Sobrescrita de métodos (Overriding):** Implementação de um método em uma classe derivada com o mesmo nome e assinatura do método na classe base.
- **Sobrecarga de métodos (Overloading):** Múltiplos métodos ou construtores em uma mesma classe com o mesmo nome, mas assinaturas diferentes.

### Exemplo: Sobrecarga de Construtores
```java
public class Pessoa {
    String nome;
    String sobrenome;
    String cpf;

    // Construtor com três parâmetros
    public Pessoa(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    // Construtor com dois parâmetros
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.sobrenome = ""; // Inicializa como vazio
    }
}
```

### Exemplo: Sobrescrita de Métodos
```java
class Animal {
    public void emitirSom() {
        System.out.println("Animal faz um som.");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Cachorro late.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Cachorro();

        animal1.emitirSom(); // Saída: Animal faz um som.
        animal2.emitirSom(); // Saída: Cachorro late.
    }
}
```

---

# Composição

## Definição
Composição é o princípio de POO no qual uma classe é composta por objetos de outras classes. Essa relação é representada pelo "tem um" (has-a), indicando que uma classe contém outra como parte de sua estrutura.

## Exemplos de "tem um"
- Uma **agenda tem contatos**.
- Um **carro tem um motor**.

## Exemplos de "não é um tem um"
- Um **pneu tem um carro** (é o contrário).
- Uma **caneta tem um papel** (não há relação de composição).

### Exemplo de Composição
```java
import java.util.ArrayList;

class Contato {
    String nome;
    int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }
}

public class Agenda {
    ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato c) {
        contatos.add(c);
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.nome + ", Número: " + contato.numero);
        }
    }
}
```

---

# Herança

## Definição
Herança é um mecanismo da POO no qual uma classe herda atributos e métodos de outra classe. Representa uma relação "é um" (is-a). A classe base é chamada de **superclasse** e a classe derivada é chamada de **subclasse**.

### Exemplos de "é um"
- Um **cachorro é um mamífero**.
- Um **pássaro é uma ave**.

### Exemplos de "não é um é um"
- Uma **pessoa é um professor** (nem sempre).
- Um **estudante é um líder** (não necessariamente).

### Exemplo de Herança
```java
class Mamifero {
    public void respirar() {
        System.out.println("Respirando...");
    }
}

class Cachorro extends Mamifero {
    public void latir() {
        System.out.println("Latindo...");
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.respirar(); // Método herdado da superclasse Mamifero
        cachorro.latir();    // Método específico da subclasse Cachorro
    }
}
```

---

# Encapsulamento

## Definição
Encapsulamento é um princípio de design que promove a proteção dos dados e a integridade das funcionalidades dentro de uma classe. Isso é alcançado controlando o acesso a atributos e métodos por meio de modificadores de acesso.

### Modificadores de Acesso
- **`public`:** Permite acesso de qualquer lugar.
- **`private`:** Restringe o acesso apenas à própria classe.
- **`protected`:** Permite acesso dentro do mesmo pacote e por subclasses.

### Exemplo de Encapsulamento
```java
class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Getter para o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}
```

### Uso:
```java
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);

        conta.depositar(500.0);
        System.out.println("Saldo: " + conta.getSaldo()); // Saída: Saldo: 1500.0

        conta.sacar(200.0);
        System.out.println("Saldo: " + conta.getSaldo()); // Saída: Saldo: 1300.0
    }
}
```

---

### Referência
- Deitel, P., & Deitel, H. (2016). *Java: How to Program*. 10th Edition. Pearson Education.