package se.lexicon.Data;


import se.lexicon.Data.Impl.ToDoItemDAO;
import se.lexicon.model.Person;
import se.lexicon.model.ToDoItem;
import se.lexicon.model.ToDoItem;
import se.lexicon.util.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ToDoItemDAOCollection implements ToDoItemDAO {

    List<ToDoItem> list = new ArrayList<>();


    @Override
    public ToDoItem create(ToDoItem todoItem) {
        if (todoItem == null) return null;

        String insertQuery = "INSERT INTO todo_item (title, description, deadline, done, assignee_id) VALUES (?, ?, ?, ?, ?)";

        try (
                Connection connection = Connector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery, PreparedStatement.RETURN_GENERATED_KEYS)
        ) {
            preparedStatement.setString(1, todoItem.getTitle());
            preparedStatement.setString(2, todoItem.getDescription());
            preparedStatement.setObject(3, todoItem.getDeadline());
            preparedStatement.setBoolean(4, todoItem.isDone());
            preparedStatement.setInt(5, todoItem.getAssigneeId());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("ToDoItem created successfully!");
            }

            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int generatedItemId = generatedKeys.getInt(1);
                    System.out.println("Generated ToDoItem ID = " + generatedItemId);
                    todoItem.setTodo_id(generatedItemId); // Set the generated ID to the ToDoItem object
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return todoItem;
    }


    @Override
    public ToDoItem findById(int id) {
        return list.stream()
                .filter(item -> item.getTodo_id() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Collection<ToDoItem> findAll() {
        return list;
    }

    @Override
    public Collection<ToDoItem> findByDoneStatus(boolean status) {
        return list.stream()
                .filter(item -> item.isDone() == status)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<ToDoItem> findByAssignee(int id) {
        return list.stream()
                .filter(item -> item.getAssigneeId() == id)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<ToDoItem> findByAssignee(Person assignee) {
        return list.stream()
                .filter(item -> item.getAssigneeId() == assignee.getPerson_id())
                .collect(Collectors.toList());
    }

    @Override
    public Collection<ToDoItem> findByUnassignedToDoItems() {
        return list.stream()
                .filter(item -> item.getAssigneeId() == 0) // Assuming 0 represents unassigned
                .collect(Collectors.toList());
    }

    @Override
    public ToDoItem update(ToDoItem toDoItem) {
        // Implement the update logic based on your requirements
        return null;
    }

    @Override
    public void deleteById(int id) {
        list.removeIf(item -> item.getTodo_id() == id);
    }
}
