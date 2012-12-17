package edu.redbasin.so.model;

/**
 * This is the requirements for a specific topic like "Dynamic Planet"
 * @author tanisha
 */
public class Topic {
    
   private ProjectTeam projectTeam; 
   private Coach coach;
   private EventSupervisor eventSupervisor;
   private String topicName;
   private int maxProjectTeamSize;
   
   // This means the number of Students in a ProjectTeam. 
   private boolean isModel;
   
   // Whether the project specifies "build something" or "study something"
   private boolean isCheatSheetAllowed;
   
   private int maxCheatSheets;
   
   // How many cheat sheets are allowed for this "TOPIC"
   private boolean isBinderAllowed;
   private boolean isComputerAllowed;
   private boolean isCalculatorAllowed;

   public String getTopicName() {
     return topicName;
   }
   
   public int getMaxProjectTeamSize() {
     return maxProjectTeamSize;
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
   public boolean isComputerAllowed () {
       return isComputerAllowed;
       
   }
       
   
   public boolean isModel () {
       return isModel;
       
   }
   public int maxCheatSheets () {
       return maxCheatSheets;
       
   }
   public boolean isCalculatorAllowed () {
       return isCalculatorAllowed; 
       
   }
   public boolean isCheatSheetAllowed () {
       return isCheatSheetAllowed;
   }
   
}

   
   
   
