package db_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MvcDAO {
	String url = "jdbc:mysql://localhost:3306/onop_db?characterEncoding=utf-8";
	// jdbc : 프로토콜 Java Database Connectivity의 약자 DB에 연결하겠다는 표준 선언
	//mysql :  서브프로토콜 , 접속하려는 데이터베이스 종류
	//onop_db : 접속할 데이터 베이스 명
	// ? (구분자): 추가옵션(파라미터)를 붙인가는 신호
	//characterEncoding=utf-8" : 한글깨짐 방지을 위한 인코딩 형식 설정
	
	String user = "onop";
	String pw = "123456";
	
	//Jdbc관련 객체 선언 하기
	Connection con = null;
	PreparedStatement  ptmt = null;
	ResultSet rs = null;
	
	
	
	public MvcDAO() {
		try {
			//1. JSBC 드라이버 로딩 , 자바와sql을 연결하는 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,user,pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	
	
	//연결 객체들을 종료하기위해 close 함수
	public void close() {
		if(rs != null) {try {rs.close();} catch(Exception e) {}}
		if(ptmt != null) {try {ptmt.close();} catch(Exception e) {}}
		if(con != null) {try {con.close();} catch(Exception e) {}}
	}





	public ArrayList<MvcDTO> list() {
		ArrayList<MvcDTO> res = new ArrayList<MvcDTO>();
		
		String sql = "select * from newexam1";
		
		try {
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				MvcDTO dto = new MvcDTO();
				
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				
				res.add(dto);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return res;
	}






	
	
	
}
