package todo.list.todo.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import todo.list.todo.model.Task;

public interface TaskRepository extends PagingAndSortingRepository<Task, String> {
}
