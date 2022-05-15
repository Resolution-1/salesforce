import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class insert {
    public static void main(String args[]) throws SQLException {
        //Registering the Driver
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //Getting the connection
        String mysqlUrl = "jdbc:mysql://localhost/temp";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "aayush123");
        System.out.println("Connection established......");
        //Creating the Statement
        Statement stmt = con.createStatement();
        //Query to insert records
        String query = "INSERT INTO MOVIES(" + "ID, MOVIENAME, ACTORNAME, ACTRESSNAME, DIRECTORNAME,YEAR) VALUES "
                + "(1, 'Inception','Leonardo Di Caprio','Elliot Page','Christopher Nolan','2010/07/16'), "
                + "(2, 'The Dark Knight','Christian Bale', 'Maggie Gyllenhaal', 'Christopher Nolan','2008/07/18'), "
                + "(3, 'The Matrix','Keanu Reeves', 'Carrie-Anne Moss', 'Lana Wachowski','1999/03/31'), "
                + "(4, 'Interstellar','Matthew Mcconaughey', 'Jessica Chastain', 'Christopher Nolan','2014/11/07'), "
                + "(5, 'Joker','Joaquin Phoenix', 'Zazie Beetz', 'Todd Phillips','2019/08/02') ";
        int i = stmt.executeUpdate(query);
        System.out.println("Rows inserted: "+i);
    }
}