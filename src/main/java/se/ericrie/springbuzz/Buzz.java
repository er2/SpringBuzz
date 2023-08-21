package se.ericrie.springbuzz;

import jakarta.inject.Named;

@Named
public class Buzz extends DivisibilityRule{

    public Buzz() {
        super(5);
    }

    @Override
    public String value() {
        return "Buzz";
    }
}
