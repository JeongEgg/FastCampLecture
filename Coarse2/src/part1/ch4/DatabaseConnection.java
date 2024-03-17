package part1.ch4;

import part1.ch4.model2.Connection;
import part1.ch4.model2.MSSQLDriver;
import part1.ch4.model2.MySQLDriver;
import part1.ch4.model2.OracleDriver;

public class DatabaseConnection {
    public static void main(String[] args) {
        // oracle DB 접속
        Connection conn = new OracleDriver();
        conn.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");

        // mysql DB 접속
        conn = new MySQLDriver();
        conn.getConnection("jdbc:mysql://localhost:3306/test","root","12345");

        // mssql DB 접속
        conn = new MSSQLDriver();
        conn.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=mem","sa","12345");
    }
}
