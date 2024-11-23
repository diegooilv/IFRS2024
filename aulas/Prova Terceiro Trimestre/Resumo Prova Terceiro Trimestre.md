# Polimorfismo

## Definição
Polimorfismo é um dos pilares da programação orientada a objetos (POO) e refere-se à capacidade de um objeto assumir diferentes formas. Em termos práticos, significa que uma única interface pode ser usada para acessar diferentes tipos de objetos, promovendo flexibilidade e reutilização de código. O polimorfismo pode ser de dois tipos principais: **sobrecarga (overloading)** e **sobrescrita (overriding)**.

## Quando usar
- Quando há a necessidade de tratar objetos de diferentes classes de maneira uniforme.
- Em sistemas que requerem extensibilidade, como aplicações baseadas em plugins.
- Para reduzir a duplicação de código, permitindo a reutilização de métodos genéricos.

## Vantagens
- **Flexibilidade:** Permite que sistemas sejam extensíveis e possam acomodar novos comportamentos sem alterar o código existente.
- **Reutilização:** Métodos genéricos podem ser aplicados a diferentes tipos de dados.
- **Leitura e manutenção:** Torna o código mais limpo e intuitivo.

## Exemplo
```java
class Animal {
    public void emitirSom() {
        System.out.println("Animal faz um som");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Cachorro late");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Gato mia");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        animal1.emitirSom(); // Cachorro late
        animal2.emitirSom(); // Gato mia
    }
}
```

---

# Composição

## Definição
Composição é uma técnica de design onde objetos são construídos utilizando outros objetos, estabelecendo uma relação "tem-um" (has-a). Ela favorece a modularidade ao permitir que as funcionalidades de um objeto sejam compostas por meio da delegação de responsabilidades para outros objetos.

## Quando usar
- Quando for necessário dividir funcionalidades complexas em componentes menores e reutilizáveis.
- Para evitar dependência excessiva entre classes, como ocorre em hierarquias profundas de herança.
- Em situações onde as relações entre objetos podem mudar dinamicamente.

## Vantagens
- **Modularidade:** Promove a construção de sistemas com componentes desacoplados.
- **Flexibilidade:** Permite alterações de comportamento em tempo de execução.
- **Manutenção:** Evita problemas associados à herança, como classes profundamente acopladas.

## Exemplo
```java
class Motor {
    public void ligar() {
        System.out.println("Motor ligado.");
    }
}

class Carro {
    private Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public void ligarCarro() {
        motor.ligar();
    }
}

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        Carro carro = new Carro(motor);
        carro.ligarCarro(); // Motor ligado.
    }
}
```

---

# Herança

## Definição
Herança é o mecanismo da POO que permite a criação de novas classes baseadas em classes existentes, estabelecendo uma relação "é-um" (is-a). Uma classe derivada (ou subclasse) herda atributos e métodos de uma classe base (ou superclasse), podendo estender ou modificar seus comportamentos.

## Quando usar
- Quando classes compartilham atributos e comportamentos comuns, justificando a reutilização de código.
- Em situações onde a relação entre classes pode ser modelada de forma natural como "é-um".
- Para criar estruturas hierárquicas que permitam especialização.

## Vantagens
- **Reutilização de código:** Reduz a duplicação de atributos e métodos em classes relacionadas.
- **Organização:** Ajuda a criar hierarquias lógicas entre classes.
- **Especialização:** Permite a criação de subclasses com comportamentos mais específicos.

## Exemplo
```java
class Veiculo {
    public void mover() {
        System.out.println("O veículo está se movendo.");
    }
}

class Carro extends Veiculo {
    @Override
    public void mover() {
        System.out.println("O carro está se movendo.");
    }
}

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Veiculo carro = new Carro();

        veiculo.mover(); // O veículo está se movendo.
        carro.mover();   // O carro está se movendo.
    }
}
```
# Encapsulamento

## Definição
Encapsulamento é um dos princípios fundamentais da programação orientada a objetos (POO). Refere-se ao ato de esconder os detalhes internos de uma classe, expondo apenas uma interface pública necessária para interagir com seus objetos. Isso é feito utilizando modificadores de acesso como `private`, `protected` e `public`, garantindo o controle sobre os dados e comportamentos.

## Quando usar
- Quando é necessário proteger os dados de um objeto contra acessos ou modificações indevidas.
- Para impor regras de acesso e validação em atributos.
- Para melhorar a modularidade e manutenção do código, tornando-o menos suscetível a erros.

## Vantagens
- **Proteção dos dados:** Impede que dados internos sejam acessados ou modificados diretamente de fora da classe.
- **Flexibilidade:** Permite alterar a implementação interna sem afetar o código externo.
- **Reutilização e manutenção:** Facilita mudanças futuras, mantendo o impacto local na classe encapsulada.

## Exemplo
```java
class Pessoa {
    // Atributos privados (não podem ser acessados diretamente de fora da classe)
    private String nome;
    private int idade;

    // Construtor para inicializar os atributos
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        setIdade(idade); // Usando o método para aplicar validação
    }

    // Método público para acessar o nome
    public String getNome() {
        return nome;
    }

    // Método público para modificar o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método público para acessar a idade
    public int getIdade() {
        return idade;
    }

    // Método público para modificar a idade com validação
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("João", 25);

        // Acessando e modificando os atributos via métodos públicos
        System.out.println("Nome: " + pessoa.getNome()); // Nome: João
        System.out.println("Idade: " + pessoa.getIdade()); // Idade: 25

        // Alterando valores utilizando os métodos setters
        pessoa.setNome("Maria");
        pessoa.setIdade(30);

        // Exibindo os valores atualizados
        System.out.println("Nome atualizado: " + pessoa.getNome()); // Nome atualizado: Maria
        System.out.println("Idade atualizada: " + pessoa.getIdade()); // Idade atualizada: 30

        // Tentando atribuir um valor inválido
        pessoa.setIdade(-5); // Saída: Idade inválida!
    }
}
```
---

## Referência
- Deitel, P., & Deitel, H. (2016). *Java: How to Program*. 10th Edition. Pearson Education.