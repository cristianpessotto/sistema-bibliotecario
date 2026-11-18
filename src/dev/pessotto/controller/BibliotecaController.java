package dev.pessotto.controller;

import dev.pessotto.model.Aluno;
import dev.pessotto.model.Biblioteca;
import dev.pessotto.model.Livro;
import dev.pessotto.model.Professor;
import dev.pessotto.view.cli.BibliotecaView;

public class BibliotecaController
{

    private Biblioteca     biblioteca;
    private BibliotecaView bibliotecaView;

    public BibliotecaController(Biblioteca biblioteca, BibliotecaView bibliotecaView)
    {
        this.biblioteca     = biblioteca;
        this.bibliotecaView = bibliotecaView;
    }

    public void cadastrarLivro(String titulo, String autor, int ano)
    {
        var livro = new Livro(titulo, autor, ano);
        biblioteca.adicionarLivro(livro);
        BibliotecaView.exibirMensagem("Livro cadastrado: %s".formatted(livro));
    }

    public void cadastrarAluno(String nome, String matricula, String curso)
    {
        var aluno = new Aluno(nome, matricula, curso);
        biblioteca.adicionarUsuaurio(aluno);
        BibliotecaView.exibirMensagem("Aluno cadastrado: %s".formatted(aluno));
    }

    public void cadastrarProfessor(String nome, String matricula, String curso)
    {
        var Professor = new Professor(nome, matricula, curso);
        biblioteca.adicionarUsuaurio(Professor);
        BibliotecaView.exibirMensagem("Professor cadastrado: %s".formatted(Professor));
    }

    public void listarUsuarios()
    {
        bibliotecaView.listarUsuarios(biblioteca);
    }

    public void listarAcervo()
    {
        bibliotecaView.listarAcervo(biblioteca);
    }

    public void buscarLivro(String nome)
    {
        bibliotecaView.buscarLivro(biblioteca, nome);
    }
}
