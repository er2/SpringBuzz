package se.ericrie.springbuzz;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;

@SpringBootApplication
public class SpringBuzzApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBuzzApplication.class, args);
    }

    @Value("${start:1}")
    int start;

    @Value("${end:100}")
    int end;

    @Inject
    RuleComposer ruleComposer;

    @Inject
    Outputter outputter;

    @PostConstruct
    public void run() {
        IntStream.rangeClosed(start, end)
                .mapToObj(ruleComposer::evaluate)
                .forEach(outputter::print);
    }

}
