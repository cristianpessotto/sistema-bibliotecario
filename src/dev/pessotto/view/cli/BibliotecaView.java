package dev.pessotto.view.cli;

import dev.pessotto.model.Biblioteca;
import dev.pessotto.model.Livro;
import dev.pessotto.model.Usuario;

public class BibliotecaView
{
    public void exibirTitulo(String titulo)
    {
        IO.println("=== %s ===".formatted(titulo));
    }

    public static void exibirUsuario(Usuario usuario)
    {
        IO.println(usuario);
    }

    public static void exibirLivro(Livro livro)
    {
        IO.println("- %s".formatted(livro));
    }

    public static void exibirMensagem(String mensagem)
    {
        IO.println(mensagem);
    }

    public static void exibirErro(String erro)
    {
        IO.println("Erro: %s".formatted(erro));
    }

    public void listarAcervo(Biblioteca biblioteca)
    {
        exibirTitulo("Acervo");
        biblioteca.getLivros().stream().forEach(BibliotecaView::exibirLivro);
    }

    public void listarUsuarios(Biblioteca biblioteca)
    {
        exibirTitulo("Usuários");
        biblioteca.getUsuarios()
                .stream()
                .forEach(usuario -> {
                    exibirUsuario(usuario);
                    exibirMensagem("--");
                });

    }

    public void buscarLivro(Biblioteca biblioteca, String titulo)
    {
        var livro = biblioteca.buscarLivro(titulo);

        if (livro == null)
        {
            exibirMensagem("Livro \"%s\" não encontrado.".formatted(titulo));
        }
        else
        {
            exibirTitulo("Livro encontrado");
            exibirLivro(livro);
        }
    }
}
