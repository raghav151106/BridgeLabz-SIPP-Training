package Generic;

import java.util.*;

// Base Role
abstract class JobRole {
    String candidateName;
    JobRole(String candidateName) { this.candidateName = candidateName; }
    abstract void showDetails();
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer(String name) { super(name); }
    void showDetails() { System.out.println("Software Engineer Candidate: " + candidateName); }
}
class DataScientist extends JobRole {
    DataScientist(String name) { super(name); }
    void showDetails() { System.out.println("Data Scientist Candidate: " + candidateName); }
}
class ProductManager extends JobRole {
    ProductManager(String name) { super(name); }
    void showDetails() { System.out.println("Product Manager Candidate: " + candidateName); }
}

// Generic Resume
class Resume<T extends JobRole> {
    private T jobRole;
    Resume(T jobRole) { this.jobRole = jobRole; }
    public T getJobRole() { return jobRole; }
}

// Wildcard method
class ResumeProcessor {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) role.showDetails();
    }
}

public class ResumeDemo {
    public static void main(String[] args) {
        List<JobRole> resumes = new ArrayList<>();
        resumes.add(new SoftwareEngineer("Alice"));
        resumes.add(new DataScientist("Bob"));
        resumes.add(new ProductManager("Charlie"));

        ResumeProcessor.processResumes(resumes);
    }
}
