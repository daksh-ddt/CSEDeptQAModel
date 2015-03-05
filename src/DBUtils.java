import java.sql.SQLException;
import java.util.List;

/**
 * Interface for describing various DataBase Utilities
 * 
 * @author daksh_ddt
 *
 */
public interface DBUtils {
	
	public void write(Student student) throws SQLException;
	public void batchWrite(List<Student> studentList) throws SQLException;
	public void setConnection() throws ClassNotFoundException, SQLException;
}
