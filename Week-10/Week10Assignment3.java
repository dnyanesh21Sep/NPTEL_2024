import java.sql.*; 

public class Week10Assignment3 
{
    public static void main(String args[]) 
    {
        try 
        {
            Connection conn = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            conn = DriverManager.getConnection(DB_URL);
            conn.close();
            System.out.print(conn.isClosed());
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}