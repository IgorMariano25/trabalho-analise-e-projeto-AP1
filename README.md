# Trabalho Análise e Projeto de Sistemas - 2023.2 AP1 Ibmec Centro-RJ
Repositório criado para adicionar os arquivos referentes ao Trabalho Analise Projeto - 2023-2 AP1 Centro

- **[Arquivos Padrões GoF - Criação: Builder ](https://github.com/IgorMariano25/trabalho-analise-e-projeto-AP1/tree/main/PADROES%20-%20GOF/Criacao%20-%20BUILDER/JAVA)** 🏗️🚧
- **[Arquivos Padrões GoF - Comportamento: Template Method](https://github.com/IgorMariano25/trabalho-analise-e-projeto-AP1/tree/main/PADROES%20-%20GOF/Comportamento%20-%20TEMPLATE%20METHOD/JAVA)** ⚙️🪛
- **[Arquivos Padrões GoF - Estrutura: Proxy](https://github.com/IgorMariano25/trabalho-analise-e-projeto-AP1/tree/main/PADROES%20-%20GOF/Estrutura%20-%20PROXY/JAVA)** 🛡️🔒
- **[Arquivos SOLID - SRP](https://github.com/IgorMariano25/trabalho-analise-e-projeto-AP1/tree/main/SOLID/SRP/JAVA)** 🪨🧱
- **[Arquivos PSOO - BRIDGE](https://github.com/IgorMariano25/trabalho-analise-e-projeto-AP1/tree/main/PSOO/BRIDGE)** 🌉⛓️

## Explicação de cada Tópico 🔤
<details>
<summary>Criação: Builder</summary>
   
O padrão Builder é uma técnica de design de software que simplifica a criação de objetos complexos passo a passo. Imagine que você está construindo uma casa com muitos detalhes personalizáveis, como o tipo de telhado, o número de quartos, a cor das paredes e assim por diante. Usar um único método de construção para especificar todos esses detalhes seria complicado e difícil de entender.
   
Para resolver esse problema, o padrão Builder envolve a criação de um "construtor" separado para o objeto, que é como um formulário de pedido de casa personalizada. Você preenche o formulário passo a passo, escolhendo o tipo de telhado, o número de quartos e assim por diante. Uma vez que você tenha preenchido todos os detalhes que deseja, você "constrói" a casa. O construtor então usa as informações fornecidas no formulário para criar a casa com os detalhes específicos que você escolheu.

Isso torna a construção de objetos mais intuitiva, flexível e legível, especialmente quando você tem muitos parâmetros opcionais ou quando a ordem em que os atributos são configurados é importante. O padrão Builder é uma ferramenta valiosa para criar objetos complexos de forma organizada e compreensível, evitando a necessidade de construtores com muitos parâmetros.
</details>

## Respostas de Execução de cada código
<details>
<summary>Criação: Builder</summary>

```Java
   Carro construído com sucesso !
------------------------------
Marca: Ferrari
Moodelo: 458 Italia
Ano de Fabricação: 2015
Número de Portas: 2
Potência do Motor: 2.6
------------------------------
```
</details>

<details>
<summary>Comportamento: Template Method</summary>

```Java
---------------------------------------
    Iniciando Leitura de Documentos      
---------------------------------------  

Abrindo documento DOC: Documento.csv
Extraindo dados de um documento DOC
Status da leitura: Lendo arquvivo...
Leitura concluída com sucesso !
Fechando documento DOC: Documento.csv

---------- Próximo Arquivo ----------
Abrindo documento CSV: Documento.csv
Extraindo dados de um documento CSV
Status da leitura: Lendo arquvivo...
Leitura concluída com sucesso !
Fechando documento CSV: Documento.csv

---------- Próximo Arquivo ----------
Abrindo documento PDF: Documento.pdf
Extraindo dados de um documento PDF
Status da leitura: Lendo arquvivo...
Leitura concluída com sucesso !
Fechando documento PDF: Documento.pdf

---------------------------------------
   Leitura Finalizada com sucesso !    
---------------------------------------
```
</details>

<details>
<summary>Estrutura: Proxy</summary>

```Java
------------------------------------------------
 [ OK ] Acesso Permitido: Credenciais Corretas  
------------------------------------------------
Acessando o recurso real: Recurso A
------------------------------------------------
 [ X ] Acesso negado: Credenciais Inválidas     
------------------------------------------------
Você não tem permissão para acessar o recurso: Recurso B
```
</details>

<details>
<summary>SOLID: SRP</summary>

```Java
  Antes de aplicar o SRP  
----------------------------
Relatório do Funcionário:
Nome: João
Salário: 5000.0

  Depois de aplicar o SRP  
----------------------------
Relatório do Funcionário:
Nome: João
Salário: 5000.0
```
</details>

<details>
<summary>PSOO - BRIDGE</summary>

```Java
API1 desenha o círculo no ponto (1, 2) com raio 3
API2 desenha o círculo no ponto (5, 7) com raio 11
```
</details>
