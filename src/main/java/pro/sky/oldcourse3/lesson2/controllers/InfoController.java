package pro.sky.oldcourse3.lesson2.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/info")
public class InfoController {
    @GetMapping("/student")
    public String getStudent() {
        return "Maksim Fedoseenko";
    }

    @GetMapping("/name")
    public String getName() {
        return "SkyPro Homeworks";
    }

    @GetMapping("/date")
    public LocalDate getDate() {
        return LocalDate.of(2022, 12, 30);
    }

    @GetMapping("/description")
    public String getDescription() {
        return "Этот проект содержит все домашние задания, которые я выполнил!";
    }
}