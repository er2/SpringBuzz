package se.ericrie.springbuzz;

import jakarta.inject.Named;
import org.springframework.core.annotation.Order;

@Named
@Order(2)
public class Buzz extends DivisibilityRule {

    public Buzz() {
        super(5);
    }

    @Override
    public String value() {
        return "Buzz";
    }
}
