package com.java.JDBCdemo;


import java.sql.*; //Step 1

/*
1. import the package
2.Load and register the driver.
3.Establish the connection
4.Create the statement
5. Execute the Query
6. process the result
7. close the connection.

 */
public class jdbcupdatedemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //com.mysql.jdbc.Driver is Deprecated
        Class.forName("com.mysql.cj.jdbc.Driver");//Step2
        String url = "jdbc:mysql://localhost/demo";
        String username = "root";
        String password = "root";
        Connection con = DriverManager.getConnection(url,username,password);//Step3
        String  query = "insert into new_table values (4,'Mark','Sattenapalle')";
        Statement st = con.createStatement();//Step4
        int count = st.executeUpdate(query);//Step5

        System.out.println(count+ "row/s inserted");

        st.close();
        con.close();
    }
}

