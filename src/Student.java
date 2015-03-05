import java.util.ArrayList;
import java.util.List;

/**
 * This class describes the schema of the StudentSurveyDB
 * 
 * @author daksh_ddt
 * 
 */
public class Student {

	private String name;
	private String rollNo;
	private String branch;
	private String year;
	private String programme;
	private String dateOfBirth;
	private String homeTown;
	private String areaOfInterest;
	private String favoriteSport;

	public Student(List<String> tokens) {
		ArrayList<String> tokenList = new ArrayList<String>(tokens);
		name = tokenList.get(1);
		rollNo = tokenList.get(2);
		branch = tokenList.get(3);
		year = tokenList.get(4);
		programme = tokenList.get(5);
		dateOfBirth = tokenList.get(6);
		homeTown = tokenList.get(7);
		areaOfInterest = tokenList.get(8);
		favoriteSport = tokenList.get(9);

	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public String getAreaOfInterest() {
		return areaOfInterest;
	}

	public void setAreaOfInterest(String areaOfInterest) {
		this.areaOfInterest = areaOfInterest;
	}

	public String getFavoriteSport() {
		return favoriteSport;
	}

	public void setFavoriteSport(String favoriteSport) {
		this.favoriteSport = favoriteSport;
	}

}
