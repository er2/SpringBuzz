package se.ericrie.springbuzz;

public abstract class DivisibilityRule implements Rule {

    protected final int n;

    protected DivisibilityRule(int n) {
        this.n = n;
    }

    @Override
    public boolean applies(int i) {
        return i % n == 0;
    }

    @Override
    public abstract String value();
}
