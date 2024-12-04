import java.sql.*;

public class Week11Assignment1 
{
    public static void main(String args[]) 
    {
        try 
        {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();
      
            String CREATE_TABLE_SQL = "CREATE TABLE players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
         
            stmt.executeUpdate(CREATE_TABLE_SQL);
            PreparedStatement preparedStmt = conn.prepareStatement("insert into Players values(?,?,?,?)");
            preparedStmt.setInt(1, 1);
            preparedStmt.setString(2, "Ram");
            preparedStmt.setString(3, "Gopal");
            preparedStmt.setInt(4, 26);

            int x = preparedStmt.executeUpdate();

            PreparedStatement preparedStmt2 = conn.prepareStatement("insert into Players values(?,?,?,?)");

            preparedStmt2.setInt(1, 2);
            preparedStmt2.setString(2, "John");
            preparedStmt2.setString(3, "Mayer");
            preparedStmt2.setInt(4, 22);

            int y = preparedStmt2.executeUpdate();

            ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
            while (rs.next())
                System.out.println(
                        rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));
            conn.close();

        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
