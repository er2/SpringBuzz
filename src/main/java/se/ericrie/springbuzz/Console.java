package se.ericrie.springbuzz;

import jakarta.inject.Named;

@Named
public class Console implements Outputter{
    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
