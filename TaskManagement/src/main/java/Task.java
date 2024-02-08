import java.time.LocalDate;

public class Task implements Managable {

    private String title;
    private String description;
    private LocalDate dueDate;
    private TaskStatus status;

    public String getTitle() {
        return title;
    }


    public String getDescription() {
        return description;
    }


    public LocalDate getDueDate() {
        return dueDate;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(Status status) {

    }
}
