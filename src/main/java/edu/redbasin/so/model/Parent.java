package edu.redbasin.so.model;

import java.util.List;
/**
 * @author Rohan
 * 
 * Last modified: 2/1/13
 * 
 * Class for parent.
 * 
 * Fields:
 * -> children: List<Student>
 * 
 * Methods:
 * -> Parent(String name, boolean isMale, List<Student> children)
 *   -> Constructor given all necessary attributes
 * -> getChildren(): List<Student>
 *   -> Accessor for children attribute
 */

public class Parent extends Person {
    private final List<Student> children;
    // Constructor:
    public Parent(String name, boolean isMale, List<Student> children) {
        super(name, isMale, true);
        this.children = children;
    }
    // Accessor:
    public List<Student> getChildren() { return children; }
}