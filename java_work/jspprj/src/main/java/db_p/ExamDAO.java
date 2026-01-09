package db_p;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExamDAO {
	String url = "jdbc:mysql://localhost:3306/onop_db?characterEncoding=utf-8";
	String user = "onop";
	String pw = "123456";
	
	//jdbc 관련 객체 선언 , 공간을 생성하는 부분
	Connection con = null;	//DB 연결 객체
	PreparedStatement ptmt = null;//SQL 실행 객체
	ResultSet rs = null; // SELECT 결과를 담는 객체
	
	
	//실제 연결 실행하는 부분
	public ExamDAO() {
		try {
			//1. driver 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. 연결 객체 생성 
			//객체를 생성하고 DB에 실제 연결을 맺는다
			con = DriverManager.getConnection(url,user,pw);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//전체 목록조회
	public ArrayList<ExamDTO> list(){
		ArrayList<ExamDTO> res = new ArrayList<ExamDTO>();
		//<ExamDTO> : 제네릭 타입 매개변수 ArrayList가 어떤 타입의 객체를 저장할지지정하는 역할,<ExamDTO>타입만 허락한다
		
		
		// 모든 데이터를 가져오는 SQL
		String sql = "select * from exam";
		try {//3. 쿼리문 실행하기 위한 객체
			ptmt = con.prepareStatement(sql);
			
			//4.쿼리문 실행
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				ExamDTO dto = new ExamDTO();
				dto.setId(rs.getInt("id"));
				dto.setHakgi(rs.getInt("hakgi"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setName(rs.getString("name"));
				dto.setPid(rs.getString("pid"));
				dto.setFf(rs.getString("ff"));
				dto.setPw(rs.getString("pw"));
				dto.setRegDate(rs.getTimestamp("reg_date"));
				res.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		return res;
	}
	
	public ExamDTO detail(int id){
		ExamDTO dto = null;
		
		String sql = "select * from exam where id = ?";
		try {//3. 쿼리문 실행하기 위한 객체
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, id);
			
			//4.쿼리문 실행
			rs = ptmt.executeQuery();
			
			if(rs.next()) {
				dto = new ExamDTO();
				
				dto.setId(rs.getInt("id"));
				dto.setHakgi(rs.getInt("hakgi"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setName(rs.getString("name"));
				dto.setPid(rs.getString("pid"));
				dto.setFf(rs.getString("ff"));
				dto.setPw(rs.getString("pw"));
				dto.setRegDate(rs.getTimestamp("reg_date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		return dto;
	}
	
	
	// sql에 자료 넣기
	public void  insert (ExamDTO dto){
		
		String sql = "insert into exam "
				+"(hakgi,name,pid,kor,eng,mat,pw,ff,reg_date)"
				+"values "
				+"(?,?,?,?,?,?,?,?,now())";
				
				;
		try {//3. 쿼리문 실행하기 위한 객체
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, dto.getHakgi());
			ptmt.setString(2,dto.getName());
			ptmt.setString(3,dto.getPid());
			ptmt.setInt(4, dto.getKor());
			ptmt.setInt(5, dto.getEng());
			ptmt.setInt(6, dto.getMat());
			ptmt.setString(7, dto.getPw());
			ptmt.setString(8, dto.getFf());
			
			//4.쿼리문 실행
			ptmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
public void  delete (ExamDTO dto){
		
		String sql = "delete from exam where id = ? ";
				
				
				;
		try {//3. 쿼리문 실행하기 위한 객체
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, dto.getId());
			
			
			//4.쿼리문 실행
			ptmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}


public void  modify (ExamDTO dto){
	
	String sql = "update exam set "
			+"hakgi = ?,name = ?,pid = ?,kor = ?,eng = ?,mat = ?,pw = ?"
			+"where id = ?";
			
			
	try {//3. 쿼리문 실행하기 위한 객체
		ptmt = con.prepareStatement(sql);
		ptmt.setInt(1, dto.getHakgi());
		ptmt.setString(2,dto.getName());
		ptmt.setString(3,dto.getPid());
		ptmt.setInt(4, dto.getKor());
		ptmt.setInt(5, dto.getEng());
		ptmt.setInt(6, dto.getMat());
		ptmt.setString(7, dto.getPw());
		ptmt.setInt(8, dto.getId());
		
		//4.쿼리문 실행
		ptmt.executeUpdate();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		close();
	}
}
	
	public void close() {
		//6. 연결 객체 종료
		if(rs != null) {try {rs.close();} catch(SQLException e) {}}
		if(ptmt != null) {try {ptmt.close();} catch(SQLException e) {}}
		if(con != null) {try {con.close();} catch(SQLException e) {}}
	}
}
