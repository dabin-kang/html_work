package db_p;

import java.nio.channels.Selector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SignDAO {
	
	String Selector = null;
	String url = "jdbc:mysql://localhost:3306/onop_db? characterEnoding=utf-8";
	String user = "onop";
	String pw = "123456";
	 
	Connection con = null;
	PreparedStatement ptmt = null;
	ResultSet rs = null;
	
	
	public SignDAO() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList list() {
		String sql = "select*from sign";
		ArrayList<SignDTO> list = new ArrayList();
		
		try {
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				SignDTO dto = new SignDTO();
				
				dto.setPid(rs.getString("pid"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setPhone(rs.getInt("phonenum"));
				dto.setAdress(rs.getString("adress"));
				dto.setAt_day(rs.getDate("at_day"));
				list.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
	private ArrayList detail() {
		String sql = "select*from sign";
		ArrayList<SignDTO> list = new ArrayList();
		
		try {
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				SignDTO dto = new SignDTO();
				
				dto.setPid(rs.getString("pid"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setPhone(rs.getInt("phone"));
				dto.setAdress(rs.getString("adress"));
				dto.setAt_day(rs.getDate("at_day"));
				list.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public void cloce() {
		if( rs != null ) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
		if( ptmt != null ) {try {ptmt.close();} catch (SQLException e) {e.printStackTrace();}}
		if( con != null ) {try {con.close();} catch (SQLException e) {e.printStackTrace();}}
	}
	
}
