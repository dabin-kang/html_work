package db_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.MysqlConnection;

public class RegDAO {
	
	String url =  "jdbc:mysql://localhost:3306/onop_db?characterEncoding=utf-8" ; // url 어느 db에 설정할지, localhost 부분 미흡, encoding 미작성
	String user = "onop";
	String pw = "123456";
	
	Connection con = null;
	PreparedStatement prst = null;
	ResultSet rs = null;
	
	public RegDAO() { // 전부다
	 	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<RegDTO> list() {
		String sql = "select * from sign"; // mysql 에서 전부 가져오기
		ArrayList<RegDTO> dtolist = new ArrayList<>();
		
		try {
			prst = con.prepareStatement(sql);
			rs = prst.executeQuery();
			
			while(rs.next()) {
				RegDTO dto = new RegDTO();
				
				dto.setPid(rs.getInt("pid"));
				dto.setName(rs.getString("name"));
				dtolist.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dtolist;
	}
	

	public void close() {// if문 접근 실패
		if( rs != null) {try {rs.close();} catch (SQLException e) {}}
		if( prst != null) {try {prst.close();} catch (SQLException e) {}}
		if( con != null) {try {con.close();} catch (SQLException e) {}}
		
	}
}
