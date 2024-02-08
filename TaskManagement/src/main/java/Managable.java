import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Managable {

    String getTitle();
    String getDescription();
    LocalDate getDueDate();
    String getStatus();
    void setStatus(Status status);




}
