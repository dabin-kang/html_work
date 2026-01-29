package db_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import com.mysql.cj.QueryResult;

import jakarta.security.auth.message.callback.SecretKeyCallback.Request;

public class RegDAO {
	
	String url = "jdbc:mysql/localhost:3306/onop_db?character=utf-8";
	String user = "onop";
	String pw = "123456";
	
	Connection con = null;
	PreparedStatement prst = null;
	ResultSet rs = null;
	
	
	public RegDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void list() {
		ArrayList<RegDTO>dtolist = new ArrayList<>();
		String sql = "select * from  sign";
		 
			try {
				prst = con.prepareStatement(sql);
				rs = prst.executeQuery(); 
				
				while(rs.next()) {
					RegDTO dto =  new RegDTO();
				dto.setName(rs.getString("name"));
				dto.setPid(rs.getInt("pid"));
				dto.setAdress(rs.getString("adress"));
				dto.setEmail(rs.getString("email"));
				dto.setAt_day(rs.getDate("at_day"));
				dtolist.add(dto);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
	
	public void close() {
		if(rs != null) {
			try {rs.close();} catch (Exception e) {}
			try {prst.close();} catch (Exception e) {}
			try {con.close();} catch (Exception e) {}
		}
	}
	
	
}
