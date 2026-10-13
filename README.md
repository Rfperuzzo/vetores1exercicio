# 📊 Soma e Média de 20 Números | Java

## 📌 Descrição

Este projeto consiste em um programa desenvolvido em Java que recebe **20 números inteiros**, armazena os valores em um vetor e calcula a **soma total e a média aritmética** dos números informados.

O exercício tem como objetivo praticar a utilização de vetores, estruturas de repetição e operações matemáticas.

## 🛠️ Tecnologias utilizadas

- Java
- Scanner para entrada de dados
- Vetores (Arrays)
- Estrutura de repetição `for`
- Operações aritméticas

## 💻 Código-fonte

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x[] = new int[20], i, soma = 0, media;

        for (i = 0; i < 20; i++) {
            System.out.println("Digite um número: ");
            x[i] = scanner.nextInt();
            soma = x[i] + soma;
        }

        media = soma / 20;

        System.out.println(media);
        System.out.println(soma);
    }
}
```

## 🧠 Lógica do programa

1. Cria um vetor `x` com capacidade para armazenar 20 números inteiros.
2. Inicializa a variável `soma` com zero.
3. Utiliza um laço `for` para realizar a leitura dos 20 números.
4. Armazena cada número em uma posição do vetor.
5. Adiciona cada valor à variável `soma`.
6. Após finalizar a repetição, calcula a média dividindo a soma por 20.
7. Exibe a média e a soma total dos números informados.

## 📥 Exemplo de entrada

Para simplificar, considere os números de 1 a 20:

```text
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
```

## 📤 Exemplo de saída

Considerando apenas os resultados finais, sem as mensagens de solicitação:

```text
10
210
```

## 🔎 Explicação do exemplo

A soma dos números de 1 a 20 é:

**Soma = 210**

A média aritmética é:

**Média = 210 / 20 = 10,5**

Como o programa utiliza uma variável do tipo `int`, o resultado da divisão é inteiro, descartando a parte decimal.

Por isso, o programa apresenta `10` como média.

## 📚 Conceitos praticados

- Declaração e utilização de vetores
- Armazenamento de valores em arrays
- Índices de vetores, começando em zero
- Estrutura de repetição `for`
- Entrada de dados com `Scanner`
- Utilização de acumuladores
- Soma de números inteiros
- Cálculo de média aritmética
- Divisão inteira em Java

## 🎯 Objetivo

Praticar a manipulação de vetores em Java, utilizando estruturas de repetição para armazenar números, realizar operações matemáticas e apresentar os resultados.

---

**Linguagem:** Java  
**Tema:** Vetores, soma e média aritmética  
**Nível:** Básico
