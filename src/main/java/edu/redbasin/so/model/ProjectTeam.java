package edu.redbasin.so.model;

/**
 * 
 * @author tanisha
 */
public class ProjectTeam {
  private Topic topic;
  private Coach coach; 
  private Student[] students;
  private EventSupervisor eventSupervisor;
  public EventSupervisor getEventSupervisor () {
    return eventSupervisor;
  }
  
  public Topic getTopic () {
    return topic;
  } 
  public Coach getCoach () {
    return coach; 
  }
  public Student[] getStudents () {
    
    return students;
  } 
}