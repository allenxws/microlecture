package com.microlecture;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuwushun on 2016/11/7.
 */
public class DatabaseConfig {
	private static final String url = "jdbc:mysql://192.168.0.119:3306/%s?useUnicode=true&characterEncoding=utf8";
	private static final String database = "suerpay";
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String username = "writeuser";
	private static final String password = "writeuser";
	private static final String sqlPath = "/database";
	private static final String queryTableName = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = '%s';";
	private static final String showCreateSql = "show create table %s";

	public static void main(String[] args) {
		pull();
	}

	public static void pull() {
		List<String> tables = getAllTables();
		for (String table : tables) {
			String createSql = showCreateTable(table);
			String filePath = sqlPath + "/" + database + "/" + table + ".sql";
		}
	}

	public static String showCreateTable(String table) {
		String createSql = "";
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = getConnection(driver, String.format(url, database), username, password);
			statement = connection.createStatement();
			String querySql = String.format(showCreateSql, table);
			resultSet = statement.executeQuery(querySql);
			while (resultSet.next()) {
				createSql = resultSet.getString("create table");
			}
			return createSql;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			doClose(resultSet, statement, connection);
		}
		return createSql;
	}

	public static List<String> getAllTables() {
		List<String> tables = new ArrayList<String>();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = getConnection(driver, String.format(url, database), username, password);
			statement = connection.createStatement();
			String queryTableSql = String.format(queryTableName, database);
			resultSet = statement.executeQuery(queryTableSql);
			while (resultSet.next()) {
				String tableName = resultSet.getString("TABLE_NAME");
				tables.add(tableName);
			}
			return tables;
		} catch (ClassNotFoundException e) {
			System.out.println("找不到驱动程序类 ，加载驱动失败！");
			e.printStackTrace();
			return tables;
		} catch (SQLException se) {
			System.out.println("数据库连接失败！");
			se.printStackTrace();
			return tables;
		} finally {
			doClose(resultSet, statement, connection);
		}
	}

	public static ResultSet doQuery(String sql) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = getConnection(driver, String.format(url, database), username, password);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			return resultSet;
		} catch (ClassNotFoundException e) {
			System.out.println("找不到驱动程序类 ，加载驱动失败！");
			e.printStackTrace();
			return resultSet;
		} catch (SQLException se) {
			System.out.println("数据库连接失败！");
			se.printStackTrace();
			return resultSet;
		} finally {
			doClose(resultSet, statement, connection);
		}
	}

	public static void doClose(ResultSet resultSet, Statement statement, Connection connection) {
		closeResultSet(resultSet);
		closeStatement(statement);
		closeConnection(connection);
	}

	public static void doClose(Statement statement, Connection connection) {
		closeStatement(statement);
		closeConnection(connection);
	}

	public static void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void closeResultSet(ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void closeStatement(Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static Connection getConnection(String driver, String url, String username, String password) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Class.forName(driver);
		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
}
