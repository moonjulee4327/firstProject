package Professor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class ProfessorDAO {
	private static ProfessorDAO professorDAO = new ProfessorDAO();

	private ProfessorDAO() {
	} // 싱글톤

	public static ProfessorDAO getInstance() {
		return professorDAO;
	}

	public int selectProfessor(ProfessorVO vo) {
		try {
			DriverManager.registerDriver(new OracleDriver());
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@1.212.157.146:1521:xe",
					"StudentPoral", "java");
			StringBuilder builder = new StringBuilder();
			builder.append(" SELECT              ");
			builder.append("     pro_nm          ");
			builder.append(" FROM                ");
			builder.append("     pro,            ");
			builder.append("     dep             ");
			builder.append(" WHERE               ");
			builder.append("     pro_dep = dep_no");

			String sql = builder.toString();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setObject(1, vo.getDepNm());
			statement.setObject(2, vo.getProDep());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

}
