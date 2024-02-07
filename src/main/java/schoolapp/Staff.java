package schoolapp;

import java.util.ArrayList;
import java.util.List;

public class Staff extends User {
    private String staffId;
    private String subject;
    private double salary;

    private StaffType staffType;

    public Staff(String name, String dateOfBirth, Gender gender, String staffId, String subject, double salary, StaffType staffType) {
        super(name, dateOfBirth, gender);
        this.staffId = staffId;
        this.subject = subject;
        this.salary = salary;
        this.staffType = staffType;
    }

    public void teach() {
        if (staffType.equals(StaffType.TEACHER)) {
            System.out.println(getName() + " is teaching");
        } else {
            System.out.println("You are not a teacher");
        }
    }

    public void expelStudent( Student student, School school) {
        if (staffType.equals(StaffType.PRINCIPAL)) {
            System.out.println(getName() + " is expelling " + student.getName());
            System.out.println(student.getName() + " is expelled");
            List<Student> listOfStudents = school.getStudents();
            school.setStudents(new ArrayList<>());
            listOfStudents.remove(student);
            school.setStudents(listOfStudents);
        } else {
            System.out.println("You are not a principal, you can't expel");
        }
    }

    public void admitStudents(List<Applicant> listOfApplicants, School school) {
        if (staffType.equals(StaffType.PRINCIPAL)) {
            List<Student> newlyAdmitted = new ArrayList<>();
            for (Applicant applicant : listOfApplicants) {
                if (applicant.getApplicantAge() >= 18 && applicant.getApplicantAge() < 60) {
                    System.out.println(getName() + " is admitting " + applicant.getName());
                    System.out.println(applicant.getName() + " has been admitted");
                    Student student = new Student(applicant.getName(), applicant.getDateOfBirth(),applicant.getGender(), 23,"576756", new ArrayList<>(),StudentStatus.NEWLY_ADMITTED);
                  newlyAdmitted.add(student);
                } else {
                    System.out.println("You are not eligible for admission. Try elsewhere");
                }
            }
            List<Student> existingStudents = school.getStudents();
            newlyAdmitted.addAll(existingStudents);
            school.setStudents(newlyAdmitted);
        } else {
            System.out.println("You can't give admission");
        }


    }
}