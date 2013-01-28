package edu.redbasin.so.model;

import java.util.List;

/**
 * Date created: 1/27/2013
 * 
 * Class Committee.
 * Committee is mutable. It has a list of parents.
 * 
 * Fields:
 * -> members: List<Parent>
 * -> team: Team
 * 
 * Methods:
 * -> getMembers(): List<Parent>
 *   -> Accessor for members.
 * -> getTeam(): Team
 *   -> Accessor for team.
 * -> addMember(Parent parent)
 *   -> Adds a committee member.
 * -> setCommittee(List<Parent> parents)
 *   -> Sets the committee to an inputted list.
 */
public class Committee {
    private List<Parent> members;
    private final Team team;
    Committee(Team team) { this.team = team; }
    public void addMember(Parent parent) { members.add(parent); }
    public void setCommittee(List<Parent> parents) { members = parents; }
    public List<Parent> getMembers() { return members; }
    public Team getTeam() { return team; }
}
