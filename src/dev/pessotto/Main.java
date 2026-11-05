package dev.pessotto;

import java.sql.Connection;
import java.sql.SQLException;
import dev.pessotto.controller.BibliotecaController;
import dev.pessotto.data.DBConnection;
import dev.pessotto.model.Biblioteca;
import dev.pessotto.view.cli.BibliotecaView;

public final class Main
{
    public static void main(String[] args)
    {
        // SwingUtilities.invokeLater(SwingApplication::start);

        Biblioteca           biblioteca = new Biblioteca();
        BibliotecaView       view       = new BibliotecaView();
        BibliotecaController controller = new BibliotecaController(biblioteca, view);

        controller.cadastrarAluno("Maria Silva", "2024001", "Sistemas de Informação");
        controller.cadastrarProfessor("João Motta", "P0001", "Computação");

        controller.cadastrarLivro("Clean Code", "Robert C. Martin", 2008);
        controller.cadastrarLivro("Dom Casmurro", "Machado de Assis", 1899);
        controller.cadastrarLivro("Use a Cabeça! Padrões de Projeto", "Freeman & Robson", 2009);

        controller.listarUsuarios();
        controller.listarAcervo();

        controller.buscarLivro("Dom Casmurro");
        controller.buscarLivro("Livro Inexistente");

        {
            IO.print("\033[H\033[J");
        }

        try (Connection c = DBConnection.connection())
        {
            System.out.println("Conectou ao MySQL!");
            c.close();
        }
        catch (SQLException e)
        {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
