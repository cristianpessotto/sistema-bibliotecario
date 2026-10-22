package dev.pessotto.model;

public class Livro
{
    private String  titulo;
    private String  autor;
    private Integer ano;
    private Boolean disponivel;

    public Livro(String titulo, String autor, Integer ano, Boolean disponivel)
    {
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
