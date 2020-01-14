public class Task implements Priority{
  private String name;
  private int priority;
  private boolean isComplete;

  public Task(String name, int priority){
    this.name = name;
    this.priority = priority;
    isComplete = false;
  }

  public void setPriority(int priorityLevel){
    priority = priorityLevel;
  }

  public int getPriority(){
    return priority;
  }

  public void doTask(){
    System.out.println("Doing Task... working...");
    isComplete = true;
    this.setPriority(-1);
  }

  public String toString(){
    return "Task: " + name + "\nPriority: " + getPriority();
  }

}
