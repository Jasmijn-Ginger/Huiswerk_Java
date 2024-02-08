import java.time.LocalDate;

public class Project implements Managable{
    public String getTitle() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public LocalDate getDueDate() {
        return null;
    }

    public String getStatus() {
        return null;
    }

    public void setStatus(Status status) {

    }

    List<Task> tasks;
    void  addTask(Task task){}
    void removeTask(Task task){}
    List<Task> getTasks();


}
