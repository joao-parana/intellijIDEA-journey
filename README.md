# intellij-journey

IntelliJ IDEA Ultimate da JetBrains

Licença para estudantes e professores pode ser obtida em [https://www.jetbrains.com/shop/eform/students](https://www.jetbrains.com/shop/eform/students)

Videos educativos oficiais e documentação em Geral - [https://www.jetbrains.com/idea/documentation/](https://www.jetbrains.com/idea/documentation/)

## Download para macOS

`curl -o ideaIU-2017.3.3.dmg https://download-cf.jetbrains.com/idea/ideaIU-2017.3.3.dmg`

## Compilador Scala

No macOS o compilador Scala fica instalado em /usr/local/scala/bin

É bastante saudável criar a variável de ambiente **SCALA_HOME** como abaixo

```bash
export SCALA_HOME=/usr/local/scala
```

e atualizar a variavel **PATH**

```bash
export PATH=$SCALA_HOME/bin:$PATH
```

ambas no arquivo `.bash_profile`


## Usando a IDE

### Customização 

A primeira coisa que aparece após a instalação é a **Customização**. Veja sequencia abaixo.

![Customize_IntelliJ_IDEA](assets/img/Customize_IntelliJ_IDEA.png)



![Customize_IntelliJ_IDEA-2](assets/img/Customize_IntelliJ_IDEA-2.png)

### Dicas diárias

As dicas são interessantes para ir aprendendo a usar a ferramenta aos poucos

![Tip_of_the_Day](assets/img/Tip_of_the_Day.png)

### Menu principal

O Menu principal exibe dezenas de funcionalidades ao navegarmos por ele. Algumas se destacam

![Menubar_poc-scala](assets/img/Menubar_poc-scala.png)

### Um projeto de exemplo

Uma visão geral do projeto poc-scala 

![poc-scala-visao-geral](assets/img/poc-scala-visao-geral.png)


É necessário instalar o plugin Scala.

![Preferences_plugins](assets/img/Preferences_plugins.png)

Encontre o plugin Scala e Instale. Ao final você deverá reiniciar a IDE


Partindo de projeto com POM é necessário fazer **add as maven project**. Veja imagem abaixo


![add-as-maven-project](assets/img/add-as-maven-project.png)


Podemos executar a aplicação via atalho

![run-scala-app](assets/img/run-scala-app.png)


Se desejar abrir consoles Scala na IDE como mostrado abaixo

![scala-console](assets/img/scala-console.png)

Você deve configurar o Run

![run-edit-configurations](assets/img/run-edit-configurations.png)

## Rodando Programa Scala com Shell Script

Veja arquivo `scala.sh` de exemplo 

```scala
scala.sh 
#!/usr/bin/env scala
object HelloWorld extends App {
  println("Hello, world!")
}
HelloWorld.main(args)
```

Ele deve ter o flag de execução habilitado


```bash
chmod a+rx scala.sh
```


# Build com Maven na console Bash

```bash
cd Development
git clone git@github.com:joao-parana/intellijIDEA-journey.git
cd intellijIDEA-journey
tail README.md 
cd projects/pocscala
mvn install
```

# Criando um projeto do Zero

```bash
cd ~/Desktop/Development
mvn archetype:generate -B \
  -DarchetypeGroupId=net.alchim31.maven \
  -DarchetypeArtifactId=scala-archetype-simple \
  -DarchetypeVersion=1.6 \
  -DgroupId=br.cefet-rj.eic \
  -DartifactId=first-sbt \
  -Dversion=1.0.0-SNAPSHOT 
  -Dpackage=myscala
cd first-sbt
cat pom.xml
```

Altere as propriedades no arquivo pom.xml de tal forma que fique como abaixo:

```xml
  <properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
    <encoding>UTF-8</encoding>
    <scala.version>2.11.8</scala.version>
    <scala.compat.version>2.11</scala.compat.version>
  </properties>
```

Depois execute 

```
mvn install
```

Opcionalmente você pode colocar a linha abaixo em `properties`:

```xml
<maven.test.skip>true</maven.test.skip>
```

Isso faz com que os testes sejam ignorados 

A dependência abaixo permite que usemos o I/O do SBT nos nossos programas Scala e o SPECS2

```xml
    <dependency>
        <groupId>org.scala-sbt</groupId>
        <artifactId>io_2.11</artifactId>
        <version>1.0.0-M9</version>
    </dependency>
    <dependency>
      <groupId>org.specs2</groupId>
      <artifactId>specs2-junit_${scala.compat.version}</artifactId>
      <version>2.4.16</version>
      <scope>test</scope>
    </dependency>
```

Este arquétipo prepara um projeto que usa o [SPECS2 - http://etorreborre.github.io/specs2/](http://etorreborre.github.io/specs2/)

A documentação do **_SPECS2_** pode ser vista em [https://etorreborre.github.io/specs2/website/SPECS2-3.8.8/quickstart.html](https://etorreborre.github.io/specs2/website/SPECS2-3.8.8/quickstart.html)


# Links

* [Coleções em Scala - https://twitter.github.io/scala_school/collections.html](https://twitter.github.io/scala_school/collections.html)
* [Aplicação Scala no IntelliJ IDEA - https://www.jetbrains.com/help/idea/2016.3/creating-and-running-your-scala-application.html](https://www.jetbrains.com/help/idea/2016.3/creating-and-running-your-scala-application.html)
* [Criação de UML via WEB - http://www.plantuml.com/plantuml](http://www.plantuml.com/plantuml)

