package edu.redbasin.so.model;

/**
 * @author Rohan
 * 
 * Date Created: 12/12/2012
 * 
 * School class
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
    /** A class representing the school. */
    private final String name; // Name of school
    private final Student[] students; // List of students
    // Constructor:
    public School(String name, Student[] students) { 
        // Constructor setting school's name and students
        this.name = name; 
        this.students = students;
    }
    // Accessor Methods:
    public String getName() { return name; }
    public Student[] getStudents() {  return students; }
}