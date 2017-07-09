
package org.netlect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDB {
public String getTestName() {

 //   String vowels = "AEIOU";
//    String article = "an";
    String theName= "";

    try {

        String databaseURL = "jdbc:postgresql://";
        databaseURL += "postgresql:5432"; //System.getenv("POSTGRESQL_SERVICE_HOST");
        databaseURL += "/" + "sampledb"; //System.getenv("POSTGRESQL_DATABASE");
        String username = System.getenv("POSTGRESQL_USER");
        String password = System.getenv("PGPASSWORD");

        Connection connection = DriverManager.getConnection(databaseURL, username, password);

        if (connection != null) {

     //       String SQL = "select a.string AS first, b.string AS second, c.string AS noun from short_adjective a , long_adjective b, noun c ORDER BY random() limit 1";

            String SQL = "select name from test where id=1";        
            
            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
//if (vowels.indexOf(rs.getString("first").charAt(0)) == -1) {
//article = "a";
//}

             theName= String.format("The test name is %s!", rs.getString("name"));

            }

         rs.close();
         connection.close();

        }

    } catch (Exception e) {

//     return "Database connection problem!";
  //      return e.getMessage();
  //   return e.printStackTrace();
     return e.toString();

    }

 return theName;

}

}
