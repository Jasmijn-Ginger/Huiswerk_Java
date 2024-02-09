import java.time.LocalDate;

public interface Managable {

    String getTitle();
    String getDescription();
    LocalDate getDueDate();
    String getStatus();
    void setStatus(Status status);


    public static boolean isOverdue(Managable managable){
        return LocalDate.now().isAfter(managable.getDueDate());
    }




}
