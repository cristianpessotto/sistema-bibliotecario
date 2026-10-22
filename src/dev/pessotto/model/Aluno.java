package dev.pessotto.model;

public class Aluno extends Usuario
{
    private String curso;

    public Aluno(String nome, String matricula, String curso)
    {
        super(nome, matricula);
        this.curso = curso;
    }

    public String getCurso()
    {
        return this.curso;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }

    @Override
    public String toString()
    {
        return "Aluno [curso=" + this.curso + ", getNome()=" + getNome() + ", getMatricula()="
                + getMatricula() + "]";
    }
}
