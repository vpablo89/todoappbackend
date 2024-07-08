
package verapablodaniel.ToDoApp.persistence.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import verapablodaniel.ToDoApp.persistence.entitties.Task;
import verapablodaniel.ToDoApp.persistence.entitties.TaskStatus;


public interface TaskRepository extends JpaRepository<Task, Long>{
    
    public List<Task> findAllByTaskStatus (TaskStatus status);
    
    @Modifying
    @Query(value = "UPDATE TASK SET FINISHED=true WHERE ID=:id", nativeQuery = true)
    public void markTaskAsFinished(@Param("id") Long id);
    
    
}
