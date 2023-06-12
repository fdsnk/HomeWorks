package pro.sky.oldcourse3.lesson2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    @GetMapping("*")
    public String showWorkAbility() {
        return "Приложение запущено";
    }
}
