package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDB {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pt = null;
		ResultSet rs = null;
		//String url = "jdbc:oracle:thin:@10.1.1.52:1521:fsorcl";
		String url = "jdbc:sqlserver://10.1.1.31:1433;databasename=fusenTarget";
		//String url = "jdbc:mysql://localhost:3306/数据库名?characterEncoding=utf-8";
		String user = "sa";
		String password = "jpmg4r8d";
		String sql = "select * from B2B001";
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//Class.forName("com.mysql.jdbc.Driver");//或者"org.gjt.mm.mysql.Driver"
			conn = DriverManager.getConnection(url, user, password);
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getObject(1));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (rs != null)
					rs.close();
				if (pt != null)
					pt.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
