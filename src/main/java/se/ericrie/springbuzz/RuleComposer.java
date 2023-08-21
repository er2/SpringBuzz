package se.ericrie.springbuzz;

import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;
import java.util.stream.Collectors;

@Named
public class RuleComposer {

    @Inject
    List<Rule> rules;

    public String evaluate(int n) {
        String fromRules = rules.stream()
                .filter(rule -> rule.applies(n))
                .map(Rule::value)
                .collect(Collectors.joining());
        if (fromRules.isEmpty())
            return n + "";
        else
            return fromRules;
    }

}
