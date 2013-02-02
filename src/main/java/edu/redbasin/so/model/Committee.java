package edu.redbasin.so.model;

import java.util.List;

/**
 * Date created: 1/27/2013 by Rohan
 * 
 * Class Committee.
 * Committee is mutable. It has a list of parents.
 * 
 * Fields:
 * -> members: List<Parent>
 * 
 * Methods:
 * -> getMembers(): List<Parent>
 *   -> Accessor for members.
 * -> addMember(Parent parent)
 *   -> Adds a committee member.
 * -> addMembers(List<Parent> parent)
 *   -> Adds list of committee members.
 * -> setCommittee(List<Parent> parents)
 *   -> Sets the committee to an inputted list.
 */
public class Committee {
    private List<Parent> members;
    public void addMember(Parent parent) { members.add(parent); }
    public void addMembers(List<Parent> parents) { members.addAll(parents); }
    public void setCommittee(List<Parent> parents) { members = parents; }
    public List<Parent> getMembers() { return members; }
}
