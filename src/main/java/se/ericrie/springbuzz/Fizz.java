package se.ericrie.springbuzz;

import jakarta.inject.Named;
import org.springframework.core.annotation.Order;

@Named
@Order(1)
public class Fizz extends DivisibilityRule {

    public Fizz() {
        super(3);
    }

    @Override
    public String value() {
        return "Fizz";
    }
}
