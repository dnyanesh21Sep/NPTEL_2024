import java.sql.*;

public class Week10Assignment1 
{
    public static void main(String args[]) 
    {
        try 
        {
            Connection conn = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            conn = DriverManager.getConnection(DB_URL);
            System.out.print(conn.isValid(1));
            conn.close();

        } catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}