package edu.redbasin.so.model;

/**
 * @author Rohan
 * 
 * Last modification: 2/1/13
 * 
 * Fields:
 * -> school: School
 * 
 * Methods:
 * -> Student(String name, boolean isMale, School school)
 *   -> Constructor setting all necessary attributes.
 */

public class Student extends Person {
    private final School school;
    public Student(String name, boolean isMale, School school) 
        { super(name, isMale, false);   this.school = school; }
}