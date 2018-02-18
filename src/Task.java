
import java.time.LocalDateTime;
import java.util.LinkedList;
public class Task {

    private String content;
    private LocalDateTime taskBegin;
    private LocalDateTime taskEnd;
    private boolean done;
    private String timeString;

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
