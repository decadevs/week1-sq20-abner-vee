package schoolapp;

import java.util.List;

public class Student extends User{
    private String regNo;
    private List<Course> listOfCourses;
    private StudentStatus status;
    private int age;

    public Student(String name, String dateOfBirth,  Gender gender, int age, String regNo, List<Course> listOfCourses, StudentStatus status) {
        super(name, dateOfBirth, gender);
        this.age = age;
        this.listOfCourses= listOfCourses;
        this.status = status;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public List<Course> getListOfCourses() {
        return listOfCourses;
    }

    public void setListOfCourses(List<Course> listOfCourses) {
        this.listOfCourses = listOfCourses;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setStatus(StudentStatus status) {

        this.status = status;
    }


    public void takeACourse(Course course){
        listOfCourses.add(course);
        System.out.println(getName() + " is taking " + course.getName() + " course");
    }
}
