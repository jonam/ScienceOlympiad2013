package edu.redbasin.so.model;

import java.util.Arrays;

/**
 * @author Rohan
 * 
 * Team class
 * 
 * Fields:
 * -> name: String
 * -> committee: Committee
 * -> projectTeams: ProjectTeam[]
 * -> students: Student[]
 * -> schools: School[]
 * 
 * Methods:
 * -> Team(String name, Committee committee, ProjectTeam[] projectTeams,
 *      Student[] students, School[] schools): Constructor
 * -> Team(String name, Committee committee, ProjectTeam[] projectTeams,
 *      Student[] students, School school): Constructor
 *      -> Constructor given a single school rather than an array
 * -> getName(): String
 *    -> Accessor for name
 * -> getCommittee(): Committee
 *    -> Accessor for committee
 * -> getProjectTeams(): ProjectTeam[]
 *    -> Accessor for projectTeams
 * -> getSchools: School[]
 *    -> Accessor for schools
 * -> getStudents: Student[]
 *    -> Accessor for students
 * 
 */

class Committee{}

public class Team {
    /** A class representing the team .
     * Class designed to be immutable. */
    private final String name;
    private final Committee committee;
    private final ProjectTeam[] projectTeams;
    private final Student[] students;
    private final School[] schools;
    // Constructors:
    public Team(String name, Committee committee, ProjectTeam[] projectTeams,
            Student[] students, School[] schools) throws Exception {
        // Constructor setting all fields
        this.name = name;
        this.committee = committee;
        // Check that all students come from one of the schools:
        // Add code here
        this.students = students;
        this.schools = schools;
        // Check that project teams only include valid students
        
// Add code here
        this.projectTeams = projectTeams;
    }
    public Team(String name, Committee committee, ProjectTeam[] projectTeams,
            Student[] students, School school) throws Exception {
        // Constructor given single school rather than array
        School[] array = { school };
        this.name = name;
        this.committee = committee;
        // Check that all students come from one of the schools:
        for (Student st: students)
            if (Arrays.binarySearch(school.getStudents(), 0, school.getStudents().length, st, null) == -1)
                throw new Exception("All students must be from school.");            
        this.students = students;
        this.schools = array;
        // Check that project teams only include valid students
        // Add code here
        this.projectTeams = projectTeams;
    }
    // Accessors:
    public String getName() { return name; }
    public Committee getCommitee() { return committee; }
    public ProjectTeam[] getProjectTeams() { return projectTeams; }
    public Student[] getStudents() { return students; }
    public School[] getSchools() { return schools; }
}