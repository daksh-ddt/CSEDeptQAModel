import java.sql.SQLException;
import java.util.List;

/**
 * DBUtil implementation for StudentSurveyDB
 * 
 * @author daksh_ddt
 *
 */
public class StudentDBUtils implements DBUtils {
	
	DBAccessObject dao;
	
	public StudentDBUtils(DBAccessObject dao) {
		super();
		this.dao = dao;
	}

	public StudentDBUtils() {
		dao =  new DBAccessObject();
	}

	public void write(Student student) throws SQLException {
		dao.write(student);
	}

	public void batchWrite(List<Student> studentList) throws SQLException {
		for (Student student : studentList) {
			write(student);
		}
	}

	public void setConnection() throws ClassNotFoundException, SQLException {
		dao.setConnectionForJDBC();
	}

}
