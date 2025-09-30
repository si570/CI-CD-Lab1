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
}

