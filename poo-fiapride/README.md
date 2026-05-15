# Projeto FiapRide + ControlePS4 - ALEturbo500

## ℹ️ Informações do Aluno

- **Nome:** [Seu Nome Completo]
- **RM:** [Seu RM]
- **Turma:** [Sua Turma]
- **Curso:** [Seu Curso]
- **GitHub:** [@ALEturbo500](https://github.com/ALEturbo500)

---

## 🎯 Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde desenvolvemos o sistema **FiapRide** (aplicativo de mobilidade urbana) em paralelo com o projeto pessoal **ControlePS4** (sistema de controle de videogame), evoluindo ambos aula a aula aplicando cada conceito de POO.

---

## ✅ Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces

---

## 📁 Estrutura do Projeto

```
poo-fiapride/
├── src/
│   └── br/
│       └── com/
│           └── fiapride/
│               ├── model/
│               │   ├── Passageiro.java          (Aula 1)
│               │   ├── PassageiroV2.java         (Aula 2)
│               │   ├── PassageiroV3.java         (Aula 3)
│               │   ├── VeiculoV4.java            (Aula 4)
│               │   ├── Bateria.java              (Aula 5)
│               │   ├── ControlePS4Aula5.java     (Aula 5)
│               │   ├── DispositivoEletronico.java (Aulas 6-8)
│               │   ├── ControlePS4Final.java     (Aulas 6-9)
│               │   ├── Smartphone.java           (Aulas 6-9)
│               │   ├── CarroEletrico.java        (Aula 9)
│               │   ├── Recarregavel.java         (Aula 9 - Interface)
│               │   └── ControlePs4.java          (Aula 1 - Projeto Pessoal)
│               └── main/
│                   ├── SistemaPrincipal.java     (Aula 1)
│                   └── Main.java                 (Aulas 5-9)
└── README.md
```

---

## 🧠 Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** Por que precisamos criar uma classe `Passageiro`? Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`?

Pense: E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?

**Sua Resposta:**
A classe `Passageiro` ajuda a organizar os dados de cada usuário em um único lugar, como nome e saldo, sem precisar criar várias variáveis soltas no main. Isso facilita muito o desenvolvimento, porque se o FiapRide tiver 1 milhão de usuários, seria impossível criar variáveis manualmente para cada um. Com a classe, podemos criar vários passageiros de forma automática, organizada e muito mais prática. O mesmo vale para o projeto pessoal: sem a classe `ControlePs4`, teríamos que criar variáveis separadas para a cor, o LED e a capacidade de bateria de cada controle individualmente. Com a classe, criamos quantos objetos precisarmos usando o mesmo molde.

---

### Aula 2 - Métodos

**Pergunta:** Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo + 100` diretamente no código principal, por que dá tanto trabalho criar um método específico chamado `adicionarSaldo(valor)` para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?

**Sua Resposta:**
Criar o método `adicionarSaldo(valor)` deixa o sistema mais seguro e organizado, porque ele controla como o saldo pode ser alterado. Assim, podemos validar regras, como impedir valores negativos ou registrar movimentações. Se qualquer programador pudesse mudar o saldo diretamente, poderiam acontecer erros, fraudes ou inconsistências, como usuários ficando com saldo negativo ou recebendo créditos indevidos, o que seria um grande risco para a startup. No projeto do ControlePS4, isso também se aplica: o nível da bateria não deveria ser alterado diretamente, pois poderíamos definir um valor de 500% ou -30%, o que não faz sentido no mundo real.

---

### Aula 3 - Encapsulamento

**Pergunta:** No nosso código, os atributos são `private`, mas os métodos `getSaldo()` e `getNome()` são `public`. Por que é seguro deixar o `get` público, mas perigoso deixar o atributo original público?

Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o documento ORIGINAL para a pessoa rasura?

**Sua Resposta:**
Deixar os setters privados aumenta a segurança e o controle do sistema, porque impede alterações diretas nos dados importantes, como o saldo. Assim, o programa é obrigado a usar métodos específicos, como `adicionarSaldo()` e `pagarViagem()`, que aplicam regras de negócio e validações. O getter público retorna uma cópia do valor — você está entregando uma fotocópia do documento, segura para leitura. Se o atributo fosse público, seria como entregar o original: qualquer um poderia rasurá-lo. Isso evita mudanças indevidas, mantém os dados consistentes e deixa o código mais organizado e confiável. No ControlePS4, o nível da bateria deve ser lido livremente, mas só alterado por métodos controlados como `recarregar()`.

---

### Aula 4 - Construtores

**Pergunta:** Na nossa classe `Veiculo`, nós tomamos duas decisões arquitetônicas muito importantes:
1. Nós **não** criamos o método `setModelo()`.
2. O `setPlaca()` foi criado como **privado**, e criamos um método público chamado `atualizarPlaca()` para acessá-lo.

Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em "Gerar Getters e Setters para tudo" automaticamente na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica?

**Sua Resposta:**
Gerar getters e setters para tudo automaticamente é um erro porque deixa qualquer parte do sistema alterar dados importantes sem controle. Isso quebra o encapsulamento e pode causar fraudes, erros e inconsistências. No caso da classe `Veiculo`, não criar `setModelo()` protege informações que não deveriam mudar facilmente, como o modelo do carro — fisicamente, um carro não troca de modelo. Já deixar `setPlaca()` privado e usar `atualizarPlaca()` permite aplicar regras e validações antes da mudança, evitando alterações inválidas ou até fraudes no cadastro dos veículos, simulando o processo real do Detran. No ControlePS4, o modelo do controle também não deveria mudar após a criação do objeto.

---

### Aula 5 - Associação

**Pergunta:** No construtor da `Viagem`, nós exigimos o objeto inteiro (`Passageiro solicitante`). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a `String` do nome no construtor da `Viagem` (`String nomeDoPassageiro`) em vez do objeto todo?

Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a `String` "Ana Silva", ela consegue mexer no dinheiro dela?

**Sua Resposta:**
Usar o objeto inteiro `Passageiro` é importante porque a viagem não precisa apenas mostrar o nome — ela também precisa acessar os dados e comportamentos do passageiro, como descontar saldo ao final da corrida. Se a `Viagem` tivesse apenas a `String` "Ana Silva", ela só teria um texto, sem acesso ao saldo ou aos métodos do passageiro. Com o objeto completo, a viagem consegue interagir diretamente com o passageiro de forma segura e organizada, aplicando as regras de negócio corretamente. No ControlePS4, o controle TEM-UMA bateria como objeto completo: precisamos do objeto `Bateria` para chamar `recarregar()`, consultar o nível real e aplicar lógica de negócio, não apenas exibir um número.

---

### Aula 6 - Herança

**Pergunta:** No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `private`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de `Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super()` ou o `setPlaca()`.

Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?

**Sua Resposta:**
O Java faz isso para proteger o **encapsulamento**, que é o princípio de esconder os dados internos da classe e permitir alterações apenas de forma controlada. Mesmo que `ControlePS4Final` herde de `DispositivoEletronico`, os atributos `private` continuam protegidos para evitar mudanças diretas e inseguras. Assim, a filha é obrigada a usar métodos controlados, como `setPlaca()` ou o `super()`, garantindo que as regras de negócio e validações sejam respeitadas. Isso também mantém a hierarquia de responsabilidades clara: a mãe é dona dos seus dados, e as filhas interagem por canais definidos.

---

### Aula 7 - Polimorfismo

**Pergunta:** No nosso loop `for (Veiculo veiculo : frota)`, a variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia()` lá na classe mãe `Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Carro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?

**Sua Resposta:**
Não conseguiríamos, porque dentro do loop a variável é do tipo `DispositivoEletronico`, e o Java só permite chamar métodos que existem na classe base. Mesmo que `ControlePS4Final` e `Smartphone` tenham `ligar()`, o compilador não sabe disso ao olhar para um `DispositivoEletronico` genérico. Por isso o contrato precisa existir na classe mãe: ele garante que todos os tipos de dispositivo terão esse método, permitindo o uso do polimorfismo de forma segura e organizada. É exatamente assim que o loop `for (DispositivoEletronico d : dispositivos)` consegue chamar `d.ligar()` sem saber se é um controle ou um smartphone.

---

### Aula 8 - Classes Abstratas

**Pergunta:** Faz sentido existir um objeto que é APENAS 'Veículo' sem ser um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem ser carro, moto, caminhão ou nada disso?

Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? Por que ele não deduz isso sozinho?

Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new Veiculo()` e quebrar a lógica do nosso sistema?

**Sua Resposta:**
No mundo real, "Veículo" é apenas uma categoria geral, porque sempre existe um tipo específico como carro, moto ou caminhão. O mesmo vale para `DispositivoEletronico`: ninguém compra "um dispositivo eletrônico genérico". Por isso usamos `abstract`: para impedir que alguém crie um objeto genérico que não faz sentido sozinho. O Java não deduz isso automaticamente porque ele não sabe a intenção do programador; uma classe pode ser genérica ou não dependendo da regra do sistema. Se esquecermos de colocar `abstract`, alguém poderia fazer `new DispositivoEletronico()` e criar objetos incompletos sem comportamento definido, o que quebraria a lógica do sistema.

---

### Aula 9 - Interfaces

**Pergunta:** Por que Java permite herança simples (apenas uma mãe), mas múltipla implementação de interfaces (vários contratos)?

Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo (herança múltipla), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar()`?

Como as interfaces resolvem esse problema?

**Sua Resposta:**
O Java evita herança múltipla de classes para impedir conflitos e ambiguidades. Se `ControlePS4Final` herdasse de `DispositivoEletronico` e de `Bateria`, e as duas classes tivessem um método `ligar()`, o Java não saberia qual versão usar, criando o chamado "problema do diamante". Já as interfaces funcionam como contratos: elas dizem **o que** a classe deve fazer, mas normalmente não trazem implementação completa. Assim, a própria classe decide como implementar o método, evitando conflitos e deixando o código mais organizado e seguro. No nosso projeto, `ControlePS4Final` implementa `Recarregavel` e ao mesmo tempo herda de `DispositivoEletronico`, combinando herança e múltiplos contratos sem ambiguidade.

---

## 🔧 Desafios Técnicos Implementados

### Desafio Pessoal - Sistema ControlePS4

**Qual foi o domínio que você escolheu para seu projeto pessoal?**
Sistema de Controle de Videogame PS4 — modelagem de controles DualShock 4 com bateria, herança de dispositivos eletrônicos e contratos de recarga.

**Quais classes você criou?**
- `ControlePs4` (Aula 1 - modelo básico)
- `Bateria` (Aula 5 - associação)
- `ControlePS4Aula5` (Aula 5 - TEM-UMA bateria)
- `DispositivoEletronico` (Aulas 6-8 - classe mãe abstrata)
- `ControlePS4Final` (Aulas 6-9 - herança + polimorfismo + interface)
- `Smartphone` (Aulas 6-9 - outra filha para teste polimórfico)
- `CarroEletrico` (Aula 9 - implementa Recarregavel)
- `Recarregavel` (Aula 9 - interface)

**Qual foi o maior desafio técnico que você enfrentou?**
O maior desafio foi entender a evolução da classe `ControlePS4` ao longo das aulas: ela começou simples (Aula 1), ganhou métodos (Aula 2), depois encapsulamento (Aula 3), construtores (Aula 4), associação com `Bateria` (Aula 5) e finalmente entrou em uma hierarquia de herança com a classe abstrata `DispositivoEletronico` (Aulas 6-8), implementando também a interface `Recarregavel` (Aula 9). A dificuldade estava em manter a coerência do domínio enquanto os conceitos ficavam mais complexos, especialmente entender que um `ControlePS4Final` é ao mesmo tempo um `DispositivoEletronico` (IS-A, herança) e TEM-UMA `Bateria` como atributo (HAS-A, associação). Resolver esse dois tipos de relacionamento juntos exigiu revisitar os conceitos de herança e associação para não confundir os dois.

---

## 🏁 Conclusão

**O que você aprendeu nestas 9 aulas?**
Aprendi que POO não é só uma forma de escrever código, mas uma maneira de pensar sobre o problema. Cada conceito — classes, métodos, encapsulamento, construtores, associação, herança, polimorfismo, classes abstratas e interfaces — resolve um problema real de design e segurança. A jornada mostrou como um sistema pequeno pode crescer de forma organizada e sustentável aplicando esses princípios.

**Qual conceito foi mais difícil de entender?**
O polimorfismo foi o mais desafiador, especialmente entender por que a variável de referência precisa ser do tipo da classe mãe para funcionar no loop genérico. Superei revisando o exemplo do `for (DispositivoEletronico d : lista)` e percebendo que o Java resolve em tempo de execução qual versão real do método chamar — isso foi o "clique" que fez tudo fazer sentido.

**O que você melhoraria no seu projeto se pudesse refazer?**
Criaria um `ControleDualSense` (PS5) também como classe filha para demonstrar melhor a extensibilidade da hierarquia, e adicionaria uma interface `Conectavel` para representar controles com Bluetooth e USB, mostrando múltiplas interfaces em ação. Também separaria os arquivos Java em commits mais granulares desde o início, em vez de organizar tudo ao final.

---

*"A melhor forma de aprender programação é PROGRAMANDO."*
*— Prof. Ygor Anjos, FIAP*
