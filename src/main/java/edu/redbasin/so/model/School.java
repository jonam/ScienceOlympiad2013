package edu.redbasin.so.model;

import java.util.List;

/**
 * @author Rohan
 * 
 * Date Created: 12/12/2012
 * Last Modification: 1/27/2013
 * 
 * Class School.
 * 
 * Fields:
 * -> name: String
 * -> students: List<Student>
 * 
 * Methods:
 * -> School(String name): constructor
 *    -> Set the school's name
 * -> getName(): String
 *    -> Accessor for name
 * -> getStudents: List<Student>
 *    -> Accessor for students
 * -> addStudent(List<Student> st)
 *   -> Adds a student to list of students.
 * -> addStudents(List<Student> sts)
 *   -> Appends a list of students to list.
 * -> setStudents(List<Student> sts)
 *   -> Sets the list attribute to the original list.
 */

public class School {
    private final String name;
    private List<Student> students;
    // Constructor:
    public School(String name) { this.name = name; }
    // Accessor Methods:
    public String getName() { return name; }
    public List<Student> getStudents() { return students; }
    // Mutator Methods:
    public void addStudent(Student st) { students.add(st); }
    public void addStudents(List<Student> sts) { students.addAll(sts); }
    public void setStudents(List<Student> sts) { students = sts; }
}