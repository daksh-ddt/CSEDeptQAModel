import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This class implements the SQL queries for StudentSurveyDB
 * 
 * @author daksh_ddt
 * 
 */
public class DBAccessObject {

	private String DBdriver = "org.sqlite.JDBC";
	private String dbUrl = "jdbc:sqlite::resource:StudentSurveyDB.db";
	Connection localConnection;
	Statement statement;
	ResultSet resultSet;

	public DBAccessObject(String dBdriver, String dbUrl) {
		super();
		this.DBdriver = dBdriver;
		this.dbUrl = dbUrl;
	}

	public DBAccessObject() {

	}

	public void write(Student student) throws SQLException {
		String sqlQuery = formWriteQueryForStudent(student);
		statement.executeUpdate(sqlQuery);
	}

	private String formWriteQueryForStudent(Student student) {

		StringBuilder query = new StringBuilder();

		query.append("INSERT INTO student VALUES ( ");
		query.append(student.getName() + " , ");
		query.append(student.getRollNo() + " , ");
		query.append(student.getBranch() + " , ");
		query.append(student.getYear() + " , ");
		query.append(student.getProgramme() + " , ");
		query.append(student.getDateOfBirth() + " , ");
		query.append(student.getHomeTown() + " , ");
		query.append(student.getAreaOfInterest() + " , ");
		query.append(student.getFavoriteSport() + " , ");
		query.append(student.getProjectGuide() + " , ");
		query.append(student.getInternshipCompany() + " , ");
		query.append(student.getPlacementCompany() + " ) ");
		
		String sqlQuery = query.toString();
		return sqlQuery;
	}

	public void setConnectionForJDBC() throws ClassNotFoundException,
			SQLException {
		Class.forName(DBdriver);
		localConnection = DriverManager.getConnection(dbUrl, "", "");
		statement = localConnection.createStatement();
	}

}
