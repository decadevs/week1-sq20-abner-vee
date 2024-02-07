package schoolapp;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {
    School sch;
    Staff stf1;
    Staff stf2;
    Staff stf3;
    Student student1;
    Student student2;
    Student student3;
    Applicant app;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        sch = new School(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Decagon", "Edo state");
        StudentClass studClass = new StudentClass("Java", 10);
        sch.setClasses(List.of(studClass));
        Course mth = new Course("Maths", 5);
        Course eng = new Course("English", 3);
        stf1 = new Staff("Benjamin", "02-23-2000", Gender.MALE, "290864", "English", 30000, StaffType.TEACHER);
        stf2 = new Staff("Anthony", "02-23-1982", Gender.MALE, "27677584", "", 60000, StaffType.PRINCIPAL);
        stf3 = new Staff("Goodness", "02-23-1994", Gender.FEMALE, "2767874", "", 15000, StaffType.NON_ACADEMIC_STAFF);
        student1 = new Student("Faith", "03-05-2001", Gender.FEMALE, 24, "365856YU", new ArrayList<>(), StudentStatus.PROMOTED);
        student2 = new Student("Samuel", "03-05-2001", Gender.MALE, 24, "36575786VA", new ArrayList<>(), StudentStatus.PROMOTED);
        student3 = new Student("Richard", "03-05-2001", Gender.MALE, 24, "367856LV", new ArrayList<>(), StudentStatus.PROMOTED);
        app = new Applicant("Esther", "09-05-2004", Gender.FEMALE, "7376484", 20);
        sch.setApplicants(List.of(app));
        sch.setStudents(List.of(student1, student2, student3));
        sch.setStaff(List.of(stf1, stf2, stf3));

    }
    @org.junit.jupiter.api.Test
    void teach() {
    }
    @org.junit.jupiter.api.Test
    void expelStudent() {
        System.out.println("size = " + sch.getStudents().size());
        assertEquals( 3, sch.getStudents().size());
        stf2.expelStudent(student1, sch);

        assertEquals( 2, sch.getStudents().size());
    }

    @org.junit.jupiter.api.Test
    void admitStudents() {
        assertEquals( 3, sch.getStudents().size());
        stf2.admitStudents(List.of(app), sch);

        assertEquals( 4, sch.getStudents().size());
    }
}