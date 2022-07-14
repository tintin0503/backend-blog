package tintin.com.backendblog.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tintin.com.backendblog.dto.TodoDto;
import tintin.com.backendblog.entity.Todo;
import tintin.com.backendblog.repository.TodoRepository;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;
    @Autowired
    private ModelMapper modelMapper;


    public boolean save(TodoDto todo) {
        Todo todoEntity = Todo.builder()
                .title(todo.getTitle())
                .description(todo.getDescription())
                .priority(todo.getPriority())
                .build();
        todoRepository.save(todoEntity);
        return true;
    }

    public List<TodoDto> getAllByUser(Long userId) {
        //TODO implement
        return null;
    }

    public TodoDto getById(Long id) {
        //TODO implement
        return null;
    }

    public boolean delete(Long id) {

        return true;
    }

    public boolean update(TodoDto todoDto) {

        return true;
    }
}
