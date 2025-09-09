package Generic;

import java.util.*;

// Base
abstract class CourseType {
    String title;
    CourseType(String title) { this.title = title; }
    abstract void showDetails();
}

// Subtypes
class ExamCourse extends CourseType {
    ExamCourse(String title) { super(title); }
    void showDetails() { System.out.println("Exam-based Course: " + title); }
}
class AssignmentCourse extends CourseType {
    AssignmentCourse(String title) { super(title); }
    void showDetails() { System.out.println("Assignment-based Course: " + title); }
}
class ResearchCourse extends CourseType {
    ResearchCourse(String title) { super(title); }
    void showDetails() { System.out.println("Research-based Course: " + title); }
}

// Generic Course
class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();
    public void addCourse(T course) { courses.add(course); }
    public List<T> getCourses() { return courses; }

    // Wildcard method
    public static void displayCourses(List<? extends CourseType> list) {
        for (CourseType c : list) c.showDetails();
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        List<CourseType> courseList = new ArrayList<>();
        courseList.add(new ExamCourse("Mathematics"));
        courseList.add(new AssignmentCourse("Software Engineering"));
        courseList.add(new ResearchCourse("AI Research"));

        Course.displayCourses(courseList);
    }
}

