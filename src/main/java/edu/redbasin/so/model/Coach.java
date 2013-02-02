package edu.redbasin.so.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Last Modification: 1/27/2013 by Rohan
 * Class Coach.
 * 
 * Fields:
 * -> projectTeams: List<ProjectTeam>
 * Methods:
 * -> Coach(String name, boolean isMale)
 *   -> Constructor method.
 * -> addProjectTeam(ProjectTeam pT)
 *   -> Add projectTeam to coach.
 * -> addProjectTeams(List<ProjectTeam> pTs)
 *   -> Add list of projectTeams to coach.
 * -> setProjectTeams(List<ProjectTeam> pTs)
 *   -> Sets list of project teams to pTs
 * -> getStudents(): List<Student>
 *   -> Returns list of all students being coached by Coach
 */
public class Coach extends Person {
    private List<ProjectTeam> projectTeams;
    // Constructor:
    public Coach(String name, boolean isMale) { super(name, isMale, true); }
    public void addProjectTeam(ProjectTeam pT) { projectTeams.add(pT); }
    public void addProjectTeams(List<ProjectTeam> pTs) 
        { projectTeams.addAll(pTs); }
    public void setProjectTeams(List<ProjectTeam> pTs) { projectTeams = pTs; }
    // Accessor:
    public List<Student> getStudents() {
        List<Student> li = new ArrayList<Student>();
        for (ProjectTeam pT: projectTeams)
            for (Student st: pT.getStudents())
                if (!li.contains(st)) li.add(st);
        return li;
    }
}