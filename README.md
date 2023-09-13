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

<details>
<summary>Comportamento: Template Method</summary>

O Comportamento "Template Method" é um padrão de projeto de software que define a estrutura básica de um algoritmo em uma classe base (ou superclasse) e permite que subclasses específicas forneçam implementações detalhadas para partes desse algoritmo. Em termos simples, ele cria um "modelo" ou "template" para um processo e deixa partes específicas desse processo serem preenchidas por classes filhas.

A ideia por trás do Comportamento "Template Method" é separar o esqueleto do algoritmo das etapas específicas que podem variar de uma subclasse para outra. Isso ajuda a promover a reutilização de código e facilita a manutenção, pois as mudanças em partes comuns do algoritmo podem ser feitas na classe base, afetando todas as subclasses.

Em resumo, o Comportamento "Template Method" é uma abordagem de design que permite definir um padrão geral para a execução de um processo e permite que subclasses personalizem partes específicas desse processo de acordo com suas necessidades.
</details>

<details>
<summary>Estrutura: Proxy</summary>

Uma estrutura de proxy é um componente intermediário que atua como um intermediário entre um cliente e um servidor. Sua função principal é facilitar e controlar o acesso dos clientes aos recursos do servidor. Isso é feito de várias maneiras, incluindo:

Encaminhamento de Requisições: O proxy recebe as solicitações dos clientes e encaminha essas solicitações para o servidor correspondente.

Cache: Muitas vezes, o proxy armazena em cache as respostas do servidor para solicitações frequentes dos clientes. Isso pode melhorar o desempenho e reduzir a carga no servidor.

Controle de Acesso: O proxy pode ser configurado para controlar quem pode acessar o servidor, com base em regras predefinidas. Isso ajuda a reforçar a segurança.

Anonimato: Alguns proxies são usados para ocultar o endereço IP do cliente, protegendo sua privacidade na internet.

Balanceamento de Carga: Proxies podem distribuir o tráfego entre vários servidores, garantindo que nenhum deles fique sobrecarregado.

Filtragem de Conteúdo: Proxies podem ser configurados para bloquear ou filtrar determinados tipos de conteúdo da web, como sites maliciosos ou inadequados.

Em resumo, uma estrutura de proxy é uma camada intermediária que gerencia e otimiza a comunicação entre clientes e servidores, oferecendo controle, segurança e melhoria de desempenho.
</details>

<details>
<summary>SOLID - SRP</summary>

O SOLID é um conjunto de princípios de design de software que ajudam a criar código mais limpo, flexível e fácil de manter. O SRP, ou Princípio da Responsabilidade Única (Single Responsibility Principle), é o primeiro desses princípios e sugere o seguinte:

**Cada classe deve ter uma única responsabilidade.**

Isso significa que uma classe deve ter apenas um motivo para mudar. Em outras palavras, ela deve ter uma tarefa específica e não deve estar sobrecarregada com várias responsabilidades diferentes. Manter uma única responsabilidade em cada classe torna o código mais organizado, compreensível e facilita a manutenção, pois as mudanças em uma responsabilidade não afetam outras partes do sistema de forma inesperada.
</details>

<details>
<summary>PSOO - BRIDGE </summary>

No contexto de programação Java, "BRIDGE" geralmente se refere ao padrão de design de software chamado "Bridge Pattern". Este padrão é usado para separar uma classe abstrata de sua implementação, permitindo que ambas possam evoluir independentemente sem afetar uma à outra.

Em termos simples, o Bridge Pattern é usado quando você tem uma hierarquia de classes com duas dimensões de variação. Uma dimensão é representada pela classe abstrata, que define a interface principal, e a outra dimensão é representada pelas implementações concretas que implementam essa interface.

Isso permite que você tenha diferentes implementações para a mesma interface sem que elas estejam fortemente acopladas. Isso é útil quando você precisa alterar ou adicionar implementações sem afetar o código que usa a interface abstrata.

Em resumo, o Bridge Pattern é uma técnica de design usada em programação Java para separar uma abstração (classe abstrata) de sua implementação (classes concretas) para tornar o sistema mais flexível e de fácil manutenção.
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
