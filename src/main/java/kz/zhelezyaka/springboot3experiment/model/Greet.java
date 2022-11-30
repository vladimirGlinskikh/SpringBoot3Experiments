package kz.zhelezyaka.springboot3experiment.model;

import java.util.List;

public class Greet {
    public record GreetResponse(String greet,
                                List<String> programmingLanguages,
                                List<Persons.Person> person) {
    }
}
