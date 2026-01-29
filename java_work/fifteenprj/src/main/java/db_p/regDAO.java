package db_p;

import java.nio.channels.Selector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.MysqlConnection;

public class regDAO {
		String url = "jdbc:mysql://localhost:3306/onop_db? characterEnoding=utf-8";
		String id = "onop";
		String pw = "123456";
	
		Connection con = null;
		PreparedStatement prst = null;
		ResultSet rs = null;
		
	public regDAO() {
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver");	
		 con = DriverManager.getConnection(url,id,pw) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<regDTO> list() {
		ArrayList<regDTO> dtolist = new ArrayList<>();
		String sql = "select * from sign";
		
		try {
			prst = con.prepareStatement(sql);
			rs = prst.executeQuery();
			
			while(rs.next()) {
				regDTO dto = new regDTO();
				dto.setAdress(rs.getString("adress"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setPhone(rs.getInt("phonenum"));
				dto.setPid(rs.getString("pid"));
				dto.setAt_day(rs.getDate("at_day"));
				dtolist.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dtolist;
	}
	
}
