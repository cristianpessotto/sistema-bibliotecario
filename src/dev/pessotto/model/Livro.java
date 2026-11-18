package dev.pessotto.model;

public class Livro
{
    private String  titulo;
    private String  autor;
    private Integer ano;
    private Boolean disponivel;
    private Integer id;

    public Livro(String titulo, String autor, int ano)
    {
        this.titulo     = titulo;
        this.autor      = autor;
        this.ano        = ano;
        this.disponivel = true;
    }

    // construtor usado ao LER do banco
    public Livro(int id, String titulo, String autor, int ano, boolean disponivel)
    {
        this.id         = id;
        this.titulo     = titulo;
        this.autor      = autor;
        this.ano        = ano;
        this.disponivel = disponivel;
    }


    public String getTitulo()
    {
        return this.titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getAutor()
    {
        return this.autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public Integer getAno()
    {
        return this.ano;
    }

    public void setAno(Integer ano)
    {
        this.ano = ano;
    }

    public Boolean getDisponivel()
    {
        return this.disponivel;
    }


    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public void setDisponivel(Boolean disponivel)
    {
        this.disponivel = disponivel;
    }

    @Override
    public String toString()
    {
        return "Livro [titulo=" + this.titulo + ", autor=" + this.autor + ", ano=" + this.ano
                + ", disponivel="
                + this.disponivel + "]";
    }
}
