
package verapablodaniel.ToDoApp.mapper;

import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import verapablodaniel.ToDoApp.persistence.entitties.Task;
import verapablodaniel.ToDoApp.persistence.entitties.TaskStatus;
import verapablodaniel.ToDoApp.service.dto.TaskInDTO;

@Component
public class TaskInDTOToTask implements IMapper<TaskInDTO, Task> {

    @Override
    public Task map(TaskInDTO in) {

        Task task = new Task();
        task.setTitle(in.getTitle());
        task.setDescription(in.getDescription());
        task.setEta(in.getEta());
        task.setCreatedDate(LocalDateTime.now());
        task.setFinished(Boolean.FALSE);
        task.setTaskStatus(TaskStatus.ON_TIME);

        return task;     
        

    }
    
}
