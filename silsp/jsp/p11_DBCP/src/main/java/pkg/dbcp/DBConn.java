package pkg.dbcp;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConn {

	public static Connection mtdGetConn() throws Exception {

		Connection conn = null;
		Context init = new InitialContext();
		DataSource dataSource = (DataSource) init.lookup("java:comp/env/jdbc/dbcpConn");

		conn = dataSource.getConnection();

		
		return conn;
		
	}
}
