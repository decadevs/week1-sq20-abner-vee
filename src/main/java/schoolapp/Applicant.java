package schoolapp;

public class Applicant extends User{
    private String applicantNo;
    private int applicantAge;


    public Applicant(String name, String dateOfBirth, Gender gender, String applicantNo, int applicantAge) {
        super(name, dateOfBirth, gender);
        this.applicantNo = applicantNo;
        this.applicantAge = applicantAge;
    }

    public String getApplicantNo() {
        return applicantNo;
    }

    public void setApplicantNo(String applicantNo) {
        this.applicantNo = applicantNo;
    }
    public int getApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(int applicantAge) {
        this.applicantAge = applicantAge;
    }

}
