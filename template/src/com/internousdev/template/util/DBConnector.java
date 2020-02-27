package com.internousdev.template.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName="com.mysql.jdbc.Driver";
	//MySQL接続に必要な情報の設定

	private static String url="jdbc:mysql://localhost/template";
	//接続先のデータベース名（urlの一番最後）を設定

	private static String user="root";
	private static String password="mysql";

	public Connection getConnection() {
		Connection con=null;

		try {
			Class.forName(driverName);
			con=(Connection)DriverManager.getConnection(url,user,password);
			//接続情報から自分のPCにインストールされているMySQLへ接続する準備が整う

		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			//クラスが見つからないときの例外処理

		}catch(SQLException e) {
			e.printStackTrace();
			//SQLでの例外処理

		}
		return con;
		//MySQLサーバーに接続した結果をメソッドの呼び出し元に渡す

	}

}
