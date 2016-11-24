package BD;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoBD
{
    public static Connection conecta() throws ClassNotFoundException
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Urna","root","naotemsenha");
            //Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Urna","postgres","brs28041996");
            //JOptionPane.showMessageDialog(null, "Conectado!");
            return con;
        }
        catch (SQLException error)
        {
            JOptionPane.showMessageDialog(null, error);
            return null;
        }
    }
}


