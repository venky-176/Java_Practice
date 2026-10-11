package JDBC_Practice;
import java.sql.*;
public class JDBCPractice1 {
    static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/company_db";
        //Class.forName("com.mysql.jdbc.driver");
        // DriveManager.getConnection uses to connect database with java, here url represents where the database is, user represents the account holder
        //                              password authenticates the user account.
        // Connection is a interface, through these objects we can access create statements, manage transactions, and close the connection.
        try{
            Connection con=DriverManager.getConnection(url,"root","Venkat");
            if(con!=null){
                System.out.println("Successfully connected");
            }
            Statement st= con.createStatement();
            String query="select employee_id,first_name,last_name from employees";
            // want to execute query use => executeQuery("query")
            // want to update table then => executeUpdate()
            // We use ResultSet to hold the query result and show us in table form
            ResultSet rs=st.executeQuery(query);
            System.out.println("id");
//            while(rs.next()){
//               int id=rs.getInt("employee_id");
//                System.out.print(id+" ");
//            }
           ResultSetMetaData mg= rs.getMetaData();
            int columnCount= mg.getColumnCount();
            while(rs.next()){
                for(int i=1;i<=columnCount;i++){
                    System.out.print(mg.getColumnLabel(i)+":"+rs.getString(i)+"|");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
    }
}
