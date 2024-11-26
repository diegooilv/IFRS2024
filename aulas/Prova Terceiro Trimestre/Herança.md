### Herança em Java

A **herança** é uma funcionalidade que permite que uma classe (chamada de *subclasse*) derive de outra classe (chamada de *superclasse*), herdando seus atributos e métodos. Isso promove reutilização de código e facilita a organização hierárquica do sistema.

---

**Termos Técnicos:**

- **`superclasse`**:  
  A classe pai ou base da qual outras classes herdam. É declarada de forma normal, sem modificadores adicionais.  

- **`subclasse`**:  
  A classe filha que estende (*extends*) a superclasse, herdando seus membros (atributos e métodos).  

- **`super`**:  
  Palavra-chave usada para se referir à superclasse. Pode ser usada para:  
  1. Chamar o construtor da superclasse.  
  2. Acessar métodos ou atributos da superclasse que foram sobrescritos.

---

**Exemplo em Java:**

```java
// Superclasse
class Animal {
    String nome;

    // Construtor da superclasse
    public Animal(String nome) {
        this.nome = nome;
    }

    // Método da superclasse
    public void som() {
        System.out.println("Animal faz um som");
    }
}

// Subclasse
class Cachorro extends Animal {

    // Construtor da subclasse
    public Cachorro(String nome) {
        super(nome); // Chama o construtor da superclasse
    }

    // Sobrescrevendo método da superclasse
    @Override
    public void som() {
        System.out.println(nome + " faz: Au Au!");
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Genérico");
        animal.som(); // Saída: Animal faz um som

        Cachorro cachorro = new Cachorro("Rex");
        cachorro.som(); // Saída: Rex faz: Au Au!
    }
}
```

---

### Principais Observações:
1. **Palavra-chave `extends`**:  
   É usada para declarar a herança. Exemplo: `class Subclasse extends Superclasse`.
   
2. **Uso de `super`**:  
   - No construtor, permite inicializar atributos herdados.  
   - Dentro de métodos, acessa membros da superclasse que foram sobrescritos.

3. **Polimorfismo**:  
   Uma subclasse pode ser tratada como um objeto da superclasse, permitindo comportamento dinâmico.

Exemplo:
```java
Animal animal = new Cachorro("Bobby");
animal.som(); // Saída: Bobby faz: Au Au!
```