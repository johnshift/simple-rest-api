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

}
