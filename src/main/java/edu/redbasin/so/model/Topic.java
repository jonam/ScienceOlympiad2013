package edu.redbasin.so.model;

public class Topic {
   private ProjectTeam projectTeam; 
   private Coach coach;
   private EventSupervisor eventSupervisor;
   private String topicName;
   private int projectTeamSize;
   private boolean isModel;
   private boolean isCheatSheetAllowed;
   private int maxCheatSheets;
   private boolean isBinderAllowed;
   private boolean isComputerAllowed;
   private boolean isCalculatorAllowed;

   public String getTopicName() {
     return topicName;
   }
   
   public int getProjectTeamSize() {
     return projectTeamSize;
   }
   
   public EventSupervisor getEventSupervisor() {
     return eventSupervisor;
   }
   
   public ProjectTeam getProjectTeam () {
     return projectTeam;
   }
   
   public Coach getCoach () {
     
    return coach;
    
   }
   public boolean isBinderAllowed () {
       return isBinderAllowed;
   }
}
