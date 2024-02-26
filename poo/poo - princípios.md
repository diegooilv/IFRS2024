# 🎯 Princípios da Programação Orientada a Objetos (POO) em Java

## 🎈 Abstração

**Definição**: A abstração é um processo que simplifica a complexidade ao focar nos aspectos relevantes de um objeto, ignorando os detalhes menos importantes.

**Exemplo em Java**:
```java
// Definindo uma interface Animal
interface Animal {
    void fazerSom();
    void dormir();
}

// Implementando a interface Animal na classe Cachorro
class Cachorro implements Animal {
    public void fazerSom() {
        System.out.println("O cachorro late.");
    }
    
    public void dormir() {
        System.out.println("O cachorro está dormindo.");
    }
}
```

## 📦 Encapsulamento

**Definição**: O encapsulamento é o princípio que esconde os detalhes de implementação de um objeto, expondo apenas uma interface pública.

**Exemplo em Java**:
```java
// Classe ContaBancaria encapsulando o saldo
class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
```

## 🧬 Herança

**Definição**: A herança é um conceito que permite que uma classe herde características de outra classe.

**Exemplo em Java**:
```java
// Classe Animal como classe base
class Animal {
    void comer() {
        System.out.println("O animal está comendo.");
    }
}

// Classe Cachorro herdando de Animal
class Cachorro extends Animal {
    void latir() {
        System.out.println("O cachorro está latindo.");
    }
}
```

## 🎭 Polimorfismo

**Definição**: O polimorfismo permite que objetos de diferentes classes sejam tratados de maneira uniforme.

**Exemplo em Java**:
```java
// Classe Animal com método fazerSom
class Animal {
    void fazerSom() {
        System.out.println("O animal emite um som.");
    }
}

// Sobrescrita do método fazerSom na classe Cachorro
class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("O cachorro late.");
    }
}

// Sobrescrita do método fazerSom na classe Gato
class Gato extends Animal {
    void fazerSom() {
        System.out.println("O gato mia.");
    }
}

// Exemplo de polimorfismo
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        animal1.fazerSom(); // Saída: O cachorro late.
        animal2.fazerSom(); // Saída: O gato mia.
    }
}