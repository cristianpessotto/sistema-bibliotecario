package dev.pessotto.data;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DBConnection
{

    private static final String URL =
            "jdbc:mysql://localhost:3306/sistema_bibliotecario?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String USR = "root";
    private static final String PSW = "root";

    public static Connection connection() throws SQLException
    {
        return DriverManager.getConnection(URL, USR, PSW);
    }
}
