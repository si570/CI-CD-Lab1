package atu.ie.lab1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // Added base path for clarity
public class RequestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello " + name + "!"; // Added space before name
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age) {
        return "Name: " + name + ", Age: " + age;
    }

    @GetMapping("/person")
    public Person getPerson() {
        return new Person("Subhan", 21);
    }
    @GetMapping("/calculate")
    public CalculationResult calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operation) {

        double total;
        switch (operation.toLowerCase()) {
            case "add":
                total = num1 + num2;
                return new CalculationResult("add", String.valueOf(total));
            case "subtract":
                total = num1 - num2;
                return new CalculationResult("subtract", String.valueOf(total));
            case "multiply":
                total = num1 * num2;
                return new CalculationResult("multiply", String.valueOf(total));
            case "divide":
                if (num2 == 0) {
                    return new CalculationResult("divide", "Error: Cannot divide by zero");
                }
                total = num1 / num2;
                return new CalculationResult("divide", String.valueOf(total));
            default:
                return new CalculationResult(operation, "Error: Unsupported operation");
        }
    }
}

