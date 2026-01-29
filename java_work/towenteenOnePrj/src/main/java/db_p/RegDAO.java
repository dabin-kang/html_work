package db_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegDAO {
	
	String uri = "jdbc:mysql://localhost:3306/onop_db?characterEnoding=utf-8";
	String user = "onop";
	String pw = "123456";
	
	Connection con = null;
	PreparedStatement prst = null;
	ResultSet rs = null;
	
	
	public RegDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(uri,user,pw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public ArrayList<RegDTO>list(){
		ArrayList<RegDTO> res = new ArrayList<RegDTO>();
		
		String sql = "select * from sign";
				
		try {
			prst = con.prepareStatement(sql);
			rs = prst.executeQuery();
			
			while(rs.next()) {
				RegDTO dto = new RegDTO();
				dto.setPid(rs.getInt("pid"));
				dto.setName(rs.getString("name"));
				res.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	
	public RegDTO detail(){
		RegDTO dto = null;
		
		String sql = "select * from sign where id =?";	
		try {
			prst = con.prepareStatement(sql);
			rs = prst.executeQuery();
			
			if(rs.next()) {
				dto = new RegDTO();
				dto.setPid(rs.getInt("pid"));
				dto.setName(rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	
	
	
	public void close() {
		if(rs != null) {try {rs.close();} catch (Exception e) {}}		
		if(prst != null) {try {prst.close();} catch (Exception e) {}}		
		if(con != null) {try {con.close();} catch (Exception e) {}}		

	}
}

