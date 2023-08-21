package se.ericrie.springbuzz;

public interface Rule {
    boolean applies(int n);
    String value();
}
