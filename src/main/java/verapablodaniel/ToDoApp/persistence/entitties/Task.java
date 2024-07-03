
package verapablodaniel.ToDoApp.persistence.entitties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Data;

@Entity
@Data
public class Task {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime eta;
    private Boolean finished;
    private TaskStatus taskStatus;
}
