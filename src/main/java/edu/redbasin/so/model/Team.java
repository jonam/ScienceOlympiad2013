package edu.redbasin.so.model;

import java.util.List;

/**
 * @author Rohan
 * 
 * Date created: 12/12/2012
 * Last modification: 1/27/2013
 * 
 * Class Team.
 * 
 * Fields:
 * -> builder: Team.Builder
 * 
 * Methods:
 * -> getName(): String
 *    -> Accessor for name
 * -> getCommittee(): Committee
 *    -> Accessor for committee
 * -> getProjectTeams(): List<ProjectTeam>
 *    -> Accessor for projectTeams
 * -> getSchools(): List<School>
 *    -> Accessor for schools
 * -> getStudents(): List<Student>
 *    -> Accessor for students
 * 
 * Classes:
 * -> Builder
 *   Fields:
 *   -> name: String
 *   -> students: List<Student>
 *   -> committee: Committee
 *   -> projectTeams: List<projectTeam>
 *   -> schools: List<School>
 *   
 *   Methods:
 *   -> getName(): String
 *     -> Accessor for name.
 *   -> getCommittee(): Committee
 *     -> Accessor for committee.
 *   -> getProjectTeams(): List<ProjectTeam>
 *     -> Accessor for projectTeams.
 *   -> getSchools(): List<School>
 *     -> Accessor for schools.
 *   -> getStudents(): List<Student>
 *     -> Accessor for students.
 *   -> setName(String name)
 *     -> Mutator for name.
 *   -> addStudent(Student st)
 *     -> Adds a student to list.
 *   -> addStudents(List<Student> sts)
 *     -> Appends a list of students to current list.
 *   -> setCommittee(Committee committee)
 *     -> Mutator for committee.
 *   -> addProjectTeam(ProjectTeam pT)
 *     -> Adds a projectTeam.
 *   -> addProjectTeams(List<ProjecTeam> pTs)
 *     -> Appends a list of projectTeams.
 *   -> setSchools(List<School> schools)
 *     -> Mutator for schools.
 * 
 */

public class Team {
    private final Builder builder;
    public Team(Builder builder) { this.builder = builder; }
    // Accessors:
    public String getName() { return builder.getName(); }
    public Committee getCommittee() { return builder.getCommittee(); }
    public List<ProjectTeam> getProjectTeams() { return builder.getProjectTeams(); }
    public List<Student> getStudents() { return builder.getStudents(); }
    public List<School> getSchools() { return builder.schools; } 
    /** 
     * A Builder Class.
     * This class is mutable.
     * Each immutable team is made by passing a builder.
     * Then, the builder is set as a final attribute. 
     * The only methods accessible by Team are the accessors.
     */
    public class Builder {
        // Fields:
        private String name;
        private List<Student> students;
        private Committee committee;
        private List<ProjectTeam> projectTeams;
        private List<School> schools;
        // Accessors:
        public String getName() { return name; }
        public List<Student> getStudents() { return students; }
        public Committee getCommittee() { return committee; }
        public List<ProjectTeam> getProjectTeams() { return projectTeams; }
        public List<School> getSchools() { return schools; }
        // Mutators:
        public void setName(String name) { this.name = name; }
        public void addStudent(Student st) { students.add(st); }
        public void addStudents(List<Student> sts) { students.addAll(sts); }
        public void addCommitteeMember(Parent parent) 
            { committee.addMember(parent); }
        public void addProjectTeam(ProjectTeam pT) throws Exception {
            outer: for (Student st : pT.getStudents()) {
                for(School sch : schools)
                    if (sch.getStudents().contains(st)) continue outer;
                throw new Exception("All projectTeams must contain students from"
                        + " a specified school.");
            }
        }
        public void addProjectTeams(List<ProjectTeam> pTs) throws Exception 
            { for (ProjectTeam pT: pTs) addProjectTeam(pT); }
        public void setSchools(List<School> schools) { this.schools = schools; }
    }
}