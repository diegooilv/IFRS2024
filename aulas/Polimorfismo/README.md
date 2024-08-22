# Polimorfismo em Programação Orientada a Objetos (POO)

## Introdução

O polimorfismo é um dos quatro pilares da Programação Orientada a Objetos (POO). O termo "polimorfismo" vem do grego e significa "muitas formas". Em POO, ele se refere à capacidade de diferentes classes de serem tratadas de forma uniforme por meio de uma interface ou classe base comum, permitindo que um único método tenha diferentes comportamentos.

O polimorfismo proporciona flexibilidade ao código, facilitando a manutenção e a extensão sem modificações significativas.

## Tipos de Polimorfismo

Existem dois tipos principais de polimorfismo:

1. **Polimorfismo em Tempo de Compilação (Sobrecarga de Métodos)**
2. **Polimorfismo em Tempo de Execução (Sobrescrita de Métodos)**

### 1. Polimorfismo em Tempo de Compilação (Sobrecarga de Métodos)

Também conhecido como **polimorfismo estático**, ocorre quando várias versões de um método com o mesmo nome, mas assinaturas diferentes, são definidas na mesma classe. O compilador decide qual versão do método será chamada com base nos parâmetros fornecidos.

Exemplo em Java:

```java
class Calculadora {
    // Sobrecarga do método 'soma'
    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public int soma(int a, int b, int c) {
        return a + b + c;
    }
}
```

Neste exemplo, o método `soma` é sobrecarregado com diferentes assinaturas, permitindo que ele seja chamado com diferentes tipos e números de argumentos.

### 2. Polimorfismo em Tempo de Execução (Sobrescrita de Métodos)

Também conhecido como **polimorfismo dinâmico**, ocorre quando uma subclasse sobrescreve um método da superclasse para fornecer uma implementação específica. A decisão sobre qual versão do método será executada é feita em tempo de execução, de acordo com o tipo real do objeto.

Exemplo em Java:

```java
class Animal {
    public void som() {
        System.out.println("O animal faz um som");
    }
}

class Cachorro extends Animal {
    @Override
    public void som() {
        System.out.println("O cachorro late");
    }
}

class Gato extends Animal {
    @Override
    public void som() {
        System.out.println("O gato mia");
    }
}
```

Neste exemplo, `Cachorro` e `Gato` sobrescrevem o método `som` da classe `Animal`. Se chamarmos o método `som` em um objeto do tipo `Animal`, mas instanciado como `Cachorro` ou `Gato`, o comportamento será definido pela classe específica em tempo de execução:

```java
Animal animal1 = new Cachorro();
Animal animal2 = new Gato();

animal1.som(); // Saída: O cachorro late
animal2.som(); // Saída: O gato mia
```

### Interfaces e Polimorfismo

O polimorfismo também pode ser implementado com o uso de **interfaces**. Quando diferentes classes implementam a mesma interface, elas podem ser tratadas de maneira polimórfica.

Exemplo:

```java
interface Forma {
    void desenhar();
}

class Circulo implements Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhar um círculo");
    }
}

class Quadrado implements Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhar um quadrado");
    }
}
```

Ambas as classes `Circulo` e `Quadrado` implementam a interface `Forma`. Assim, podem ser tratadas de maneira polimórfica:

```java
Forma forma1 = new Circulo();
Forma forma2 = new Quadrado();

forma1.desenhar(); // Saída: Desenhar um círculo
forma2.desenhar(); // Saída: Desenhar um quadrado
```

## Benefícios do Polimorfismo

1. **Extensibilidade:** O polimorfismo permite adicionar novas classes e métodos sem alterar o código existente.
2. **Flexibilidade:** Permite que uma interface única lide com diferentes tipos de objetos, facilitando a reutilização e o design modular.
3. **Manutenção Simplificada:** O código fica mais simples e fácil de manter, pois a lógica do comportamento é gerenciada dinamicamente.

## Conclusão

O polimorfismo é uma ferramenta poderosa em POO, fornecendo flexibilidade e extensibilidade ao código. Ele permite que o comportamento de métodos seja definido dinamicamente em tempo de execução, ou que métodos sejam reutilizados com diferentes parâmetros em tempo de compilação. Ao entender e aplicar o polimorfismo corretamente, você pode escrever código mais limpo, modular e fácil de manter.