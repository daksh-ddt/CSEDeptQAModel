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
	private String projectGuide;
	private String internshipCompany;
	private String placementCompany;

	public Student(List<String> tokens) {
		ArrayList<String> tokenList = new ArrayList<String>(tokens);
		//for(String token:tokenList)
		//	System.out.println(token);
		//The value of token[0] contains the timestamp and should be rejected
		//The value of token[1] contains the emailId and should be rejected 
		name = tokenList.get(2);
		rollNo = tokenList.get(3);
		branch = tokenList.get(4);
		year = tokenList.get(5);
		programme = tokenList.get(6);
		dateOfBirth = tokenList.get(7);
		homeTown = tokenList.get(8);
		areaOfInterest = tokenList.get(9);
		favoriteSport = tokenList.get(10);
		projectGuide = tokenList.get(11);
		internshipCompany = tokenList.get(12);
		placementCompany = tokenList.get(13);

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

	public String getProjectGuide() {
		return projectGuide;
	}

	public void setProjectGuide(String projectGuide) {
		this.projectGuide = projectGuide;
	}

	public String getInternshipCompany() {
		return internshipCompany;
	}

	public void setInternshipCompany(String internshipCompany) {
		this.internshipCompany = internshipCompany;
	}

	public String getPlacementCompany() {
		return placementCompany;
	}

	public void setPlacementCompany(String placementCompany) {
		this.placementCompany = placementCompany;
	}


}
