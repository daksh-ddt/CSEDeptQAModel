import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * This class is used to parse the csv file and create student record list
 * 
 * @author daksh_ddt
 * 
 */
public class GetCSVFileContents {

	private String DELIMITER = ",";

	public List<Student> getFileContentAsStudentObjectList(String fileName)
			throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(fileName));
		return getStudentObjectsFromCSVFile(br);
	}

	private List<Student> getStudentObjectsFromCSVFile(BufferedReader br)
			throws IOException {

		List<Student> studentList = new ArrayList<Student>();
		String line;
		StringUtils stringHelper = new StringUtils();
		while ((line = br.readLine()) != null) {
			List<String> tokens = getStringTokens(line);
			List<String> processedTokens = stringHelper
					.getBatchQuotedStrings(tokens);
			Student newStudent = new Student(processedTokens);
			studentList.add(newStudent);
		}
		return studentList;
	}

	private List<String> getStringTokens(String line) {
		
		//modify the line here
		StringTokenizer st = new StringTokenizer(line, DELIMITER);
		List<String> tokensList = getTokensFromTokenizer(st);
		/*
		 * This is the backup code in case the upper hack does not work 
		 */
		//TODO comment our the below code
		if(line.charAt(line.length()-1)==',' && line.charAt(line.length()-2)==',' && line.charAt(line.length()-2)==','){
			tokensList.add("NULL");
			tokensList.add("NULL");
			tokensList.add("NULL");
		}
		else if(line.charAt(line.length()-1)==',' && line.charAt(line.length()-2)==','){
			tokensList.add("NULL");
			tokensList.add("NULL");
		}
		else if(line.charAt(line.length()-1)==',' && line.charAt(line.length()-2)!=','){
			tokensList.add("NULL");
		}
		return tokensList;
	}

	private List<String> getTokensFromTokenizer(StringTokenizer st) {
		List<String> stringTokens = new ArrayList<String>();
		while (st.hasMoreTokens()) {
			stringTokens.add(st.nextToken());
		}
		return stringTokens;
	}

}
