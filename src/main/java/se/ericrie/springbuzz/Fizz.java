package se.ericrie.springbuzz;

import jakarta.inject.Named;

@Named
public class Fizz extends DivisibilityRule {

    public Fizz() {
        super(3);
    }

    @Override
    public String value() {
        return "Fizz";
    }
}
