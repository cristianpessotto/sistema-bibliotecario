package dev.pessotto.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca
{
    private List<Livro>   livros;
    private List<Usuario> usuarios;

    public Biblioteca()
    {
        this.livros   = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public List<Livro> getLivros()
    {
        return this.livros;
    }

    public List<Usuario> getUsuarios()
    {
        return this.usuarios;
    }

    public void adicionarLivro(Livro livro)
    {
        this.livros.add(livro);
    }

    public void adicionarUsuaurio(Usuario usuario)
    {
        this.usuarios.add(usuario);
    }

    public void removeLivro(Livro livro)
    {
        this.livros.remove(livro);
    }

    public void removeUsuaurio(Usuario usuario)
    {
        this.usuarios.add(usuario);
    }

    public Livro buscarLivro(String titulo)
    {
        return this.livros.stream()
                .filter(e -> e.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }
}
