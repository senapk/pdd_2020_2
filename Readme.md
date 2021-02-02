# Repositório da Disciplina de POO 2020.2

## Índice []()
<!--TOC_BEGIN-->
- [Links](#links)
- [S01 - Atividades](#s01---atividades)
    - [S01E01 - Negociações](#s01e01---negociações)
    - [S01E02 - Git](#s01e02---git)
- [S02E01 - Java Inicio](#s02e01---java-inicio)
- [S02E02 - Java Interativo - Mago](#s02e02---java-interativo---mago)
- [S03E01 - Inseto](#s03e01---inseto)
- [S03E02 - Cofre](#s03e02---cofre)
- [S04E01 - Encapsulamento - Tamagotchi](#s04e01---encapsulamento---tamagotchi)
- [S04E02 - ArrayList - Tripas](#s04e02---arraylist---tripas)
- [S05E01 - ArrayList II](#s05e01---arraylist-ii)
- [S05E02 - Manipular elementos entre lista](#s05e02---manipular-elementos-entre-lista)
- [S06E01 - Vetores de Null](#s06e01---vetores-de-null)
- [S06E02 - Vetores de Null](#s06e02---vetores-de-null)
- [S07E01 - Sort](#s07e01---sort)
- [S07E02 - 3 camadas](#s07e02---3-camadas)
- [S08E01 - Revisão](#s08e01---revisão)
- [S08E02 - Mapas](#s08e02---mapas)
- [S09E01 - Exceções](#s09e01---exceções)
- [S09E02 - Polimorfismo](#s09e02---polimorfismo)

<!--TOC_END-->

## Links
- [Planilha de notas](https://docs.google.com/spreadsheets/d/1jw7zMiuLVpeKnSWvP5cngfrpXk8GShEfGtrtuVYr3_k/edit?usp=sharing)
- [Grupo do Discord](discord.gg/Ct67jn2EX7)
- [Pasta com as aulas gravadas](https://drive.google.com/drive/folders/15nc52-kWPPCpvlEPLj5Vr-ZDDS7Ts_Kv?usp=sharing)
- [Apostila Caelum](https://www.caelum.com.br/apostila-java-orientacao-objetos/)
- [Playlist Java Gafanhoto](https://www.youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY)


## S01 - Atividades
- Leitura
- Atividades

### S01E01 - Negociações
- Goal
    - Apresentar a disciplina, notas, presenças, contrato de convivência.
- Home
    - [ ] Configurar algum ambiente de desenvolvimento java : Eclipse, VSCode, Netbeans ou Intellij
    - [ ] Instalar o git
    - [ ] Instalar o VSCODE com o plugin Live Share

### S01E02 - Git
- Read
    - [ ] [Tutorial sobre o git e github](s01e02_git/Readme.md)
- Goal
    - Apresentar o git e o github
    - Aprender a baixar e atualizar o repositório da disciplina utilizando o git.
    - Aprender a criar seu próprio repositório.
    - Aprender a enviar e atualizar arquivos no seu repositório remoto.
- Todo
    - [ ] Colocar seu email e repositório git na Planilha de Notas.
    - [ ] Entrar no Discord e mudar seu nickname para seu nome.
    - [ ] Seguir o tutorial do git na pasta S01E01 e criar seu repositório.
- Home
    - [ ] Tende rodar algum código java na sua IDE
    - [ ] No seu repositório crie a pasta **Projeto 01 Inicio**
    - [ ] Enviar esse código java para o repositório remoto.

## S02E01 - Java Inicio
- Read
    - [ ] Leia a apostila da Caelum. Capítulo 1, 2 e 3.
    - [ ] Assista o primeiro vídeo da Playlist Gafanhoto
- Goal
    - Entender a estrutura de um código OO: Classes, objetos, atributos, métodos, construtores, main.
    - Criar uma classe java e métodos que alterem os atributos.
- Home
    - [ ] Estudar o código feito em sala [LINK](s02e01_java/Calango.java)

## S02E02 - Java Interativo - Mago
- Read
    - Exemplos[LINK](s02e02_interativa/Aula.java)
- Goal
    - Fazer entrada de dados em java utilizando o Scanner
    - Fazer conversão entre tipo de dados de String para Inteiro e Float
    - Ver como quebrar uma string usando o split 
    - Comparação entre Strings como o equals e ==
    - Aprender a fazer código interativo e treinar os elementos básicos apresentados na aula passada
- Home
    - [ ] Projeto: Fazer o Projeto do carro **OU** projeto equivalente à sua escolha.
        - Opção 1: Fazer o projeto do [Carro](https://github.com/qxcodepoo/arcade/blob/master/base/002/Readme.md)
        - Opção 2: Crie seu próprio projeto, mas que contenha.
            - Uma classe, Construtor, 3 atributos, 4 métodos, método toString, Main **interativa**
    - [ ] Colocar seus códigos na pasta **Projeto 02 Calango** e enviar para seu github.
    - [ ] Relatório
        - Fazer um relatório dos seus estudos da semana **no arquivo Readme.md** dessa pasta no github.
        - Exemplo de Relatório [LINK](s02e02_interativa/Readme.md)
        - No relatório deve ter resumidamente: 
            - 1) o que fez
            - 2) com quem fez 
            - 3) como fez
            - 4) o que aprendeu e o que ainda tem dificuldade 
            - 5) quanto tempo levou.

## S03E01 - Inseto
- Read
    - [ ] Ler o capítulo 4 da apostila da Caelum.
- Goal
    - Entender o **this**.
    - Fazer métodos que recebam um outro objeto da mesma classe: `this` e `other`.
    - Criar classes que utilizem agregação, classes com outras classes dentro dela.
    - Entender melhor o valor `null` na passagem e no retorno de um objeto.
- Home
    - Fazer um projeto do grupo [Duas classes e agregação](https://github.com/qxcodepoo/arcade#duas-classes-usando-agrega%C3%A7%C3%A3o) ou equivalente.
        - Requisitos:
        - Mínimo de 2 classes, construtores, toStrings, 3 atributos, 4 métodos, main interativa.
        - Deve existir uma relação de Agregação (uma classe conter a outra) e manipulação do objeto agregado.
    - [ ] Colocar seus códigos na pasta **Projeto 03 Cofre**.
    - [ ] Fazer o relatório

## S03E02 - Cofre
- Read
    - [ ] Enum [LINK](https://www.javaprogressivo.net/2012/10/Como-usar-enumA-melhor-maneira-para-manusear-constantes-em-Java.html)
    - [ ] Introdução aos Diagramas de Classe [LINK](http://spaceprogrammer.com/uml/introducao-as-classes-associacoes-e-generalizacoes/)
- Goal
    - Ver o tipo Enum
    - Praticar 

## S04E01 - Encapsulamento - Tamagotchi
- Read
    - [ ] Caelum: Capítulo 5
- Goal
    - Aprender sobre: Encapsumento, modificadores de acesso, gets e sets e métodos static
    - Construir o modelo do Pokemon [LINK](s04e01_encapsulamento/Buba.java)
- Home
    - [ ] Fazer o projeto do Tamagotchi [LINK](https://github.com/qxcodepoo/arcade/blob/master/base/006/Readme.md#shell)
    - Colocar na pasta **Projeto 04 Tamagotchi**

## S04E02 - ArrayList - Tripas
- Read
    - [ ] Olhar o Array na apostila da Caelum: [LINK](https://www.caelum.com.br/apostila-java-orientacao-objetos/um-pouco-de-arrays#desafios-opcionais)
    - [ ] Olhar o funcionamento do arraylist: [LINK](https://www.w3schools.com/java/java_arraylist.asp)
    - [ ] Estudar pelo código [LINK](s04e02_arraylist/Vetores.java)
- Goal
    - Aprender como funcionam os Arrays e os Arraylists em Java
    - Aprender as operações básicas de inserir, percorrer, listar, remover no Arrayslist
    - Ver como podemos utilizar ArrayLists para armazenar objetos e manipular objetos
- Home (EXTRA)
    - Fazer projeto sobre Vetores: Sugestão `@014 Contato`
        - Colocar na pasta **Projeto 05 Contato** e fazer o relatório

## S05E01 - ArrayList II
- Goal
    - Treinar manipulação de objetos em Listas com o `@014 Contato`

## S05E02 - Manipular elementos entre lista
- Goal
    - Treinar lógica de programação com o Projeto @009 Pula Pula.
- Home
    - Sugestão `Projeto Tarifas` ou `Projeto JunkFood`.
        - Mínimo de 2 classes, construtores, toStrings.
        - Manipulação de objetos no vetor: inserção, remoção, busca.
        - Deve existir uma relação de Agregação ou Composição(uma classe conter pelo menos um Array da outra).
    - [ ] Colocar seus códigos na pasta **Projeto 06 ArrayList** e fazer o relatório

## S06E01 - Vetores de Null
- Goal
    - Entender melhor Vetores e Null com o Projeto `@010 Sala de Cinema`.

## S06E02 - Vetores de Null
- Goal
    - Continuação do projeto Cinema
- Home
    - `@012 Topic` 

## S07E01 - Sort
- Goal
    - Ordenação, Equals, Comparable, Comparator e Sort.
    - Ordenação usando dois critérios
    - Entendendo interfaces


## S07E02 - 3 camadas
- Goal
    - `@024 - Mensagens`
    - Aprender um modelo simplificado de troca de mensagens
    - Compartilhando objetos entre ArrayLists
    - Usando id único
    - Usando contador de não lidos
    - Trocando mensagem diretamente entre objetos usuários
    - Implementando um sistema de gestão de usuários
    - Dividindo as responsabilidades: Sistema, Usuario, Msg
    - Colocando o sistema para gerenciar os ids da msgs
- Home
    - `@015-Busca`
    
## S08E01 - Revisão

## S08E02 - Mapas
- Goal
    - Entender o funcionamento dos mapas
- Home
    - `Favoritos`

## S09E01 - Exceções
- Goal
    - Entender como funcionam excessões e como utilizá-las para gerenciar erros

## S09E02 - Polimorfismo
- Goal
    - Compreender o funcionamento de interfaces e herança no polimorfismo.
- Home
    - Obrigatório
        - Implementar um projeto à usa escolha que contenha:
            - Uso de interfaces
            - Uso de herança
            - Sobrescrita de método
            - Invocação de construtores em cadeia
        - Pegar um projeto antigo seu e adaptar para o modelo de excessões
            - Uso de excessões para lançar erros
        - Treine, teste, use sua imaginação para brincar com os conteúdos.
    - Opcional
        - `@028 Bilheteria`

<!--

## S06E01 - Null []()
- Goal
    - Entender melhor Vetores e Null com o Projeto `@010 Sala de Cinema`.
- Home
    - `@011 JunkFood`
    - `@012 Topic` 

## S06E01 - Revisão []()
- Goal
    - Revisão recriando o projeto Junkfood e Topic

## S06E02 - Sort []()
- Goal
    - Ordenação, Equals, Comparable, Comparator e Sort.
- Home
    - `@015 Busca` ou `@024 Mensagens`

## S07E01 - Maps []()
- Goal
    - Aprender como utilizar estruturas chave valor como Maps.

## S07E02 - Integridade []()
- Goal
    - Entender a importância e o problema das redundâncias na integridade.
    - Projeto `@016 Favoritos`

## S08 - Excessões []()
- Goal

## S09 - Herança []()

## S10 - Herança II []()

## S11 - NxN  []()

-->