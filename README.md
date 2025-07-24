# 🧮 Desafio Controle de Fluxo

Este projeto foi desenvolvido como um exercício prático para fixar os conhecimentos do módulo de **Controle de Fluxo** em Java. O objetivo é simular um contador com base em dois parâmetros fornecidos via terminal e tratar exceções de forma personalizada.

---

## 💡 Descrição do Desafio

O sistema recebe **dois números inteiros via terminal** e realiza as seguintes ações:

* Verifica se o **segundo número é maior que o primeiro**.
* Caso a verificação passe, executa um laço `for` para contar do 1 até a **diferença entre os dois números**, imprimindo mensagens no console no formato:

  ```java
  Imprimindo o número 1
  Imprimindo o número 2
  ...
  ```

### Exemplo:

Se os parâmetros forem `12` e `30`, a saída será:

```java
Imprimindo o número 1
Imprimindo o número 2
...
Imprimindo o número 18
```

---

## ✅ Validações

O sistema realiza dois tipos de validação:

1. **Tipo dos parâmetros**
   Se os parâmetros informados **não forem números inteiros válidos**, o programa exibirá:

   ```java
   Os parâmetros devem ser apenas números!
   ```

2. **Ordem dos parâmetros**
   Se o **primeiro número for maior que o segundo**, será lançada a exceção personalizada `ParametrosInvalidosException` com a mensagem:

   ```java
   O segundo parâmetro deve ser maior que o primeiro
   ```

---

## 🛠️ Estrutura do Projeto

* `DesafioControleFluxo` *(nome do projeto)*

    * `Contador.java` – Classe principal que implementa toda a lógica do programa.
    * `ParametrosInvalidosException.java` – Classe que representa a exceção personalizada.

---

## 🚀 Como Executar

1. Compile os arquivos Java no terminal:

   ```java
   javac Contador.java ParametrosInvalidosException.java
   ```

2. Execute a aplicação informando **dois números inteiros como argumentos**:

   ```java
   java Contador 12 30
   ```

---

## 📄 Exemplo de Saída

```java
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
...
Imprimindo o número 18
```

---

## ⚠️ Exemplo de Erros

### Quando o primeiro número for maior:

```java
java Contador 30 12
```

Saída:

```java
O segundo parâmetro deve ser maior que o primeiro!
```

### Quando os parâmetros não forem numéricos:

```java
java Contador dez vinte
```

Saída:

```java
Os parâmetros devem ser apenas números!
```