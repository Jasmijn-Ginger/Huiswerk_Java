import java.time.LocalDate;

public class Task implements Assignable {

    private Assignee assignee;
    private String title;
    private String description;
    private LocalDate dueDate;
    private TaskStatus status;

    Task(Assignee assignee){
        this.assignee = assignee;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = TaskStatus.OPEN;
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
        this.status = (TaskStatus) status;
    }

    @Override
    public void Assign(Assignee assignee) {
        this.assignee = assignee;
    }

    @Override
    public String getAssignee() {
        return assignee.getName();
    }
}
