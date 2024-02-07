package schoolapp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        School sch = new School(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(),"Decagon", "Edo state");
        StudentClass studClass = new StudentClass("Java", 10);
        sch.setClasses(List.of(studClass));
        Course mth = new Course("Maths", 5);
        Course eng = new Course("English", 3);
        Staff stf1 = new Staff("Benjamin", "02-23-2000", Gender.MALE, "290864","English", 30000, StaffType.TEACHER);
        Staff stf2 = new Staff("Anthony", "02-23-1982", Gender.MALE, "27677584","", 60000, StaffType.PRINCIPAL);
        Staff stf3 = new Staff("Goodness", "02-23-1994", Gender.FEMALE, "2767874","", 15000, StaffType.NON_ACADEMIC_STAFF);
        Student student1 = new Student("Faith", "03-05-2001", Gender.FEMALE, 24,"365856YU", new ArrayList<>(),StudentStatus.PROMOTED);
        Student student2 = new Student("Samuel", "03-05-2001", Gender.MALE, 24,"36575786VA", new ArrayList<>(),StudentStatus.PROMOTED);
        Student student3 = new Student("Richard", "03-05-2001", Gender.MALE, 24,"367856LV", new ArrayList<>(),StudentStatus.PROMOTED);
        Applicant app = new Applicant("Esther", "09-05-2004", Gender.FEMALE, "7376484", 20);
        sch.setApplicants(List.of(app));
        sch.setStudents(List.of(student1,student2,student3));
        sch.setStaff(List.of(stf1,stf2,stf3));
        stf1.teach();
        stf2.teach();
        stf3.teach();
        System.out.println("number of students before admitting " + sch.getStudents().size());
        stf1.admitStudents(List.of(app), sch);
        stf2.admitStudents(List.of(app), sch);
        stf3.admitStudents(List.of(app), sch);
        System.out.println("number of students after admitting " + sch.getStudents().size());

        System.out.println("number of students before expulsion " + sch.getStudents().size());
        stf1.expelStudent(student1, sch);
        stf2.expelStudent(student2, sch);
        stf3.expelStudent(student3, sch);
        System.out.println("number of students after expulsion " + sch.getStudents().size());

        System.out.println("number of courses student1 is taking before taking another " + student1.getListOfCourses().size());
        student1.takeACourse(mth);
        System.out.println("number of courses student1 is taking after taking a course" + student1.getListOfCourses().size());
        student2.takeACourse(eng);
        student3.takeACourse(mth);

    }
}
