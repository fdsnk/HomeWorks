package pro.sky.oldcourse2.coursework.task.tasks;

import pro.sky.oldcourse2.coursework.task.Task;

import java.time.LocalDateTime;

public class OneTimeTask extends Task {
    public OneTimeTask(String title, String description, boolean isWork, LocalDateTime dateTime) {
        super(title, description, isWork, dateTime);
    }
}
