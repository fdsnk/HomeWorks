package skypro.java.course2.coursework;

import skypro.java.course2.coursework.task.Repeatable;
import skypro.java.course2.coursework.task.Task;

import java.time.LocalDate;
import java.util.*;

public class Calendar {
    private final Map<Integer, Task> mapOfTasks;

    public Calendar() {
        mapOfTasks = new HashMap<>();
    }

    public void addTask(Task task) {
        mapOfTasks.put(task.getId(), task);
    }

    public boolean removeTask(int id) {
        return mapOfTasks.remove(id) != null;
    }

    public List<Task> getTasksForOneDay(LocalDate date) {
        List<Task> result = new ArrayList<>();
        for (Map.Entry<Integer, Task> entry : mapOfTasks.entrySet()) {
            Task task = entry.getValue();
            if (task instanceof Repeatable && ((Repeatable) task).checkIfSuitable(date)
                    || !(task instanceof Repeatable) && task.getDateTime().toLocalDate().equals(date)) {
                result.add(task);
            }
        }
        result.sort(Comparator.comparing(Task::getDateTime));
        return result;
    }
}
