import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	// DAO -> DataBase Access Object
	// ������ ���̽��� �����ϱ� ���� ��ü�� ���� �� �ִ� Ŭ����
	private Connection conn; // �ʵ忡 ���ִ� ���۷��� ������ �⺻������ null�� ���ִ�
	private PreparedStatement psmt;
	private ResultSet rs;

	// ����̹� �ε��� Ŀ�ؼ� ��ü�� �������� �޼ҵ�
	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			// ���� ó��
			// JDBC
			// 0. JDBC�� ����ϴ� ������Ʈ�� Driver ���� �ֱ�
			// 1.Driver �ε� (Oracle Driver) -> �����ε�
			// ���� ����ϴ� DBMS�� ����̹� �ε�

			// 2. Connection ����
			// Connection�� �����ϱ� ���ؼ���
			// DB�� ���Ӱ����� url, id, pw�� �ʿ��ϴ�

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// DataBase�� ������ �����ִ� �޼ҵ�
	private void close() {
		// 4. java�� DataBase���� ������ �����ش�
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

	// �α��� ���
	public String login(String id, String pw) {

		String nick = null;
		getConnection();

		try {
			// 3. SQL�� �ۼ� �� ����
			String sql = "select * from bigmember where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next()) { // Ŀ���� �̵��� �� �ִٸ� �̵��ϰ� true�� ��ȯ
				nick = rs.getString("nick");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // �����ص� finally �����ص� finally �湮
			close();
		}
		return nick;
	}

	// ȸ������ ����� �Ű��ּ���
	// �޼ҵ� �̸� -> join
	public int join(String id, String pw, String nick) {

		getConnection();
		int cnt = 0;

		try {
			// 3. SQL�� �ۼ� �� ����
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
			// 3. SQL�� �ۼ� �� ����
			// update ���̺�� set �÷��� = �ٲٰ� ���� �� where ����
			// executeQuery -> ���̺� �����Ͱ� ���� ���� ��
			// ResultSet �� ��ȯ
			// executeUpdate -> ���̺��� ������ ����� ��
			// int Ÿ������ ��ȯ -> ����� sql ���� ��
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

			// conn ��ü, psmt, rs
			// �ݾ��ִ� ���� -> rs -> psmt -> conn
			// id -> pbk �� ȸ���� �г�����
			// 'ŷ����'���� �ٲ� �ּ���!
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
			// 3. SQL�� �ۼ� �� ����
			String sql = "delete from bigmember where id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // �����ص� finally �����ص� finally �湮
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
		} finally { // �����ص� finally �����ص� finally �湮
			close();
		}
		return cnt;
	}

	
	public int deleteId(String removeId) {

		getConnection();
		int cnt = 0;

		try {
			// 3. SQL�� �ۼ� �� ����
			String sql = "delete from bigmember where id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, removeId);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // �����ص� finally �����ص� finally �湮
			close();
		}

		return cnt;

	}

}
