import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project implements Managable{

    private String title;
    private String description;
    private LocalDate dueDate;
    private ProjectStatus status;
    List<Task> tasks = new ArrayList<>();

    Project(String title, String description, LocalDate dueDate){
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = ProjectStatus.UPCOMING;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public String getStatus() {
        return status.toString();
    }

    @Override
    public void setStatus(Status status) {
        this.status = (ProjectStatus) status;
    }



    public void addTask(Task task){
        tasks.add(task);
    }
    public void removeTask(Task task){
        tasks.remove(task);
    }
    List<Task> getTasks(){
        return tasks;
    }


}
