package pro.sky.course2.lesson13.junitcalculator.controller;

import pro.sky.course2.lesson13.junitcalculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RequestMapping("/calculator")
    @RestController
    public class Controller {
        private final CalculatorService calculatorService;

        public Controller(CalculatorService calculatorService) {
            this.calculatorService = calculatorService;
        }


        @GetMapping()
        public String hello() {
            return calculatorService.hello();
        }

        @GetMapping("/plus")
        public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
            return calculatorService.plus(num1, num2);
        }

        @GetMapping("/minus")
        public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
            return calculatorService.subtraction(num1, num2);
        }

        @GetMapping("/multiply")
        public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
            return calculatorService.multiply(num1, num2);
        }

        @GetMapping(path = "/divide")
        public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
            return calculatorService.divide(num1, num2);
        }
    }

