
import java.time.LocalDateTime;
import java.util.LinkedList;
public class Task {

    private String content;
    private LocalDateTime taskBegin;
    private LocalDateTime taskEnd;
    private boolean done;
    private String timeString;
    private int dayEnd;
    private int yearEnd;
    private int monthEnd;
    private int hourEnd;
    private int minutesEnd;

    public int getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(int dayEnd) {
        this.dayEnd = dayEnd;
    }

    public int getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(int yearEnd) {
        this.yearEnd = yearEnd;
    }

    public int getMonthEnd() {
        return monthEnd;
    }

    public void setMonthEnd(int monthEnd) {
        this.monthEnd = monthEnd;
    }

    public int getHourEnd() {
        return hourEnd;
    }

    public void setHourEnd(int hourEnd) {
        this.hourEnd = hourEnd;
    }

    public int getMinutesEnd() {
        return minutesEnd;
    }

    public void setMinutesEnd(int minutesEnd) {
        this.minutesEnd = minutesEnd;
    }

    public boolean isDone() {

        return done;
    }

    public String getTimeString() {
        return timeString;
    }

    public void setTimeString(String timeString) {
        this.timeString = timeString;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTaskBegin() {
        return taskBegin;
    }

    public void setTaskBegin(LocalDateTime taskBegin) {
        this.taskBegin = taskBegin;
    }

    public LocalDateTime getTaskEnd() {
        return taskEnd;
    }

    public void setTaskEnd(LocalDateTime taskEnd) {
        this.taskEnd = taskEnd;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
