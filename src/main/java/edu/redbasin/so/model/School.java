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
 * -> students: Student[]
 * 
 * Methods:
 * -> School(String name, Student[] students): constructor
 *    -> Set the school's name and array of students
 * -> getName(): String
 *    -> Accessor for name
 * -> getStudents: Student[]
 *    -> Accessor for students
 * 
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
}