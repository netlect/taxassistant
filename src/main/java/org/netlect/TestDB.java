
package org.netlect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDB {
public String getTestName(String testid) {

 //   String vowels = "AEIOU";
//    String article = "an";
    String theName= "";
 String username="";
 String password="";
 
 String testpoint="init";

    try {
     
     Class.forName("org.postgresql.Driver");

        String databaseURL = "jdbc:postgresql://";
        databaseURL += "postgresql:5432"; //System.getenv("POSTGRESQL_SERVICE_HOST");
        databaseURL += "/" + "sampledb"; //System.getenv("POSTGRESQL_DATABASE");
        
        username = "rafael";//System.getenv("POSTGRESQL_USER");
        password = "rafael7319";//System.getenv("PGPASSWORD");

        Connection connection = DriverManager.getConnection(databaseURL, username, password);
testpoint="connecting";
        if (connection != null) {
testpoint="connected";
     //       String SQL = "select a.string AS first, b.string AS second, c.string AS noun from short_adjective a , long_adjective b, noun c ORDER BY random() limit 1";

            String SQL = "select name from test where id="+testid;        
            
            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery(SQL);
testpoint="query executed";
            while (rs.next()) {
//if (vowels.indexOf(rs.getString("first").charAt(0)) == -1) {
//article = "a";
//}

             theName= String.format("The test name is %s!", rs.getString("name"));
testpoint="resultset proccessed";
            }

         rs.close();
         connection.close();

        }

    } catch (Exception e) {

//     return "Database connection problem!";
  //      return e.getMessage();
  //   return e.printStackTrace();
 //    return username.concat(password);
     return e.toString();

    }

 return theName;
 //return testpoint;
 

}

}
