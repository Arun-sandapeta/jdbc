import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/jdbcDemo";
        String username="root";
        String password = "arun";
try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url,username,password);
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from jdbcDemo");
    while (resultSet.next()){
        System.out.println(resultSet.getString(1)+ " "+resultSet.getString(2)+ " "+ resultSet.getString(3));
    }
    connection.close();
} catch (Exception e) {
    throw new RuntimeException(e);
}
    }
}
