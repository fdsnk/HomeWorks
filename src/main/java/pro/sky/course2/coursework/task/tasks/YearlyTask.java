package pro.sky.course2.coursework.task.tasks;

import pro.sky.course2.coursework.task.Repeatable;
import pro.sky.course2.coursework.task.Task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task implements Repeatable {
    public YearlyTask(String title, String description, boolean isWork, LocalDateTime dateTime) {
        super(title, description, isWork, dateTime);
    }

    public boolean checkIfSuitable(LocalDate date) {
        return date.getDayOfMonth() == dateTime.getDayOfMonth()
                && date.getMonth() == dateTime.getMonth()
                && (date.equals(dateTime.toLocalDate()) || date.isAfter(dateTime.toLocalDate()));
    }
}
