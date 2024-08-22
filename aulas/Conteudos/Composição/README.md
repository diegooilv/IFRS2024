# Composição em Programação Orientada a Objetos (POO)

## O que é Composição?

Composição é um conceito fundamental na Programação Orientada a Objetos (POO), onde um objeto é composto de outros objetos. Em vez de herdar comportamentos e características de uma classe base, na composição, uma classe pode incluir objetos de outras classes como parte de suas propriedades.

## Quando usar Composição?

A composição é útil quando queremos modelar uma relação "tem um" (has-a) entre objetos. Por exemplo, um `Carro` tem um `Motor`, mas `Carro` e `Motor` são objetos distintos. Eles podem existir independentemente um do outro, e suas funcionalidades podem ser combinadas para formar algo maior.

Essa abordagem proporciona uma maior flexibilidade, pois permite que uma classe seja composta por outras classes sem depender de herança múltipla, o que pode levar a um código mais modular e reutilizável.

## Vantagens da Composição

- **Modularidade**: Cada classe tem uma responsabilidade bem definida, o que facilita o entendimento e a manutenção do código.
- **Reusabilidade**: Objetos podem ser reutilizados em diferentes contextos sem precisar modificar o código.
- **Flexibilidade**: Permite modificar a funcionalidade de uma classe composta sem alterar as classes que ela utiliza.

## Diferença entre Composição e Herança

| **Composição** | **Herança** |
|----------------|-------------|
| Relação "tem um" (has-a) | Relação "é um" (is-a) |
| Maior flexibilidade | Menos flexível, já que a classe filha herda diretamente da classe pai |
| Facilita o uso de múltiplos objetos | Pode levar a hierarquias complexas |

## Conclusão

A Composição é uma técnica poderosa e flexível na Programação Orientada a Objetos, permitindo criar sistemas mais modulares e reutilizáveis. Ela deve ser usada quando a relação entre objetos for "tem um", ao contrário da Herança, que é usada em relações "é um". Ao aplicar Composição corretamente, é possível construir sistemas mais robustos e de fácil manutenção.