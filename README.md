# Vetor Multithread em Java

## Descrição

Este projeto foi desenvolvido com o objetivo de demonstrar o uso de múltiplas _threads_ em Java realizando operações simultâneas sobre um vetor de números.

Cada _thread_ executa uma tarefa específica, permitindo observar na prática o comportamento concorrente dentro de um mesmo processo.

---

## Objetivo

Aplicar conceitos de programação concorrente utilizando _threads_, analisando:

* Execução simultânea de tarefas
* Compartilhamento de memória
* Impacto da ordem de execução nos resultados

---

## Funcionalidades

O programa cria até 4 threads, responsáveis pelas seguintes operações:

* Soma e média dos elementos
* Ordenação do vetor
* Maior e menor valor
* Modificações no vetor:

  * Adição de número aleatório
  * Remoção de elemento aleatório
  * Contagem de números pares

Cada _thread_ exibe:

* Seu nome
* O resultado da operação realizada

---

## Conceitos abordados

* _Threads_ em Java
* Concorrência
* Compartilhamento de dados
* Condição de corrida (_Race Condition_)

---

## Observações importantes

O programa **não utiliza mecanismos de sincronização**, o que pode causar:

* Variação na ordem de execução das threads
* Resultados diferentes a cada execução

Isso ocorre devido ao escalonamento do sistema operacional e caracteriza uma **condição de corrida**.

---

## Análise

### 1. As threads executam sempre na mesma ordem?

Não. A ordem de execução é não determinística e pode variar a cada execução.

### 2. Os resultados podem mudar?

Sim. Como algumas _threads_ modificam o vetor compartilhado, os resultados podem variar dependendo da ordem de execução.

---

## Como executar

1. Compile os arquivos:

```bash
javac Main.java OperacoesVetor.java
```

2. Execute o programa:

```bash
java Main
```

---

## Autor

Projeto desenvolvido para atividade acadêmica sobre programação concorrente em Java.
