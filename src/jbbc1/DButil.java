package jbbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DButil {
      private static final String URL= "jdbc:mysql://localhost:3306/imooc";
      private static final String User="root";
      private static final String Password="7656329";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//加载驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		//获得数据库的连接
	Connection coon=DriverManager.getConnection(URL, User, Password);
		//通过数据库的连接操作数据库
//	 Statement stmt=coon.createStatement();
//	 ResultSet rt= stmt.executeQuery("select username from imooc_godness where id=1");
	String sql="select username from imooc_godness where id=?";
	PreparedStatement stmt= coon.prepareStatement(sql);
	stmt.setInt(1, 1);
	ResultSet rt=stmt.executeQuery();
	 while(rt.next()){
		 System.out.println(rt.getString("username"));
	 }
	 System.out.println("kong");
	}

}
