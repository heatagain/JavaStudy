import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	// DAO -> DataBase Access Object
	// 데이터 베이스에 접근하기 위한 객체를 만들 수 있는 클래스
	private Connection conn; // 필드에 들어가있는 레퍼런스 변수는 기본적으로 null이 들어가있다
	private PreparedStatement psmt;
	private ResultSet rs;

	// 드라이버 로딩과 커넥션 객체를 가져오는 메소드
	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			// 예외 처리
			// JDBC
			// 0. JDBC를 사용하는 프로젝트에 Driver 파일 넣기
			// 1.Driver 로딩 (Oracle Driver) -> 동적로딩
			// 내가 사용하는 DBMS의 드라이버 로딩

			// 2. Connection 연결
			// Connection을 연결하기 위해서는
			// DB에 접속가능한 url, id, pw가 필요하다

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// DataBase와 연결을 끊어주는 메소드
	private void close() {
		// 4. java와 DataBase간의 연결을 끊어준다
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 로그인 기능
	public String login(String id, String pw) {

		String nick = null;
		getConnection();

		try {
			// 3. SQL문 작성 및 실행
			String sql = "select * from bigmember where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next()) { // 커서를 이동할 수 있다면 이동하고 true를 반환
				nick = rs.getString("nick");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 성공해도 finally 실패해도 finally 방문
			close();
		}
		return nick;
	}

	// 회원가입 기능을 옮겨주세요
	// 메소드 이름 -> join
	public int join(String id, String pw, String nick) {

		getConnection();
		int cnt = 0;

		try {
			// 3. SQL문 작성 및 실행
			String sql = "insert into bigmember values(?, ?, ?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;

	}

	public int update(String nick) {

		getConnection();
		int cnt = 0;

		try {
			// 3. SQL문 작성 및 실행
			// update 테이블명 set 컬럼명 = 바꾸고 싶은 값 where 조건
			// executeQuery -> 테이블에 데이터가 변함 없을 때
			// ResultSet 로 반환
			// executeUpdate -> 테이블의 내용이 변경될 때
			// int 타입으로 반환 -> 실행된 sql 문의 수
			String sql = "update bigmember set nick = heat where id=?";

			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, id);
			psmt.setString(1, nick);
//			psmt.setString(3, pw);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// 4. finally

			// conn 객체, psmt, rs
			// 닫아주는 순서 -> rs -> psmt -> conn
			// id -> pbk 인 회원의 닉네임을
			// '킹병관'으로 바꿔 주세요!
		} finally {
			close();
		}
		return cnt;
	}

	public ArrayList<MemberDTO> selectAll() {

		ArrayList<MemberDTO> arraylist = new ArrayList<MemberDTO>();
		getConnection();

		String sql = "select * from bigmember";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String nick = rs.getString("nick");
				MemberDTO m = new MemberDTO(id, pw, nick);
				arraylist.add(m);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return arraylist;
	}

	public int delete(String id, String pw) {

		getConnection();
		int cnt = 0;

		try {
			// 3. SQL문 작성 및 실행
			String sql = "delete from bigmember where id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 성공해도 finally 실패해도 finally 방문
			close();
		}

		return cnt;
	}

	public int adminUpdate(String change_id, String change_nick) {

		getConnection();
		int cnt = 0;

		try {
			String sql = "update bigmember set nick = ? where id=?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, change_nick);
			psmt.setString(2, change_id);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 성공해도 finally 실패해도 finally 방문
			close();
		}
		return cnt;
	}

	
	public int deleteId(String removeId) {

		getConnection();
		int cnt = 0;

		try {
			// 3. SQL문 작성 및 실행
			String sql = "delete from bigmember where id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, removeId);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 성공해도 finally 실패해도 finally 방문
			close();
		}

		return cnt;

	}

}
