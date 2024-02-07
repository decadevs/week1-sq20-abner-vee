package schoolapp;

import java.util.List;

public class School {
    private List<Student> students;
    private   List<Staff> staff;
    private  List<Applicant> applicants;
    private  List<StudentClass>  classes;

    private String name;
    private  String address;

    public School(List<Student> students, List<Staff> staff, List<Applicant> applicants, List<StudentClass> classes, String name, String address) {
        this.students = students;
        this.staff = staff;
        this.applicants = applicants;
        this.classes = classes;
        this.name = name;
        this.address = address;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public List<Applicant> getApplicants() {
        return applicants;
    }

    public void setApplicants(List<Applicant> applicants) {
        this.applicants = applicants;
    }

    public List<StudentClass> getClasses() {
        return classes;
    }

    public void setClasses(List<StudentClass> classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
