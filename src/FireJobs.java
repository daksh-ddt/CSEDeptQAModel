import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * This class contains the code for calling various jobs
 * 
 * @author daksh_ddt
 * 
 */

public class FireJobs {
	/*
	 * Replace the fileName with the desired file
	 */
	private static String fileName = "Files/csvFile1.csv";

	public static void main(String[] args) throws SQLException,
			ClassNotFoundException, IOException {

		fireJobForCreatingStudentRecordsFromCSVFileIntoDB();

	}

	/**
	 * The method reads the student records from csv file and insert 
	 * them into StudentSurveyDB
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	private static void fireJobForCreatingStudentRecordsFromCSVFileIntoDB()
			throws IOException, ClassNotFoundException, SQLException {

		GetCSVFileContents getCSVFileContents = new GetCSVFileContents();
		List<Student> studentRecords = getCSVFileContents
				.getFileContentAsStudentObjectList(fileName);
		StudentDBUtils dbUtil = new StudentDBUtils();
		dbUtil.setConnection();
		dbUtil.batchWrite(studentRecords);

	}

}
