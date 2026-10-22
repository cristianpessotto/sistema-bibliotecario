# @project.name@ 📖

## Descrição

@project.description@

## Tecnologias usadas

- [Java](https://docs.oracle.com/en/java/javase/25/index.html): Linguagem de programação usando a OpenJDK @maven.compiler.source@ LTS da Eclipse Temurin.
- [Swing](https://docs.oracle.com/en/java/javase/25/docs/api/java.desktop/javax/swing/package-summary.html): API build-in do Java para criação de interfaces gráficas.
- [FlatLaf](https://github.com/JFormDesigner/FlatLaf): Tema moderno para Java Swing.
- [MySQL](https://dev.mysql.com/): Banco de dados SQL.
- [Maven](https://maven.apache.org/): Gerenciador de projetos Java.
- [Visual Studio Codium](https://vscodium.com/): Editor de código-fonte multiplataforma de licença livre.

## Como executar

A execução do projeto exige que você tenha a JDK e MySQL instalados no seu computador. Você pode usar o Maven Wrapper que vem junto com o projeto para executar os comandos abaixo, basta apenas troca os comandos de `mvn` para `mvnw.cmd` e `mvnw.sh`.

### Clonagem do repositório

```shell
git clone @url@
cd @artifactId@
```

### Instalação de dependências localmente (opcional)

```shell
mvn dependency:go-offline dependency:resolve-plugins
```

### Compilação e execução do projeto

```shell
mvn compile exec:java
```

### Empacotamento e execução do projeto

```shell
mvn clean package && java -jar @name@.@packaging@
```

## Documentação (apenas para auxílio)

- Catppuccin: https://catppuccin.com/palette/
- FlatLaf: https://www.formdev.com/flatlaf/customizing/
- MySQL: https://dev.mysql.com/doc/
- Maven Jar Plugin: https://maven.apache.org/plugins/maven-jar-plugin/index.html
- Maven Shade Plugin: https://maven.apache.org/plugins/maven-shade-plugin/index.html

## Licença

[@licenses[0].name@ license](./LICENSE)
