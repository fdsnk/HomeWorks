package pro.sky.oldcourse2.coursework.task.tasks;

import pro.sky.oldcourse2.coursework.task.Repeatable;
import pro.sky.oldcourse2.coursework.task.Task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyTask extends Task implements Repeatable {
    public DailyTask(String title, String description, boolean isWork, LocalDateTime dateTime) {
        super(title, description, isWork, dateTime);
    }

    public boolean checkIfSuitable(LocalDate date) {
        return date.equals(dateTime.toLocalDate()) || date.isAfter(dateTime.toLocalDate());
    }
}
