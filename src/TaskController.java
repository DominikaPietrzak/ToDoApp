import java.util.LinkedList;
import java.time.LocalDateTime;

public class TaskController {

    TaskList taskList = new TaskList();
    Task task = new Task();
    LocalDateTime time;
    //String timeString = time.toString();

    public void saveDate() {
        LocalDateTime time = LocalDateTime.now();
        task.setTaskBegin(time);
  }
    public void dateToString(){

    LocalDateTime timeToConvert = task.getTaskBegin();
    String timeString = timeToConvert.toString();
    task.setTimeString(timeString);
    }

    public void showBeginTime(){
        System.out.println(task.getTimeString());
    }


}
