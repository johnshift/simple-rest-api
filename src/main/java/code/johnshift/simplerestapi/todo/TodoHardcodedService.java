package code.johnshift.simplerestapi.todo;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class TodoHardcodedService {

    private static List<Todo> todos = new ArrayList<>();
    private static int idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "user_1", "description_1", new Date(), false));
        todos.add(new Todo(++idCounter, "user_2", "description_2", new Date(), false));
        todos.add(new Todo(++idCounter, "user_3", "description_3", new Date(), false));
        todos.add(new Todo(++idCounter, "johnshift", "some description", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }

    public Todo save(Todo todo) {
        if (todo.getId() == -1) {
            todo.setId(++idCounter);
            todos.add(todo);
        } else {
            deleteById(todo.getId());
            todos.add(todo);
        }
        return todo;
    }

    public Todo deleteById(long id) {
        Todo todo = findById(id);
        if (todo == null) {
            return null;
        }

        if (todos.remove(todo)) {
            return todo;
        }

        return todo;
    }

    public Todo findById(long id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }

        return null;
    }

}
