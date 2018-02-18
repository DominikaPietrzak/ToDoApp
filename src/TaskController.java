import java.util.LinkedList;
import java.time.LocalDateTime;
import java.util.Scanner;
public class TaskController {

    TaskList taskList = new TaskList();
    Task task = new Task();
    LocalDateTime time;
    //String timeString = time.toString();
    Scanner input = new Scanner(System.in);

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

    public void takeDayEnd(){

        System.out.println("Podaj dzień zakończenia tasku");
        int dayEnd =  input.nextInt();
        task.setDayEnd(dayEnd);
    }

    public void takeMonthEnd(){
        System.out.println("Podaj miesiąc zakończenia tasku");
        int monthEnd = input.nextInt();
        task.setMonthEnd(monthEnd);

    }

    public void takeYearEnd(){

        System.out.println("Podaj rok zakończenia tasku");
        int yearEnd = input.nextInt();
        task.setYearEnd(yearEnd);
    }

    public void takeHourEnd(){
        System.out.println("Podaj godzinę zakończenia tasku");
        int hourEnd = input.nextInt();
        task.setHourEnd(hourEnd);
    }

    public void takeMinutesEnd(){
        System.out.println("Podaj minuty zakończenia tasku");
        int minutesEnd = input.nextInt();
        task.setMinutesEnd(minutesEnd);
    }

    public void howManyTimeLeft(){

    }

    public void saveContent(){
        System.out.println("Podaj treśc");
        String content = input.nextLine();
        task.setContent(content);
    }

    public void checkAsDone(){

        System.out.println();
    }

}
