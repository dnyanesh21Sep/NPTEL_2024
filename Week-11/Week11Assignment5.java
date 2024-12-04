import java.sql.*;

public class Week11Assignment5 
{
    public static void main(String args[]) 
    {
        try 
        {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            String query = "";

            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();
     
            String CREATE_TABLE_SQL = "CREATE TABLE players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
 
            stmt.executeUpdate(CREATE_TABLE_SQL);

            query = "DROP TABLE players;";

            stmt.executeUpdate(query);
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM players;");
            ResultSetMetaData rsmd1 = rs1.getMetaData();
            System.out.println("No. of columns : " + rsmd1.getColumnCount());

            conn.close();
            ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("No. of columns : " + rsmd.getColumnCount());

            conn.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
