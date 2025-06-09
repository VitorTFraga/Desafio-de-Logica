# Desafio de Lógica e Estruturas de Dados

Bem-vindo(a) ao repositório do desafio de lógica e estruturas de dados! Este projeto foi desenvolvido como parte de um **processo seletivo para vaga de estágio** e demonstra a implementação de soluções para problemas clássicos de programação: **Sequência de Fibonacci** e **Números Primos**.

---

##  Tecnologias Utilizadas

* ![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)

---

##  Desafios Implementados

Abaixo, detalho as funcionalidades presentes neste repositório:

###  1. Sequência de Fibonacci

Foram desenvolvidas duas abordagens para calcular o valor correspondente a um número <span class="math-inline">N</span> na sequência de Fibonacci:

* **Validação de Input:** Ambas as funções garantem que o número de entrada <span class="math-inline">N</span> seja maior ou igual a zero (<span class="math-inline">N \\ge 0</span>).

* **Função Linear:** Uma implementação iterativa e eficiente para calcular o <span class="math-inline">N</span>-ésimo termo da sequência de Fibonacci.

* **Função Recursiva:** Uma implementação que utiliza a recursão para resolver o problema, demonstrando a capacidade de pensar em soluções mais elegantes, embora nem sempre as mais eficientes para este caso.

---

###  2. Números Primos

Duas funções foram criadas para identificar todos os números primos até um determinado número <span class="math-inline">N</span>:

* **Validação de Input:** Ambas as funções asseguram que o número de entrada <span class="math-inline">N</span> seja maior que um (<span class="math-inline">N \> 1</span>).

* **Função Linear:** Uma abordagem iterativa para encontrar todos os números primos até <span class="math-inline">N</span>.

* **Função Recursiva:** Uma implementação recursiva para identificar os números primos, explorando diferentes paradigmas de programação.

---

## ⚙️ Como Executar

Para executar o projeto, siga os passos abaixo:

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/VitorTFraga/Desafio-de-Logica.git](https://github.com/VitorTFraga/Desafio-de-Logica.git)
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd Desafio-de-Logica
    ```
    **Certifique-se de que seus arquivos `.java` estão diretamente nesta pasta.**

3.  **Compile os arquivos Java:**
    * **Verifique se você tem o JDK (Java Development Kit) instalado.** Você pode verificar no terminal com `java -version` e `javac -version`. Se não tiver, baixe e instale a versão mais recente.
    * A partir do diretório raiz do projeto (`Desafio-de-Logica/`), compile todos os arquivos Java. Isso irá gerar os arquivos `.class` na mesma pasta:
        ```bash
        javac *.java
        ```

4.  **Execute as funções para teste:**
    **Importante:** Cada arquivo `.java` mencionado (por exemplo, `fibonacciLinear.java`, `finonacciRecursiva.java`, etc.) precisa ter um método `public static void main(String[] args)` dentro de sua respectiva classe. Este método `main` é responsável por chamar as funções de cálculo e imprimir os resultados para demonstração.

    Para executar, estando no diretório `Desafio-de-Logica/`:

    * **Para testar a função Fibonacci Linear:**
        ```bash
        java fibonacciLinear
        ```

    * **Para testar a função Fibonacci Recursiva:**
        ```bash
        java finonacciRecursiva
        ```

    * **Para testar a função Números Primos Linear:**
        ```bash
        java numerosPLinear
        ```

    * **Para testar a função Números Primos Recursiva:**
        ```bash
        java numerosPRecursivo
        ```
    Estes comandos executarão o método `main` dentro de cada classe específica, mostrando os resultados dos testes no console.

---

##  Observações

Este repositório visa demonstrar minhas habilidades em lógica de programação, manipulação de estruturas de dados e diferentes abordagens para resolução de problemas. Sinta-se à vontade para explorar o código e as implementações.

---

##  Contato

Se tiver alguma dúvida ou sugestão, pode me contatar através do meu [LinkedIn](https://www.linkedin.com/in/vitor-táboas-fraga-002651212/) ou [E-mail](vitortaboasfraga@gmail.com).
