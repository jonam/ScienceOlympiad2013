package edu.redbasin.so.model;

import java.util.List;

/**
 * This is the ProjectTeam for a specific topic like "Disease Detectives". 
 * One ProjectTeam is uniquely assigned to a topic.
 * 
 * @author tanisha
 */
public class ProjectTeam {
  
  /**
   * This is the topic instance for this ProjectTeam. 
   * Topic must be assigned a ProjectTeam. 
   */
  private Topic topic;
  
  /** 
   * Coach assigned to min (1) ProjectTeam. 
   */
  private Coach coach;
  
  
  /** 
   * Student corresponds to one team, but also corresponds at least 1 ProjectTeam.
   */
  private List<Student> students;
  
  /** 
   * An Event Supervisor uniquely corresponds to a topic.
   * In other words, once an event supervisor is assigned a topic,
   * they can not supervise any other topic during this exact period of time.
   */ 
  private EventSupervisor eventSupervisor; 
  
  
  /**
   * An Event Supervisor uniquely corresponds to a topic.
   * In other words, once an event supervisor is assigned a topic,
   * they can not supervise any other topic during this exact period of time. 
   * @return 
   */
  public EventSupervisor getEventSupervisor () {
    return eventSupervisor;
  }
  
  /**
   * Get a topic.
   * 
   * @return Topic 
   */
  public Topic getTopic () {
    return topic;   // one project team can be assigned to a single topic
  } 
  
  /**
   * Get a Coach object.
   * 
   * @return Coach
   */
  public Coach getCoach () {
    return coach; 
  }
  
  /**
   * Get all the students connected to this topic.
   * 
   * 
   * @return Student[]
   */
  public List <Student> getStudents () {
    return students;
  } 
   
  public void addStudent (Student student) {
      if (topic.getMaxProjectTeamSize() == students.size()) {
          System.out.println("reached max team size");
          return;
      }
      students.add (student);
  } 
  
  
}