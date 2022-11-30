package kz.zhelezyaka.springboot3experiment.controller;

import kz.zhelezyaka.springboot3experiment.model.Greet.GreetResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static kz.zhelezyaka.springboot3experiment.model.Persons.*;

@RestController
public class Controllers {

    @GetMapping("/greet")
    public GreetResponse greet() {
        return new GreetResponse("Hey guru Spring!",
                List.of("Java", "SQL", "JavaScript"),
                List.of(new Person("Vladimir", "Glinskikh"),
                        new Person("Svetlana", "Marchenko")));
    }

    @GetMapping("/person")
    public Person person() {
        return new Person("Nikolay", "Romanov");
    }
}
