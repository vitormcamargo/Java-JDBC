# Java em MySQL (JDBC)

Isso é uma aplicação java em MySQL

## Como funciona

*Você deve ter o driver JDBC instalado na sua lib*

Crie um banco de dados da seguinte forma:

CREATE DATABASE biblioteca;

USE biblioteca;

CREATE TABLE livros (
idLivro int AUTO_INCREMENT,
nomeLivro varchar(45) NOT NULL,
temaLivro varchar(45) NOT NULL,
estadoLivro varchar(45) NOT NULL,
PRIMARY KEY (idLivro)
);

Em seguida, coloque seu usuário e senha no arquivo Conexão.java

## Resultado

O programa irá te perguntar o nome do livro, tema do livro e o estado do livro.

Depois de inseri-los, vá até sua Query MySQL e escreva SELECT * FROM biblioteca.livros;
