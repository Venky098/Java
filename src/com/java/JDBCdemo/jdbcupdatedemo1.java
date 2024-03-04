package com.java.JDBCdemo;



import java.sql.*;
public class jdbcupdatedemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost/demo";
        String username ="root";
        String password ="root";
        String insertsql ="insert into demo.new_table values (8,'Ambani','mumbai');";
        String sql ="select * from demo.new_table;";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        ResultSet rt =st.executeQuery(sql);
        while(rt.next()){
            System.out.println(rt.getInt(1)+ "|| "+rt.getString(2)+"|| "+
                    rt.getString(3));
        }
        Statement st1 = con.createStatement();
        int count = st1.executeUpdate(insertsql);
        Statement st2 = con.createStatement();
        ResultSet rt1 =st2.executeQuery(sql);
        while(rt1.next()){
            System.out.println(rt1.getInt(1)+ "|| "+rt1.getString(2)+"|| "+
                    rt1.getString(3));
        }
        System.out.println(count);

            st.close();
    }
}
