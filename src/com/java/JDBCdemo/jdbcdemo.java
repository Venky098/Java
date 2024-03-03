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
public class jdbcdemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //com.mysql.jdbc.Driver is Deprecated
        Class.forName("com.mysql.cj.jdbc.Driver");//Step2
        String url = "jdbc:mysql://localhost/demo";
        String username = "root";
        String password = "root";
        Connection con = DriverManager.getConnection(url,username,password);//Step3

        Statement st = con.createStatement();//Step4
        ResultSet rt = st.executeQuery("Select * from demo.new_table");//Step5
       /* rt.next();//Step6
        System.out.println(rt.getString(2));*/

        while(rt.next()){
            System.out.println( rt.getInt(1)+" || "+ rt.getString(2)+ " || "+rt.getString(3)); //step6
        }
        rt.close(); //step 7
    }
}
