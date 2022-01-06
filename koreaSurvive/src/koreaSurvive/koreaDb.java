package koreaSurvive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class koreaDb {
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int loginCnt = 0;
	
	public void login(String id, String pw) {
		try { 
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);

			String sql = "select * from bigmember where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("로그인 성공");
				System.out.println(rs.getString("nick") + "님 환영합니다!");
				System.out.println();
				
			}else {
				System.out.println("로그인 실패");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { 
			try {
				if(rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if(conn != null) {
					conn.close();
					loginCnt++;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	public void join(String id, String pw, String nick) {
		
		try { 
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);

			String sql = "insert into bigmember values(?, ?, ?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);

			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("회원가입 성공!!!");
			} else {
				System.out.println("회원가입 실패...");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { 
			try {
				if (psmt != null) {
					psmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}
}
